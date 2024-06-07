package AccesoData;

import Entidades.Membresia;
import Entidades.Socio;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class MembresiaData {

    private Connection con = null;

    public MembresiaData() {
        con = Conexion.getConexion();
    }

    private boolean existeSocio(int idSocio) {
        String sql = "SELECT COUNT(*) FROM socios WHERE `id-socio` = ?";

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, idSocio);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getInt(1) > 0;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al verificar la existencia del socio");
            System.out.println("error " + ex.getMessage());
            ex.printStackTrace();
        }

        return false;
    }

    public void guardarMembresia(Membresia membresia) {

        int idSocio = membresia.getSocio().getIdSocio(); // Asegúrate de que tienes un método getIdSocio() en Socio

        if (!existeSocio(idSocio)) {
            JOptionPane.showMessageDialog(null, "El socio no existe");
            return;
        }

        String sql = "INSERT INTO `membresias` (`id-socio`, `CantidadPases`, `fecha-inicio`, `fecha-fin`, `costo-membresia`, `estado-m`) VALUES (?, ?, ?, ?, ?, ?)";

         try {
            PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setInt(1, idSocio);
            ps.setInt(2, membresia.getCantPases());
            ps.setDate(3, Date.valueOf(membresia.getFechaInicio()));
            ps.setDate(4, Date.valueOf(membresia.getFechaFin()));
            ps.setDouble(5, membresia.getPrecioMembresia());
            ps.setBoolean(6, membresia.isEstado());
            int rowsInserted = ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                membresia.setIdMembresia(rs.getInt(1)); // Asumiendo que el id de la membresía es la primera columna
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

}
