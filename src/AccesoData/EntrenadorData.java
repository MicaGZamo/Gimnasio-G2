
package AccesoData;

//import com.sun.jdi.connect.spi.Connection;
import Entidades.Entrenador;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class EntrenadorData {
    private Connection con = null;

    public EntrenadorData() {
        con = Conexion.getConexion();
    }
    
    public void guardarEntrenador(Entrenador entrenador){
        String sql = "INSERT INTO `entrenadores`(`dni`, `nombre`, `apellido`, `especialidad`, `estado-en`) VALUES (?,?,?,?,?)";
        try{
            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);// generamos los PreparedStatement con las setencias SQL
            ps.setString(1,entrenador.getDniE());
            ps.setString(2,entrenador.getNombreE());
            ps.setString(3,entrenador.getApellidoE());
            ps.setString(4, entrenador.getEspecialidad());
            ps.setBoolean(5, entrenador.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            
            if(rs.next()){ // pregunta si tiene datos
                entrenador.setIdEntrenador(rs.getInt("id-entrenador"));
                JOptionPane.showMessageDialog(null,"Entrenador cargado correctamente");
            }
            ps.close();
            
            
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Entrenador ");
            System.out.println("error " + ex.getMessage());
            ex.printStackTrace();
        }
    }
    
    public Entrenador buscarPorDni(String dni){
        Entrenador entrenador = null;
        String sql = "SELECT `id-entrenador`, `dni`, `nombre`, `apellido`, `especialidad`, `estado-en` FROM `entrenadores` WHERE dni=?"; // no importa el estado
        //String sql = "SELECT `id-entrenador`, `dni`, `nombre`, `apellido`, `especialidad`, `estado-en` FROM `entrenadores` WHERE dni=? AND `estado-en`=1"; // solo los activos
        PreparedStatement ps = null;
       
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, dni);
            ResultSet rs = ps.executeQuery(); //busqueda////////////
            
            if(rs.next()){
            entrenador = new Entrenador ();
            entrenador.setIdEntrenador(rs.getInt("id-entrenador"));
            entrenador.setDniE(rs.getString("dni"));
            entrenador.setNombreE(rs.getString("nombre"));
            entrenador.setApellidoE(rs.getString("apellido"));
            entrenador.setEspecialidad(rs.getString("especialidad"));
            //entrenador.setEstado(true);
            entrenador.setEstado(rs.getBoolean("estado-en"));
            }else{
            JOptionPane.showMessageDialog(null, "No se encontró el entrenador");
            }
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Entrenador ");
            System.out.println("error " + ex.getMessage());
            ex.printStackTrace();
        }
    
    return entrenador;}
    
    public Entrenador buscarPorNombreYApellido(String nom, String ape){
        Entrenador entrenador = null;
        String sql = "SELECT `id-entrenador`, `dni`, `nombre`, `apellido`, `especialidad`, `estado-en` "
                + "FROM `entrenadores` WHERE nombre=? AND apellido=?"; // no importa el estado
        //String sql = "SELECT `id-entrenador`, `dni`, `nombre`, `apellido`, `especialidad`, `estado-en` FROM `entrenadores` WHERE dni=? AND `estado-en`=1"; // solo los activos
        PreparedStatement ps = null;
       
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, nom);
            ps.setString(2, ape);
            ResultSet rs = ps.executeQuery(); //busqueda////////////
            
            if(rs.next()){
            entrenador = new Entrenador ();
            entrenador.setIdEntrenador(rs.getInt("id-entrenador"));
            entrenador.setDniE(rs.getString("dni"));
            entrenador.setNombreE(rs.getString("nombre"));
            entrenador.setApellidoE(rs.getString("apellido"));
            entrenador.setEspecialidad(rs.getString("especialidad"));
            //entrenador.setEstado(true);
            entrenador.setEstado(rs.getBoolean("estado-en"));
            }else{
            JOptionPane.showMessageDialog(null, "No se encontró el entrenador");
            }
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Entrenador ");
            System.out.println("error " + ex.getMessage());
            ex.printStackTrace();
        }
    
    return entrenador;}
    
    public List<Entrenador> listarEntrenadores() {
        List<Entrenador> lista = new ArrayList<>();
        String sql = "SELECT * FROM `entrenadores`WHERE `estado-en`=1";
        //String sql = "SELECT * FROM `entrenadores`"; //todos los entrenadores: activos y no activos

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Entrenador entrenador = new Entrenador();
                entrenador.setIdEntrenador(rs.getInt("id-entrenador"));
                entrenador.setDniE(rs.getString("dni"));
                entrenador.setNombreE(rs.getString("nombre"));
                entrenador.setApellidoE(rs.getString("apellido"));
                entrenador.setEspecialidad(rs.getString("especialidad"));
                //entrenador.setEstado(true);
                entrenador.setEstado(rs.getBoolean("estado-en"));

                lista.add(entrenador);
            }
            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Entrenador ");
            System.out.println("error " + e.getMessage());
            e.printStackTrace();
        }

        return lista;}
    
    public void actualizarEntrenador(Entrenador entrenador) {

        //String sql = "UPDATE alumno SET dni=?, apellido=?, nombre=?, fechaNacimiento=?, estado=? WHERE idAlumno=? ";
        String sql = "UPDATE `entrenadores` "
                   + "SET `dni`=?,`nombre`=?,`apellido`=?,`especialidad`=?,`estado-en`=? "
                   + "WHERE `id-entrenador`=? ";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, entrenador.getDniE());
            ps.setString(2, entrenador.getNombreE());
            ps.setString(3, entrenador.getApellidoE());
            ps.setString(4, entrenador.getEspecialidad());
            ps.setBoolean(5, entrenador.isEstado());
            ps.setInt(6, entrenador.getIdEntrenador());
            
            int exito = ps.executeUpdate();

            if (exito==1) { // pregunta si tiene datos
                JOptionPane.showMessageDialog(null, "Datos del entrenador actualizados");
            }
            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar datos del entrenador");
            System.out.println("error " + e.getMessage());
            e.printStackTrace();
        }

    }
    
    public void darBaja(int id){ 
    
        try {
        //String sql= "UPDATE alumno SET estado = 0 WHERE idAlumno = ? ";
        String sql= "UPDATE `entrenadores` SET `estado-en`=0 WHERE `id-entrenador`=? ";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, id);
        int fila = ps.executeUpdate();
        
        if(fila==1){
            JOptionPane.showMessageDialog(null, "Se dio de baja al entrenador con id: "+id);
        }else{
            JOptionPane.showMessageDialog(null, "No se pudo dar de baja al entrenador con id: "+id);
        }
        ps.close();
        
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar datos");
            System.out.println("error " + e.getMessage());
            e.printStackTrace();
        }

    }
    
}
