/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoData;

import Entidades.Clase;
import Entidades.Entrenador;
import java.sql.Connection;
import java.sql.Date;
import java.sql.Time;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ClaseData {

    private Connection con = null;

    public ClaseData() {
        con = Conexion.getConexion();
    }

    public void guardarClase(Clase clase) {
        String sql = "INSERT INTO `clases`( `nombre`, `id-entrenador`, `horario`, `capacidad`, `estado-clase`) VALUES (?,?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, clase.getNombre());
            ps.setInt(2, clase.getEntrenador().getIdEntrenador());
            ps.setTime(3, Time.valueOf(clase.getHorario()));
            ps.setInt(4, clase.getCapacidad());
            ps.setBoolean(5, clase.isEstado());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                clase.setIdClase(rs.getInt("idClase"));
                JOptionPane.showMessageDialog(null, "Clase cargada correctamente");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Clase ");
            System.out.println("error " + ex.getMessage());
            ex.printStackTrace();
        }
    }
 public Clase  buscarClaseId(int id) {
        Clase clase = null;
         
        String sql = "SELECT clases.*, entrenadores.nombre as nombre_entrenador "
                      + " FROM `clases`, entrenadores "
                      + " WHERE clases.`id-entrenador` = entrenadores.`id-entrenador` AND clases.`id-clase`=? ";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {

                clase = new Clase();
                clase.setIdClase(rs.getInt("id-clase"));
                clase.setNombre(rs.getString("nombre"));
                clase.setHorario(rs.getTime("horario").toLocalTime());
                clase.setCapacidad(rs.getInt("capacidad"));
                clase.setEstado(rs.getBoolean("estado-clase"));
                Entrenador entrenador = new Entrenador(); 
                entrenador.setIdEntrenador(rs.getInt("id-entrenador"));
                entrenador.setNombreE(rs.getString("nombre_entrenador"));
                clase.setEntrenador(entrenador);
              
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Clase");
            System.out.println("error" + e);
            e.printStackTrace();
        }
        return clase;
    }
 
    public List<Clase>  buscarClase(String nombre) {
        Clase clase = null;
         List<Clase> listaClase = new ArrayList<>();
        String sql = "SELECT clases.*, entrenadores.nombre as nombre_entrenador "
                      + " FROM `clases`, entrenadores "
                      + " WHERE clases.`id-entrenador` = entrenadores.`id-entrenador` AND clases.nombre=? ";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                clase = new Clase();
                clase.setIdClase(rs.getInt("id-clase"));
                clase.setNombre(rs.getString("nombre"));
                clase.setHorario(rs.getTime("horario").toLocalTime());
                clase.setCapacidad(rs.getInt("capacidad"));
                clase.setEstado(rs.getBoolean("estado-clase"));
                Entrenador entrenador = new Entrenador(); 
                entrenador.setIdEntrenador(rs.getInt("id-entrenador"));
                entrenador.setNombreE(rs.getString("nombre_entrenador"));
                clase.setEntrenador(entrenador);
                listaClase.add(clase);
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Clase");
            System.out.println("error" + e);
            e.printStackTrace();
        }
        return listaClase;
    }
    
     public Clase buscarClasePorHorario(LocalTime horario) {
        Clase clase = null;
        String sql = "SELECT clases.*, entrenadores.nombre as nombre_entrenador "
                      + " FROM `clases`, entrenadores "
                      + "WHERE horario=? ";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setTime(1,Time.valueOf( horario) );
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
               
                clase = new Clase();
                clase.setIdClase(rs.getInt("id-clase"));
                clase.setNombre(rs.getString("nombre"));
                clase.setHorario(rs.getTime("horario").toLocalTime());
                clase.setCapacidad(rs.getInt("capacidad"));
                clase.setEstado(rs.getBoolean("estado-clase"));
                 
                Entrenador entrenador = new Entrenador(); 
                 entrenador.setIdEntrenador(rs.getInt("id-entrenador"));
                 entrenador.setNombreE(rs.getString("nombre_entrenador"));
              
                clase.setEntrenador(entrenador);
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Clase");
            System.out.println("error" + e);
            e.printStackTrace();
        }
        return clase;
    }

     
      public List<Clase>  buscarClasePorEntrenador(String nombre, String apellido) {
        Clase clase = null;
        List<Clase> listaClase = new ArrayList<>();
        Entrenador entrenador = null;
        String sql = " SELECT clases.*, entrenadores.* "
                      + " FROM `clases`, entrenadores "
                      + " WHERE clases.`id-entrenador` = entrenadores.`id-entrenador` "
                      + " AND entrenadores.nombre = ? AND entrenadores.apellido = ? " ;
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            ps.setString(2, apellido);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                entrenador = new Entrenador();
                clase = new Clase();
                clase.setIdClase(rs.getInt("id-clase"));
                clase.setNombre(rs.getString("nombre"));
                clase.setHorario(rs.getTime("horario").toLocalTime());
                clase.setCapacidad(rs.getInt("capacidad"));
                clase.setEstado(rs.getBoolean("estado-clase"));
                System.out.println(rs);
               
                
                 entrenador.setIdEntrenador(rs.getInt("id-entrenador"));
                 clase.setEntrenador(entrenador);
                  listaClase.add(clase);
                  
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Clase");
            System.out.println("error" + e);
            e.printStackTrace();
        }
        return listaClase;
    }

     
    public void modificarClase(Clase clase) {
        String sql = "UPDATE `clases` SET nombre=?, `id-entrenador`=?, horario=?, capacidad=?, `estado-clase`=? WHERE `id-clase`=? ";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, clase.getNombre());
            ps.setInt(2, clase.getEntrenador().getIdEntrenador());
            ps.setTime(3, Time.valueOf(clase.getHorario()));
            ps.setInt(4, clase.getCapacidad());
            ps.setBoolean(5, clase.isEstado());
            ps.setInt(6, clase.getIdClase());

            int exito = ps.executeUpdate();
            System.out.println("exito =" + exito);
            if (exito == 1) { // pregunta si tiene datos
                JOptionPane.showMessageDialog(null, "Actualizacion exitosa de la Clase");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar los datos de la materia ");
            System.out.println("error " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void darDeBajaClase(int id) {
        try {
            String sql = "UPDATE `clases` SET `estado-clase` = 0 WHERE `id-clase`=? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int fila = ps.executeUpdate();
            if (fila == 1) {
                JOptionPane.showMessageDialog(null, "Se dio de baja la Clase con id: " + id);
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

    public List<Clase> listarTodasClases() {

        List<Clase> listaClase = new ArrayList<>();
        String sql = "SELECT clases.*, entrenadores.`id-entrenador`, entrenadores.nombre as nombre_entrenador "
                      + " FROM `clases`, entrenadores "
                      +" WHERE clases.`id-entrenador` = entrenadores.`id-entrenador` ";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Clase clase = new Clase();
                clase.setIdClase(rs.getInt("id-clase"));
                clase.setNombre(rs.getString("nombre"));
                clase.setHorario(rs.getTime("horario").toLocalTime());
                clase.setCapacidad(rs.getInt("capacidad"));
                clase.setEstado(rs.getBoolean("estado-clase"));
                   
                Entrenador entrenador = new Entrenador(); 
                 entrenador.setIdEntrenador(rs.getInt("id-entrenador"));
                 entrenador.setNombreE(rs.getString("nombre_entrenador"));
              
                clase.setEntrenador(entrenador);
                listaClase.add(clase);
            }
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la lista Clases ");
            System.out.println("error " + e.getMessage());
            e.printStackTrace();
        }
        return listaClase;
    }
    
     public List<Clase> listarClasesActivas() {

        List<Clase> listaClase = new ArrayList<>();
        String sql = "SELECT clases.*, entrenadores.`id-entrenador`, entrenadores.nombre as nombre_entrenador "
                      + " FROM `clases`, entrenadores "
                      +" WHERE clases.`id-entrenador` = entrenadores.`id-entrenador` "
                       + " AND `estado-clase`=1 ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Clase clase = new Clase();
                clase.setIdClase(rs.getInt("id-clase"));
                clase.setNombre(rs.getString("nombre"));
                
                clase.setHorario(rs.getTime("horario").toLocalTime());
                clase.setCapacidad(rs.getInt("capacidad"));
                clase.setEstado(rs.getBoolean("estado-clase"));
                   
                Entrenador entrenador = new Entrenador(); 
                 entrenador.setIdEntrenador(rs.getInt("id-entrenador"));
                 entrenador.setNombreE(rs.getString("nombre_entrenador"));
              
                clase.setEntrenador(entrenador);
                listaClase.add(clase);
            }
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la lista Clases ");
            System.out.println("error " + e.getMessage());
            e.printStackTrace();
        }
        return listaClase;
    }
      public List<Clase> listarClasesInactivas() {

        List<Clase> listaClase = new ArrayList<>();
        String sql = "SELECT clases.*, entrenadores.`id-entrenador`, entrenadores.nombre as nombre_entrenador "
                      + " FROM `clases`, entrenadores "
                      +" WHERE clases.`id-entrenador` = entrenadores.`id-entrenador` "
                       + " AND `estado-clase`=0 ";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Clase clase = new Clase();
                clase.setIdClase(rs.getInt("id-clase"));
                clase.setNombre(rs.getString("nombre"));
              
                clase.setHorario(rs.getTime("horario").toLocalTime());
                clase.setCapacidad(rs.getInt("capacidad"));
                clase.setEstado(rs.getBoolean("estado-clase"));
                   
                Entrenador entrenador = new Entrenador(); 
                 entrenador.setIdEntrenador(rs.getInt("id-entrenador"));
                 entrenador.setNombreE(rs.getString("nombre_entrenador"));
              
                clase.setEntrenador(entrenador);
                listaClase.add(clase);
            }
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la lista Clases ");
            System.out.println("error " + e.getMessage());
            e.printStackTrace();
        }
        return listaClase;
    }
     
     public List<LocalTime> listarHorariosClasesActivas() {
        List<LocalTime> listaHorarios = new ArrayList<>();
        String sql = "SELECT horario "
                   + "FROM `clases` "
                   + "WHERE `estado-clase`=1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                listaHorarios.add(rs.getTime("horario").toLocalTime());
            }
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a los horarios de las Clases ");
            System.out.println("error " + e.getMessage());
            e.printStackTrace();
        }
        return listaHorarios;
    }
     
     public List<LocalTime> listarHorariosDisponibles() {
        List<LocalTime> horariosDisponibles = new ArrayList<>();
        List<LocalTime> horariosOcupados = listarHorariosClasesActivas();
        List<LocalTime> listaHorarios = new ArrayList<>();

        LocalTime inicio = LocalTime.of(8, 0);
        LocalTime fin = LocalTime.of(20, 0);
        for (LocalTime time = inicio; !time.isAfter(fin); time = time.plusHours(1)) {
            horariosDisponibles.add(time);
        }
  

          for (LocalTime horario : horariosOcupados) {
             
            if (horariosDisponibles.contains(horario)) {
                horariosDisponibles.remove(horario);
                
            }
        }
             
         

        
        return horariosDisponibles;
    }
}




    

