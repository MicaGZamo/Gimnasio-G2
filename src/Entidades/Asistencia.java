
package Entidades;

import java.time.LocalDate;
import java.time.LocalTime;


public class Asistencia {
    
    private int idSocio;
    private int idClase;
    private int idMembresia;
    private LocalDate fechaAsistencia;
    private LocalTime horaClase;
    private int pasesDisponibles;

    public Asistencia(int idSocio, int idClase, int idMembresia, LocalDate fechaAsistencia, LocalTime horaClase, int pasesDisponibles) {
        this.idSocio = idSocio;
        this.idClase = idClase;
        this.idMembresia = idMembresia;
        this.fechaAsistencia = fechaAsistencia;
        this.horaClase = horaClase;
        this.pasesDisponibles = pasesDisponibles;
    }

    public Asistencia() {
    }

    public int getIdSocio() {
        return idSocio;
    }

    public void setIdSocio(int idSocio) {
        this.idSocio = idSocio;
    }

    public int getIdClase() {
        return idClase;
    }

    public void setIdClase(int idClase) {
        this.idClase = idClase;
    }

    public int getIdMembresia() {
        return idMembresia;
    }

    public void setIdMembresia(int idMembresia) {
        this.idMembresia = idMembresia;
    }

    public LocalDate getFechaAsistencia() {
        return fechaAsistencia;
    }

    public void setFechaAsistencia(LocalDate fechaAsistencia) {
        this.fechaAsistencia = fechaAsistencia;
    }

    public LocalTime getHoraClase() {
        return horaClase;
    }

    public void setHoraClase(LocalTime horaClase) {
        this.horaClase = horaClase;
    }

    public int getPasesDisponibles() {
        return pasesDisponibles;
    }

    public void setPasesDisponibles(int pasesDisponibles) {
        this.pasesDisponibles = pasesDisponibles;
    }

    @Override
    public String toString() {
        return "Asistencia{" + "idSocio=" + idSocio + ", idClase=" + idClase + ", idMembresia=" + idMembresia + ", fechaAsistencia=" + fechaAsistencia + ", horaClase=" + horaClase + ", pasesDisponibles=" + pasesDisponibles + '}';
    }
    
    
}
