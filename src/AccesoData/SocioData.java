package AccesoData;

import Entidades.Socio;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class SocioData {

    private Connection con = null;

    public SocioData() {
        con = Conexion.getConexion();
    }

    public void guardarSocio(Socio socio) {

        String sql = "INSERT INTO `socios`( `dni`,`nombre`, `apellido`, `edad`, `crreo`,`telefono`,`dni`,`estado-so`) VALUES (?,?,?,?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, socio.getDniSocio());
            ps.setString(2, socio.getNombre());
            ps.setString(3, socio.getApellido());
            ps.setInt(4, socio.getEdad());
            ps.setString(5, socio.getCorreo());
            ps.setString(6, socio.getTelefono());
            ps.setBoolean(7, socio.isEstado());

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                socio.setIdSocio(rs.getInt("idSocio"));
                JOptionPane.showMessageDialog(null, "Socio cargado correctamente");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Clase ");
            System.out.println("error " + ex.getMessage());
            ex.printStackTrace();
        }
    }

    public Socio buscarSocio(String nombre) {
        Socio socio = null;

        String sql = "SELECT `id-socio`, `dni`, `nombre`, `apellido`, `edad`, `correo`, `telefono`, `estado-so` FROM `socios` WHERE nombre=?";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                socio = new Socio();
                socio.setIdSocio(rs.getInt("id-clase"));
                socio.setDniSocio(rs.getString("dni"));
                socio.setNombre(rs.getString("nombre"));
                socio.setApellido(rs.getString("apellido"));
                socio.setEdad(rs.getInt("edad"));
                socio.setCorreo(rs.getString("correo"));
                socio.setTelefono(rs.getString("telefono"));
                socio.setEstado(rs.getBoolean("estado"));
            }
            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Clase");
            System.out.println("error" + e);
            e.printStackTrace();
        }
        return socio;
    }

    public Socio buscarSocioDni(String dni) {
        Socio socio = null;
        String sql = "SELECT `id-socio`, `dni`, `nombre`, `apellido`, `edad`, `correo`, `telefono`, `estado-so` FROM `socios` WHERE dni=?";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setString(2, dni);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                socio = new Socio();
                socio.setIdSocio(rs.getInt("id-clase"));
                socio.setDniSocio(rs.getString("dni"));
                socio.setNombre(rs.getString("nombre"));
                socio.setApellido(rs.getString("apellido"));
                socio.setEdad(rs.getInt("edad"));
                socio.setCorreo(rs.getString("correo"));
                socio.setTelefono(rs.getString("telefono"));
                socio.setEstado(rs.getBoolean("estado"));
            }
            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Clase");
            System.out.println("error" + e);
            e.printStackTrace();
        }

        return socio;
    }

    public Socio buscarSocioId(String id) {
        Socio socio = null;
        String sql = "SELECT `id-socio`, `dni`, `nombre`, `apellido`, `edad`, `correo`, `telefono`, `estado-so` FROM `socios` WHERE dni=?";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                socio = new Socio();
                socio.setIdSocio(rs.getInt("id-clase"));
                socio.setDniSocio(rs.getString("dni"));
                socio.setNombre(rs.getString("nombre"));
                socio.setApellido(rs.getString("apellido"));
                socio.setEdad(rs.getInt("edad"));
                socio.setCorreo(rs.getString("correo"));
                socio.setTelefono(rs.getString("telefono"));
                socio.setEstado(rs.getBoolean("estado"));
            }
            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Clase");
            System.out.println("error" + e);
            e.printStackTrace();
        }

        return socio;
    }

    public void modificarSocio(Socio socio) {
        String sql = "UPDATE `socios` SET `dni`='?',`nombre`='?',`apellido`='?',`edad`='?',`correo`='?',`telefono`='?',`estado-so`='?' WHERE 'id-socio'=?";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, socio.getDniSocio());
            ps.setString(2, socio.getNombre());
            ps.setString(3, socio.getApellido());
            ps.setInt(4, socio.getEdad());
            ps.setString(5, socio.getCorreo());
            ps.setString(6, socio.getTelefono());
            ps.setBoolean(7, socio.isEstado());

            int exito = ps.executeUpdate();
            System.out.println("exito =" + exito);
            if (exito == 1) { // pregunta si tiene datos
                JOptionPane.showMessageDialog(null, "Actualizacion exitosa del Socio");
            }
            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar los datos ");
            System.out.println("error " + e.getMessage());
            e.printStackTrace();
        }

    }

    public void darDeBajaSocio(int id) {

        try {
            String sql = "UPDATE `socios` SET `estado-so`='?' WHERE 'id-socio'=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            int fila = ps.executeUpdate();

            if (fila == 1) {
                JOptionPane.showMessageDialog(null, "Se dio de baja al Socio con id: " + id);
            } else {
                JOptionPane.showMessageDialog(null, "No se dio de baja la Clase con id: " + id);
            }
            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar datos");
            System.out.println("error " + e.getMessage());
            e.printStackTrace();
        }
    }
        
    public List<Socio> listarTodosSocios (){
       List <Socio> listaSocios = new ArrayList<>(); 
       String sql = "SELECT * FROM 'socios'";
       
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            
            while (rs.next()){
                Socio socio = new Socio();
                socio.setIdSocio(rs.getInt("id-socio"));
                socio.setDniSocio(rs.getString("dni"));
                socio.setNombre(rs.getString("nombre"));
                socio.setApellido(rs.getString("apellido"));
                socio.setEdad(rs.getInt("edad"));
                socio.setCorreo(rs.getString("correo"));
                socio.setTelefono(rs.getString("telefono"));
                socio.setEstado(rs.getBoolean("estado"));
            } 
            rs.close();
            
         } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la lista Socio ");
            System.out.println("error " + e.getMessage());
            e.printStackTrace();
        }
             
       return listaSocios;
    }
    
      public List<Socio> listarSociosActivos (){
       List <Socio> listaSociosA = new ArrayList<>(); 
       String sql = "SELECT * FROM 'socios' WHERE 'estado-so'=1";
       
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            
            while (rs.next()){
                Socio socio = new Socio();
                socio.setIdSocio(rs.getInt("id-socio"));
                socio.setDniSocio(rs.getString("dni"));
                socio.setNombre(rs.getString("nombre"));
                socio.setApellido(rs.getString("apellido"));
                socio.setEdad(rs.getInt("edad"));
                socio.setCorreo(rs.getString("correo"));
                socio.setTelefono(rs.getString("telefono"));
                socio.setEstado(rs.getBoolean("estado"));
            } 
            rs.close();
            
         } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la lista Socio ");
            System.out.println("error " + e.getMessage());
            e.printStackTrace();
        }
             
       return listaSociosA;
    }
        public List<Socio> listarSociosInactivos (){
       List <Socio> listaSociosI = new ArrayList<>(); 
       String sql = "SELECT * FROM 'socios' WHERE 'estado-so'=0";
       
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            
            while (rs.next()){
                Socio socio = new Socio();
                socio.setIdSocio(rs.getInt("id-socio"));
                socio.setDniSocio(rs.getString("dni"));
                socio.setNombre(rs.getString("nombre"));
                socio.setApellido(rs.getString("apellido"));
                socio.setEdad(rs.getInt("edad"));
                socio.setCorreo(rs.getString("correo"));
                socio.setTelefono(rs.getString("telefono"));
                socio.setEstado(rs.getBoolean("estado"));
            } 
            rs.close();
            
         } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la lista Socio ");
            System.out.println("error " + e.getMessage());
            e.printStackTrace();
        }
             
       return listaSociosI;
        }
}
