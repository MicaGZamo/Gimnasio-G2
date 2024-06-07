package Entidades;

import java.time.LocalDate;
import java.util.Date;

public class Membresia {

    private int idMembresia;
    private Socio socio;
    private int cantPases;
    private LocalDate fechaInicio;
    private LocalDate fechaFin; // 30 días a partir de la fecha de inicio
    private double precioMembresia;
    private boolean estado;

    public Membresia(Socio socio, int cantPases, LocalDate fechaInicio, LocalDate fechaFin, int precioMembresia, boolean estado) {
        this.idMembresia = idMembresia;
        this.socio = socio;

        this.cantPases = cantPases;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.precioMembresia = precioMembresia;
        this.estado = estado;
    }

    public Membresia() {
    }

    public int getIdMembresia() {
        return idMembresia;
    }

    public void setIdMembresia(int idMembresia) {
        this.idMembresia = idMembresia;
    }

    public Socio getSocio() {
        return socio;
    }

    public void setSocio(Socio socio) {
        this.socio = socio;
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

    public double getPrecioMembresia() {
        return precioMembresia;
    }

    public void setPrecioMembresia(double precioMembresia) {
        this.precioMembresia = precioMembresia;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        String estadoStr = estado ? "Activo" : "Inactivo";
        return "Membresia{" + "idMembresia=" + idMembresia + ", Socio=" + socio + ", cantPases=" + cantPases + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", precioMembresia=" + precioMembresia + ", estado=" + estadoStr + '}';
    }

}
