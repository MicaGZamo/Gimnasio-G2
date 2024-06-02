
package Entidades;

import java.time.LocalTime;
import java.util.Date;


public class Clase {
  
    private int idClase ;
    private String nombre;
    private int idEntrenador;
    private LocalTime horario; 
    private int capacidad;
    private boolean estado;

    public Clase() {
    }

    public Clase(String nombre, int idEntrenador, LocalTime horario, int capacidad, boolean estado) {
        this.nombre = nombre;
        this.idEntrenador = idEntrenador;
        this.horario = horario;
        this.capacidad = capacidad;
        this.estado = estado;
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


    public LocalTime getHora() {
        return horario;
    }

    public void setHora(LocalTime hora) {
        this.horario = hora;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }


   
    @Override
    public String toString() {
        return "Clase{" + "idClase=" + idClase + ", nombre=" + nombre + ", idEntrenador=" + idEntrenador + ", hora=" + horario + ", capacidad=" + capacidad+ ", estado=" + estado+'}';
    }
    
    
    
    
}
