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

    public List<Membresia> buscarPorSocio(Socio socio) { //Ramiro
        List<Membresia> lista = new ArrayList<>();
        Membresia membresia1 = null;
        String sql = "SELECT * FROM `membresias` WHERE `id-socio`=?";
        boolean flag = false;
        //PreparedStatement ps = null;

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, socio.getIdSocio());
            ResultSet rs = ps.executeQuery(); //-->busqueda////////////

            while (rs.next()) {
                flag = true;
                membresia1 = new Membresia();
                membresia1.setIdMembresia(rs.getInt("id-membresia"));
                membresia1.setSocio(socio);
                membresia1.setCantPases(rs.getInt("CantidadPases"));
                membresia1.setFechaInicio(rs.getDate("fecha-inicio").toLocalDate());
                membresia1.setFechaFin(rs.getDate("fecha-fin").toLocalDate());
                membresia1.setPrecioMembresia(rs.getDouble("costo-membresia"));
                membresia1.setEstado(rs.getBoolean("estado-m"));
                lista.add(membresia1);
            }
            if (!flag) {
                JOptionPane.showMessageDialog(null, "no se encontro la socio");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Membresia ");
            System.out.println("error " + ex.getMessage());
            ex.printStackTrace();
        }

        return lista;
    }

    public Membresia buscarMembresiaPorId(int idMembresia) {
        Membresia membresia = null;
        String sql = //"SELECT * FROM `membresias` WHERE `id-membresia`=?";
                "SELECT membresias.*, socios.`id-socio`, socios.dni, socios.nombre, socios.apellido "
                + "FROM `membresias`, `socios` "
                + "WHERE `id-membresia`=? "
                + "AND membresias.`id-socio`= socios.`id-socio`";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMembresia);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                membresia = new Membresia();
                membresia.setIdMembresia(rs.getInt("id-membresia"));
                Socio socio = new Socio();
                socio.setDniSocio(rs.getString("dni"));
                socio.setNombre(rs.getNString("nombre"));
                socio.setApellido(rs.getNString("apellido"));
                socio.setIdSocio(rs.getInt("id-socio"));
                membresia.setSocio(socio);
                membresia.setCantPases(rs.getInt("CantidadPases"));
                membresia.setFechaInicio(rs.getDate("fecha-inicio").toLocalDate());
                membresia.setFechaFin(rs.getDate("fecha-fin").toLocalDate());
                membresia.setPrecioMembresia(rs.getDouble("costo-membresia"));
                membresia.setEstado(rs.getBoolean("estado-m"));
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró la membresía con el ID proporcionado.");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Membresia ");
            System.out.println("error " + ex.getMessage());
            ex.printStackTrace();
        }

        return membresia;
    }

    public List<Membresia> listarMembresiasActivas() { //Nadia
        List<Membresia> lista = new ArrayList<>();
        String sql = "SELECT membresias.*, socios.`id-socio`, socios.dni, socios.nombre, socios.apellido "
                + "FROM `membresias`, `socios` "
                + "WHERE `estado-m`=1 "
                + "AND membresias.`id-socio`= socios.`id-socio`";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Membresia membresia1 = new Membresia();
                membresia1.setIdMembresia(rs.getInt("id-membresia"));
                Socio socio = new Socio();
                socio.setIdSocio(rs.getInt("id-socio"));
                socio.setDniSocio(rs.getString("dni"));
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

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Membresia ");
            System.out.println("error " + ex.getMessage());
            ex.printStackTrace();
        }
        return lista;
    }

    public List<Membresia> listarMembresiasInactivas() { //Nadia 
        List<Membresia> lista = new ArrayList<>();
        String sql = "SELECT membresias.*, socios.`id-socio`, socios.dni, socios.nombre, socios.apellido "
                + "FROM `membresias`, `socios` "
                + "WHERE `estado-m`=0 "
                + "AND membresias.`id-socio`= socios.`id-socio`";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Membresia membresia1 = new Membresia();
                membresia1.setIdMembresia(rs.getInt("id-membresia"));
                Socio socio = new Socio();
                socio.setIdSocio(rs.getInt("id-socio"));
                socio.setDniSocio(rs.getString("dni"));
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

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Membresia ");
            System.out.println("error " + ex.getMessage());
            ex.printStackTrace();
        }

        return lista;
    }

    public List<Membresia> listarTodasMembresias() { //mica
        List<Membresia> lista = new ArrayList<>();
        String sql = "SELECT membresias.*, socios.dni, socios.nombre, socios.apellido "
                + "FROM membresias "
                + "JOIN socios ON membresias.`id-socio` = socios.`id-socio`";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Membresia membresia1 = new Membresia();
                membresia1.setIdMembresia(rs.getInt("id-membresia"));
                Socio socio = new Socio();
                socio.setIdSocio(rs.getInt("id-socio"));
                socio.setDniSocio(rs.getString("dni"));
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

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Membresia ");
            System.out.println("error " + ex.getMessage());
            ex.printStackTrace();
        }

        return lista;
    }

    public void modificarMembresia(Membresia membresia) { 

        String sql = "UPDATE `membresias` "
                + "SET `id-socio`=?,`CantidadPases`=?,`fecha-inicio`=?,`fecha-fin`=?,`costo-membresia`=?,`estado-m`=? "
                + "WHERE `id-membresia`=?";

        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, membresia.getSocio().getIdSocio());
            ps.setInt(2, membresia.getCantPases());
            ps.setDate(3, Date.valueOf(membresia.getFechaInicio())); 
            ps.setDate(4, Date.valueOf(membresia.getFechaFin())); // de LocalDate a Date
            ps.setDouble(5, membresia.getPrecioMembresia());
            ps.setBoolean(6, membresia.isEstado());
            ps.setInt(7, membresia.getIdMembresia());

            int exito = ps.executeUpdate();

            if (exito == 1) { // pregunta si tiene datos
                JOptionPane.showMessageDialog(null, "Datos de membresia actualizados.");
            }
            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar datos de la membresia.");
            System.out.println("error " + e.getMessage());
            e.printStackTrace();
        }

    }

    public void darBajaMembresia(Membresia membresia) {

        try {
            String sql = "UPDATE `membresias` SET `estado-m` = ? WHERE `id-socio` = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, 0);
            ps.setInt(2, membresia.getSocio().getIdSocio());

            int fila = ps.executeUpdate(); 

            if (fila > 0) {
                JOptionPane.showMessageDialog(null, "Se dio de baja la membresia con id: " + membresia.getSocio().getIdSocio());
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo dar de baja la membresia con id: " + membresia.getSocio().getIdSocio());
            }
            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error con la tabla membresia.");
            System.out.println("error " + e.getMessage());
            e.printStackTrace();
        }

    }
    public void darBajaMembresia(int idMembresia) {
    try {
        String sql = "UPDATE `membresias` SET `estado-m` = ? WHERE `id-membresia` = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, 0);
        ps.setInt(2, idMembresia);

        int fila = ps.executeUpdate();

        if (fila > 0) {  
            JOptionPane.showMessageDialog(null, "Se dio de baja la membresía con ID: " + idMembresia);
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo dar de baja la membresía con ID: " + idMembresia);
        }
        ps.close();

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error con la tabla membresía.");
        System.out.println("error " + e.getMessage());
        e.printStackTrace();
    }
}
    public void darAltaMembresia(int idMembresia) {
    try {
        String sql = "UPDATE `membresias` SET `estado-m` = ? WHERE `id-membresia` = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, 1); 
        ps.setInt(2, idMembresia);

        int fila = ps.executeUpdate();

        if (fila > 0) {  
            JOptionPane.showMessageDialog(null, "Se activó la membresía con ID: " + idMembresia);
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo activar la membresía con ID: " + idMembresia);
        }
        ps.close();

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error con la tabla membresía.");
        System.out.println("error " + e.getMessage());
        e.printStackTrace();
    }
    }
    public void eliminarMembresiaPorId(int idMembresia) {
    try {
        String sql = "DELETE FROM `membresias` WHERE `id-membresia` = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, idMembresia);

        int fila = ps.executeUpdate();

        if (fila > 0) {
            JOptionPane.showMessageDialog(null, "Se eliminó la membresía con ID: " + idMembresia);
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo eliminar la membresía con ID: " + idMembresia);
        }
        ps.close();

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al eliminar la membresía.");
        System.out.println("Error: " + e.getMessage());
        e.printStackTrace();
    }
}
}
