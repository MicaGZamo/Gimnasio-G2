
package AccesoData;

import Entidades.Asistencia;
import Entidades.Clase;
import Entidades.Entrenador;
import Entidades.Socio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
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
            ps.executeUpdate();
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
    
    public List<Asistencia> buscarPorSocio(Socio socio){ // o ver si por nombre y apellido
        List<Asistencia> lista = new ArrayList<>();
  
    return lista;}
    
    
    public List<Asistencia> buscarPorClase(Clase clase){
        List<Asistencia> lista = new ArrayList<>();
    return lista;}
    
    
    public List<Asistencia> buscarPorFecha(LocalDate fecha){
        List<Asistencia> lista = new ArrayList<>();
        
    return lista;}

} 

