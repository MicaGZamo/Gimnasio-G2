package Entidades;

public class Entrenador {

    private int idEntrenador;
    private String dniE;
    private String nombreE;
    private String apellidoE;
    private String especialidad;
    private boolean estado;

    public Entrenador(int idEntrenador, String dniE, String nombreE, String apellidoE, String especialidad, boolean estado) {
        this.idEntrenador = idEntrenador;
        this.dniE = dniE;
        this.nombreE = nombreE;
        this.apellidoE = apellidoE;
        this.especialidad = especialidad;
        this.estado = estado;
    }

    public Entrenador() {
    }

    public Entrenador(String dniE, String nombreE, String apellidoE, String especialidad, boolean estado) {
        this.dniE = dniE;
        this.nombreE = nombreE;
        this.apellidoE = apellidoE;
        this.especialidad = especialidad;
        this.estado = estado;
    }
    
    

    public int getIdEntrenador() {
        return idEntrenador;
    }

    public void setIdEntrenador(int idEntrenador) {
        this.idEntrenador = idEntrenador;
    }

    public String getDniE() {
        return dniE;
    }

    public void setDniE(String dniE) {
        this.dniE = dniE;
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
        return "Entrenador{" + "id=" + idEntrenador + ", dni=" + dniE + ", nombre=" + nombreE + ", apellido=" + apellidoE + ", especialidad=" + especialidad + ", estado=" + estado + '}';
    }

}
