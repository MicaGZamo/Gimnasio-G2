
package AccesoData;

import Entidades.Asistencia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.sql.Date;
import java.time.ZoneId;
import javax.swing.JOptionPane;


public class AsistenciaData {
    private Connection con = null; 

    public AsistenciaData() {
         con = Conexion.getConexion();
        
    }
 
    public void guardarAsistencia(Asistencia asistencia){
       String sql= "INSERT INTO `asistencias`(`id-socio`, `id-clase`, `fecha-asistencia`) "
               + " VALUES (?,?,?) ";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, asistencia.getSocio().getIdSocio());
            ps.setInt(2, asistencia.getClase().getIdClase());
            ps.setDate(3, Date.valueOf(asistencia.getFechaAsistencia()));
            System.out.println("antes ps.executeUpdate");
            ps.executeUpdate();
            System.out.println("luego ps.executeUpdate");
            ResultSet rs = ps.getGeneratedKeys();            
            
              if (rs.next()) {
            asistencia.setIdAsistencia(rs.getInt("idAsistencia"));
            JOptionPane.showMessageDialog(null, "Asistencia cargada correctamente");
            }
            ps.close();
            
    }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Asistencia ");
            System.out.println("error " + ex.getMessage());
            ex.printStackTrace();
        }
    
    }
    
    public void actualizarAsistencia(Asistencia asistencia){
        
        
    
    }
    
}
