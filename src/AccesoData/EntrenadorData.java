
package AccesoData;

//import com.sun.jdi.connect.spi.Connection;
import Entidades.Entrenador;
import java.sql.*;
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
    
    public Entrenador buscarEntrenadorPorDni(String dni){
        Entrenador entrenador = null;
       // String sql = "SELECT id-entrenador, dni, nombre, apellido, especialidad, estado-en FROM entrenadores WHERE dni=? AND estado-en = 1";
        String sql = "SELECT `id-entrenador`, `dni`, `nombre`, `apellido`, `especialidad`, `estado-en` FROM `entrenadores` WHERE dni=? AND `estado-en`=1";
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
            entrenador.setEstado(true);
            }else{
            JOptionPane.showMessageDialog(null, "No se encontró el entrenador");
            }
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Entrenador ");
            System.out.println("error " + ex.getMessage());
            ex.printStackTrace();
        }
    
    return entrenador;}
    
}
