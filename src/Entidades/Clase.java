
package Entidades;

import java.time.LocalTime;
import java.util.Date;


public class Clase {
  
    private int idClase ;
    private String nombre;
    private int idEntrenador;
    private Date fecha;
    private LocalTime hora; 

    public Clase(int idClase, String nombre, int idEntrenador, Date fecha, LocalTime hora) {
        this.idClase = idClase;
        this.nombre = nombre;
        this.idEntrenador = idEntrenador;
        this.fecha = fecha;
        this.hora = hora;
    }

    public Clase(String nombre, int idEntrenador, Date fecha, LocalTime hora) {
        this.nombre = nombre;
        this.idEntrenador = idEntrenador;
        this.fecha = fecha;
        this.hora = hora;
    }

    public Clase() {
    }

    public int getIdClase() {
        return idClase;
    }

    public void setIdClase(int idClase) {
        this.idClase = idClase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdEntrenador() {
        return idEntrenador;
    }

    public void setIdEntrenador(int idEntrenador) {
        this.idEntrenador = idEntrenador;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "Clase{" + "idClase=" + idClase + ", nombre=" + nombre + ", idEntrenador=" + idEntrenador + ", fecha=" + fecha + ", hora=" + hora + '}';
    }
    
    
    
    
}
