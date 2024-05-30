
package Entidades;

import java.time.LocalDate;

public class Membresia {
    
    private int idMembresia;
    private int idSocio;
    private String tipoMembresia;
    private int cantPases;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    public Membresia(int idMembresia, int idSocio, String tipoMembresia, int cantPases, LocalDate fechaInicio, LocalDate fechaFin) {
        this.idMembresia = idMembresia;
        this.idSocio = idSocio;
        this.tipoMembresia = tipoMembresia;
        this.cantPases = cantPases;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public Membresia(int idSocio, String tipoMembresia, int cantPases, LocalDate fechaInicio, LocalDate fechaFin) {
        this.idSocio = idSocio;
        this.tipoMembresia = tipoMembresia;
        this.cantPases = cantPases;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public Membresia() {
    }

    public int getIdMembresia() {
        return idMembresia;
    }

    public void setIdMembresia(int idMembresia) {
        this.idMembresia = idMembresia;
    }

    public int getIdSocio() {
        return idSocio;
    }

    public void setIdSocio(int idSocio) {
        this.idSocio = idSocio;
    }

    public String getTipoMembresia() {
        return tipoMembresia;
    }

    public void setTipoMembresia(String tipoMembresia) {
        this.tipoMembresia = tipoMembresia;
    }

    public int getCantPases() {
        return cantPases;
    }

    public void setCantPases(int cantPases) {
        this.cantPases = cantPases;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    @Override
    public String toString() {
        return "Membresia{" + "idMembresia=" + idMembresia + ", idSocio=" + idSocio + ", tipoMembresia=" + tipoMembresia + ", cantPases=" + cantPases + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + '}';
    }
    
    
}
