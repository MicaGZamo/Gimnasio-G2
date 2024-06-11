package AccesoData;

import Entidades.Membresia;
import Entidades.Socio;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class MembresiaData {

    private Connection con = null;

    public MembresiaData() {
        con = Conexion.getConexion();
        
    }

    public void guardarMembresia(Membresia membresia) {
        String sql = "INSERT INTO `membresias` (`id-socio`, `CantidadPases`, `fecha-inicio`, `fecha-fin`, `costo-membresia`, `estado-m`) VALUES (?, ?, ?, ?, ?, ?)";

         try {
            PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setInt(1, membresia.getSocio().getIdSocio());
            ps.setInt(2, membresia.getCantPases());
            ps.setDate(3, Date.valueOf(membresia.getFechaInicio()));
            ps.setDate(4, Date.valueOf(membresia.getFechaFin()));
            ps.setDouble(5, membresia.getPrecioMembresia());
            ps.setBoolean(6, membresia.isEstado());
            int rowsInserted = ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                membresia.setIdMembresia(rs.getInt(1)); 
                JOptionPane.showMessageDialog(null, "Membresía cargada correctamente");
            }

            rs.close();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al guardar la membresía");
            System.out.println("error " + ex.getMessage());
            ex.printStackTrace();
        }

    }
    
    public List<Membresia> buscarPorSocio(Socio socio){ //Ramiro
        List<Membresia> lista = new ArrayList<>();
        Membresia membresia1 = null;
        String sql ="SELECT * FROM `membresias` WHERE `id-socio`=?";
        boolean flag=false;
        //PreparedStatement ps = null;
        
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, socio.getIdSocio());
            ResultSet rs = ps.executeQuery(); //-->busqueda////////////
            
            while(rs.next()){
                flag=true;
                membresia1 = new Membresia ();
                membresia1.setIdMembresia(rs.getInt("id-membresia"));
                membresia1.setSocio(socio);
                membresia1.setCantPases(rs.getInt("CantidadPases"));
                membresia1.setFechaInicio(rs.getDate("fecha-inicio").toLocalDate());
                membresia1.setFechaFin(rs.getDate("fecha-fin").toLocalDate());
                membresia1.setPrecioMembresia(rs.getDouble("costo-membresia"));
                membresia1.setEstado(rs.getBoolean("estado-m"));
                lista.add(membresia1);
            }
            if(!flag){
            JOptionPane.showMessageDialog(null, "no se encontro la socio");
            }
            ps.close();
            
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Membresia ");
            System.out.println("error " + ex.getMessage());
            ex.printStackTrace();
        }
        
    return lista;}
    
    public List<Membresia> listarMembresiasActivas(){ //Nadia
        List<Membresia> lista = new ArrayList<>();
        String sql= "SELECT membresias.*, socios.`id-socio` , socios.nombre, socios.apellido " 
                     +"FROM `membresias`, `socios` "
                     +"WHERE `estado-m`=1 "
                     +"AND membresias.`id-socio`= socios.`id-socio`";
         try{
            PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery();
             
             while(rs.next()){
                Membresia membresia1 = new Membresia ();
                membresia1.setIdMembresia(rs.getInt("id-membresia"));
                Socio socio= new Socio();
                socio.setIdSocio(rs.getInt("id-socio"));
                socio.setNombre(rs.getNString("nombre"));
                socio.setApellido(rs.getNString("apellido"));
                membresia1.setSocio(socio);
                membresia1.setCantPases(rs.getInt("CantidadPases"));
                membresia1.setFechaInicio(rs.getDate("fecha-inicio").toLocalDate());
                membresia1.setFechaFin(rs.getDate("fecha-fin").toLocalDate());
                membresia1.setPrecioMembresia(rs.getDouble("costo-membresia"));
                membresia1.setEstado(rs.getBoolean("estado-m"));
                lista.add(membresia1); 
             }
            
         }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Membresia ");
            System.out.println("error " + ex.getMessage());
            ex.printStackTrace();
         }
                return lista;} 
    
    public List<Membresia> listarMembresiasInactivas(){ //Nadia 
         List<Membresia> lista = new ArrayList<>();
        String sql= "SELECT membresias.*, socios.`id-socio` , socios.nombre, socios.apellido " 
                     +"FROM `membresias`, `socios` "
                     +"WHERE `estado-m`=0 "
                     +"AND membresias.`id-socio`= socios.`id-socio`";
         try{
            PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery();
             
             while(rs.next()){
                Membresia membresia1 = new Membresia ();
                membresia1.setIdMembresia(rs.getInt("id-membresia"));
                Socio socio= new Socio();
                socio.setIdSocio(rs.getInt("id-socio"));
                socio.setNombre(rs.getNString("nombre"));
                socio.setApellido(rs.getNString("apellido"));
                membresia1.setSocio(socio);
                membresia1.setCantPases(rs.getInt("CantidadPases"));
                membresia1.setFechaInicio(rs.getDate("fecha-inicio").toLocalDate());
                membresia1.setFechaFin(rs.getDate("fecha-fin").toLocalDate());
                membresia1.setPrecioMembresia(rs.getDouble("costo-membresia"));
                membresia1.setEstado(rs.getBoolean("estado-m"));
                lista.add(membresia1); 
             }
            
         }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Membresia ");
            System.out.println("error " + ex.getMessage());
            ex.printStackTrace();
         }
    
    return lista;} 
    
    
    public void modificarMembresia(Membresia membresia){ //Ramiro   update
//        String sql = "UPDATE `entrenadores` "
//                   + "SET `dni`=?,`nombre`=?,`apellido`=?,`especialidad`=?,`estado-en`=? "
//                   + "WHERE `id-entrenador`=? ";
          String sql = "UPDATE `membresias` "
                     + "SET `id-socio`=?,`CantidadPases`=?,`fecha-inicio`=?,`fecha-fin`=?,`costo-membresia`=?,`estado-m`=? "
                     + "WHERE `id-membresia`=?";

        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, membresia.getSocio().getIdSocio());
            ps.setInt(2, membresia.getCantPases());
            ps.setDate(3, Date.valueOf(membresia.getFechaInicio()) ); // de LocalDate a Date
            ps.setDate(4,Date.valueOf(membresia.getFechaFin()) ); // de LocalDate a Date
            ps.setDouble(5, membresia.getPrecioMembresia());
            ps.setBoolean(6, membresia.isEstado());
            ps.setInt(7, membresia.getIdMembresia());
            
            int exito = ps.executeUpdate();
            
            if (exito==1) { // pregunta si tiene datos
                JOptionPane.showMessageDialog(null, "Datos de membresia actualizados.");
            }
            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar datos de la membresia.");
            System.out.println("error " + e.getMessage());
            e.printStackTrace();
        }

        
    }
    
    public void darBajaMembresia(Membresia membresia){ // Mica  estado = 0
        
     try{
     String sql = "UPDATE `membresias` SET `estado-m` = ? WHERE `id-socio` = ?";
     PreparedStatement ps = con.prepareStatement(sql);
     ps.setInt(1,0);
     ps.setInt(2, membresia.getSocio().getIdSocio());
     
      int fila = ps.executeUpdate(); // Ejecuta la sentencia
      
        if(fila>0){  // n° de filas afectadas, si es menor a 0, no se ejecutó la sentencia
            JOptionPane.showMessageDialog(null, "Se dio de baja la membresia con id: "+ membresia.getSocio().getIdSocio());
        }else{
            JOptionPane.showMessageDialog(null, "No se pudo dar de baja la membresia con id: "+membresia.getSocio().getIdSocio());
        }
        ps.close();
      
       } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error con la tabla membresia.");
            System.out.println("error " + e.getMessage());
            e.printStackTrace();
        }   
        
        
    }
}
