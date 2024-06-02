package Entidades;

public class Entrenador {

    private int idEntrenador;
    private String dniEntrenador;
    private String nombreE;
    private String apellidoE;
    private String especialidad;
    private boolean estado;

    public Entrenador(int idEntrenador, String dniEntrenador, String nombreE, String apellidoE, String especialidad, boolean estado) {
        this.idEntrenador = idEntrenador;
        this.dniEntrenador = dniEntrenador;
        this.nombreE = nombreE;
        this.apellidoE = apellidoE;
        this.especialidad = especialidad;

        this.estado = estado;
    }

    public Entrenador() {
    }

    public int getIdEntrenador() {
        return idEntrenador;
    }

    public void setIdEntrenador(int idEntrenador) {
        this.idEntrenador = idEntrenador;
    }

    public String getDniEntrenador() {
        return dniEntrenador;
    }

    public void setDniEntrenador(String dniEntrenador) {
        this.dniEntrenador = dniEntrenador;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getApellidoE() {
        return apellidoE;
    }

    public void setApellidoE(String apellidoE) {
        this.apellidoE = apellidoE;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Entrenador{" + "idEntrenador=" + idEntrenador + ", dniEntrenador=" + dniEntrenador + ", nombreE=" + nombreE + ", apellidoE=" + apellidoE + ", especialidad=" + especialidad + ", estado=" + estado + '}';
    }

}
