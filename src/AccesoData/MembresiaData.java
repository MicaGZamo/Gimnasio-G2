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

}
