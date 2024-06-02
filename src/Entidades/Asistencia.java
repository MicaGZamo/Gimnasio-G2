package Entidades;

import java.time.LocalDate;


public class Asistencia {

    private int idAsistencia;
    private int idSocio;
    private int idClase;
    private LocalDate fechaAsistencia;

    public Asistencia() {
    }

    public Asistencia(int idAsistencia, int idSocio, int idClase, LocalDate fechaAsistencia) {
        this.idAsistencia = idAsistencia;
        this.idSocio = idSocio;
        this.idClase = idClase;
        this.fechaAsistencia = fechaAsistencia;
    }

    public int getIdAsistencia() {
        return idAsistencia;
    }

    public void setIdAsistencia(int idAsistencia) {
        this.idAsistencia = idAsistencia;
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

    public LocalDate getFechaAsistencia() {
        return fechaAsistencia;
    }

    public void setFechaAsistencia(LocalDate fechaAsistencia) {
        this.fechaAsistencia = fechaAsistencia;
    }

    @Override
    public String toString() {
        return "Asistencia{" + "idAsistencia=" + idAsistencia + ", idSocio=" + idSocio + ", idClase=" + idClase + ", fechaAsistencia=" + fechaAsistencia + '}';
    }


}
