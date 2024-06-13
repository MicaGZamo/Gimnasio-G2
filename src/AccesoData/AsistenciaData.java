package AccesoData;

import java.sql.*;
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

    public void guardarAsistencia(Asistencia asistencia) {
        String sql = "INSERT INTO `asistencias`(`id-socio`, `id-clase`, `fecha-asistencia`) "
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

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Asistencia ");
            System.out.println("error " + ex.getMessage());
            ex.printStackTrace();
        }

    }

    public List<Asistencia> buscarPorSocio(Socio socio) { // nadia
        List<Asistencia> lista = new ArrayList<>();
      
        String sql = "SELECT `id-asistencia`, `id-socio`, clases.nombre, clases.horario, asistencias.`id-clase`, `fecha-asistencia` "
                + " FROM `asistencias`, clases"
                + " WHERE `id-socio` = ?"
                + " AND asistencias.`id-clase` = clases.`id-clase` ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, socio.getIdSocio());
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Asistencia asistencia = new Asistencia();
                Clase clase = new Clase();
                asistencia.setIdAsistencia(rs.getInt("id-asistencia"));
                socio.setIdSocio(rs.getInt("id-socio"));
                asistencia.setSocio(socio);
                clase.setIdClase(rs.getInt("id-clase"));
                clase.setNombre(rs.getString("nombre"));
                clase.setHorario(rs.getTime("horario").toLocalTime());
                asistencia.setClase(clase);
                asistencia.setFechaAsistencia( rs.getDate("fecha-asistencia").toLocalDate());
                lista.add(asistencia);
            }
         rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Membresia ");
            System.out.println("error " + ex.getMessage());
            ex.printStackTrace();
        }

        return lista;
    }

    public List<Asistencia> buscarPorClase(Clase clase) { // mica
        List<Asistencia> lista = new ArrayList<>();
           
        String sql =  "SELECT `id-asistencia`, asistencias.`id-socio`, socios.apellido, `id-clase`, `fecha-asistencia` "
                  + "FROM `asistencias`, socios "
                   + " WHERE `id-clase`= ?"
                  + " AND asistencias.`id-socio`= socios.`id-socio` ";
              
        
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, clase.getIdClase());
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()){
            Asistencia asistencia = new Asistencia();
            Socio socio = new Socio();
            Clase claseR = new Clase();
                    
            asistencia.setIdAsistencia(rs.getInt("id-asistencia")); //Guardamos el id de la tabla
            socio.setIdSocio(rs.getInt("id-socio"));
            socio.setApellido(rs.getString("apellido"));
            asistencia.setSocio(socio); //seteamos el socio con el id obetenido del rs en asistencia
            clase.setIdClase(rs.getInt("id-clase"));
            asistencia.setFechaAsistencia(rs.getDate("fecha-asistencia").toLocalDate());
            asistencia.setClase(clase); //pasamos la clase obtenida por rs a la asistencia
            
            lista.add(asistencia);
                        
            }
            rs.close();
            
           } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Asistencia ");
            System.out.println("error " + ex.getMessage());
            ex.printStackTrace();
        }
        
        return lista;
    }

    public List<Asistencia> ListarPorFecha(LocalDate fecha) { // Ramiro
        List<Asistencia> lista = new ArrayList<>();
        String sql =  "SELECT `id-asistencia`, asistencias.`id-socio`, socios.apellido,  clases.nombre, clases.horario, asistencias.`id-clase`, `fecha-asistencia` "
                + " FROM `asistencias`, clases, socios"
                + " WHERE `fecha-asistencia` = ?"
                + " AND asistencias.`id-clase` = clases.`id-clase` "
                + " AND asistencias.`id-socio`= socios.`id-socio` ";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDate(1, Date.valueOf(fecha));
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()){
                Asistencia asistencia = new Asistencia();
                Socio socioA = new Socio();
                Clase claseA = new Clase();
                
                asistencia.setIdAsistencia(rs.getInt("id-asistencia"));
                socioA.setApellido(rs.getString("apellido"));
                socioA.setIdSocio(rs.getInt("id-socio"));
                asistencia.setSocio(socioA);
                
                claseA.setNombre(rs.getString("nombre"));
                claseA.setHorario(rs.getTime("horario").toLocalTime());
                claseA.setIdClase(rs.getInt("id-clase"));
                asistencia.setClase(claseA);
                
                asistencia.setFechaAsistencia(rs.getDate("fecha-asistencia").toLocalDate());
                
                lista.add(asistencia);
                        
            }
            rs.close();
            
           } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Asistencia ");
            System.out.println("error " + ex.getMessage());
            ex.printStackTrace();
        }
        return lista;
    }
      public List<Asistencia> Listartodas() {
        List<Asistencia> lista = new ArrayList<>();
        String sql = "SELECT `id-asistencia`, asistencias.`id-socio`, socios.apellido, clases.nombre, clases.horario, asistencias.`id-clase`, `fecha-asistencia` "
                + " FROM `asistencias`, clases, socios"
                + " WHERE asistencias.`id-clase` = clases.`id-clase` "
                + " AND asistencias.`id-socio` = socios.`id-socio`";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
          
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()){
                Asistencia asistencia = new Asistencia();
                Socio socioA = new Socio();
                Clase claseA = new Clase();
                
                asistencia.setIdAsistencia(rs.getInt("id-asistencia"));
                socioA.setApellido(rs.getString("apellido"));
                socioA.setIdSocio(rs.getInt("id-socio"));
                asistencia.setSocio(socioA);
                claseA.setHorario(rs.getTime("horario").toLocalTime());
                claseA.setNombre(rs.getString("nombre"));
                claseA.setIdClase(rs.getInt("id-clase"));
                
                asistencia.setClase(claseA);
                asistencia.setFechaAsistencia(rs.getDate("fecha-asistencia").toLocalDate());
                
                lista.add(asistencia);
                        
            }
            rs.close();
            
           } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Asistencia ");
            System.out.println("error " + ex.getMessage());
            ex.printStackTrace();
        }
        return lista;
    }
}
