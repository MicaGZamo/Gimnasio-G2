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

        String sql = "INSERT INTO `socios`( `dni`,`nombre`,`apellido`, `edad`,`correo`,`telefono`,`estado-so`) VALUES (?,?,?,?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, socio.getDniSocio());
            ps.setString(2, socio.getNombre());
            ps.setString(3, socio.getApellido());
            ps.setInt(4, socio.getEdad());
            ps.setString(5, socio.getCorreo());
            ps.setString(6, socio.getTelefono());
            ps.setBoolean(7, socio.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                socio.setIdSocio(rs.getInt("idSocio"));
                JOptionPane.showMessageDialog(null, "Socio cargado correctamente");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Socio ");
            System.out.println("error " + ex.getMessage());
            ex.printStackTrace();
        }
    }

    public List <Socio> buscarSocioNombre(String nombre) {
        Socio socio = null;
        List <Socio> listaSocioNombre = new ArrayList<>();
        String sql = "SELECT `id-socio`, `dni`, `nombre`, `apellido`, `edad`, `correo`, `telefono`, `estado-so` FROM `socios` WHERE nombre=?";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                socio = new Socio();
                socio.setIdSocio(rs.getInt("id-socio"));
                socio.setDniSocio(rs.getString("dni"));
                socio.setNombre(rs.getString("nombre"));
                socio.setApellido(rs.getString("apellido"));
                socio.setEdad(rs.getInt("edad"));
                socio.setCorreo(rs.getString("correo"));
                socio.setTelefono(rs.getString("telefono"));
                socio.setEstado(rs.getBoolean("estado-so"));
                listaSocioNombre.add(socio);
            }
            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Socio");
            System.out.println("error" + e);
            e.printStackTrace();
        }
        return listaSocioNombre;
    }

    public Socio buscarSocioDni(String dni) {
        Socio socio = null;
        String sql = "SELECT `id-socio`, `dni`, `nombre`, `apellido`, `edad`, `correo`, `telefono`, `estado-so` FROM `socios` WHERE `dni`=?";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, dni);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                socio = new Socio();
                socio.setIdSocio(rs.getInt("id-socio"));
                socio.setDniSocio(rs.getString("dni"));
                socio.setNombre(rs.getString("nombre"));
                socio.setApellido(rs.getString("apellido"));
                socio.setEdad(rs.getInt("edad"));
                socio.setCorreo(rs.getString("correo"));
                socio.setTelefono(rs.getString("telefono"));
                socio.setEstado(rs.getBoolean("estado-so"));
            }
            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Socio");
            System.out.println("error" + e);
            e.printStackTrace();
        }

        return socio;
    }

    public Socio buscarSocioId(int id) {
         Socio socio = null;
    String sql = "SELECT `id-socio`, `dni`, `nombre`, `apellido`, `edad`, `correo`, `telefono`, `estado-so` FROM `socios` WHERE `id-socio`=?";
    PreparedStatement ps = null;

    try {
        ps = con.prepareStatement(sql);
        ps.setInt(1, id);  // Establecer el valor del parámetro ID
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            socio = new Socio();
            socio.setIdSocio(rs.getInt("id-socio"));
            socio.setDniSocio(rs.getString("dni"));
            socio.setNombre(rs.getString("nombre"));
            socio.setApellido(rs.getString("apellido"));
            socio.setEdad(rs.getInt("edad"));
            socio.setCorreo(rs.getString("correo"));
            socio.setTelefono(rs.getString("telefono"));
            socio.setEstado(rs.getBoolean("estado-so"));
        }
        ps.close();

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Socio");
        System.out.println("error" + e);
        e.printStackTrace();
    }

    return socio;
}

    public void modificarSocio(Socio socio) {
          String sql = "UPDATE `socios` SET `dni`=?, `nombre`=?, `apellido`=?, `edad`=?, `correo`=?, `telefono`=?, `estado-so`=? WHERE `id-socio`=?";
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
        ps.setInt(8, socio.getIdSocio());

        int exito = ps.executeUpdate();
        System.out.println("éxito = " + exito);
        if (exito == 1) {
            JOptionPane.showMessageDialog(null, "Actualización exitosa del Socio");
        }
        ps.close();

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al actualizar los datos");
        System.out.println("error " + e.getMessage());
        e.printStackTrace();
    }

    }

    public void darDeBajaSocio(int id) {
 try {
        String sql = "UPDATE `socios` SET `estado-so`=? WHERE `id-socio`=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setBoolean(1, false); // cambiamos el estado a inactivo
        ps.setInt(2, id); // indicamos por cual parametro buscar

            int fila = ps.executeUpdate();

            if (fila == 1) {
                JOptionPane.showMessageDialog(null, "Se dio de baja al Socio con id: " + id);
            } else {
                JOptionPane.showMessageDialog(null, "Erro al dar de baja al Socio con id: " + id);
            }
            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar datos");
            System.out.println("error " + e.getMessage());
            e.printStackTrace();
        }
    }

    public List<Socio> listarTodosSocios() {
        List<Socio> listaSocios = new ArrayList<>();
        String sql = "SELECT * FROM `socios`";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Socio socio = new Socio();
                socio.setIdSocio(rs.getInt("id-socio"));
                socio.setDniSocio(rs.getString("dni"));
                socio.setNombre(rs.getString("nombre"));
                socio.setApellido(rs.getString("apellido"));
                socio.setEdad(rs.getInt("edad"));
                socio.setCorreo(rs.getString("correo"));
                socio.setTelefono(rs.getString("telefono"));
                socio.setEstado(rs.getBoolean("estado-so"));
                 listaSocios.add(socio);
            }
            rs.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la lista Socio ");
            System.out.println("error " + e.getMessage());
            e.printStackTrace();
        }

        return listaSocios;
    }

    public List<Socio> listarSociosActivos() {
        List<Socio> listaSociosA = new ArrayList<>();
         String sql = "SELECT * FROM `socios` WHERE `estado-so`=1";


        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Socio socio = new Socio();
                socio.setIdSocio(rs.getInt("id-socio"));
                socio.setDniSocio(rs.getString("dni"));
                socio.setNombre(rs.getString("nombre"));
                socio.setApellido(rs.getString("apellido"));
                socio.setEdad(rs.getInt("edad"));
                socio.setCorreo(rs.getString("correo"));
                socio.setTelefono(rs.getString("telefono"));
                socio.setEstado(rs.getBoolean("estado-so"));
                 listaSociosA.add(socio);
            }
            rs.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la lista Socio ");
            System.out.println("error " + e.getMessage());
            e.printStackTrace();
        }

        return listaSociosA;
    }

    public List<Socio> listarSociosInactivos() {
        List<Socio> listaSociosI = new ArrayList<>();
        String sql = "SELECT * FROM `socios` WHERE `estado-so`=0"; 

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Socio socio = new Socio();
                socio.setIdSocio(rs.getInt("id-socio"));
                socio.setDniSocio(rs.getString("dni"));
                socio.setNombre(rs.getString("nombre"));
                socio.setApellido(rs.getString("apellido"));
                socio.setEdad(rs.getInt("edad"));
                socio.setCorreo(rs.getString("correo"));
                socio.setTelefono(rs.getString("telefono"));
                socio.setEstado(rs.getBoolean("estado-so"));
                 listaSociosI.add(socio);
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
