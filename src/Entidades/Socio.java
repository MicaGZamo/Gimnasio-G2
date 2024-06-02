
package Entidades;


public class Socio {
    
    private int idSocio;
    private String dniSocio;
    private String nombreS;
    private String apellidoS;
    private int edad;
    private String correo;
    private String telefono;
    private boolean estado;

    public Socio(int idSocio, String dniSocio, String nombre, String apellido, int edad, String correo, String telefono, boolean estado) {
        this.idSocio = idSocio;
        this.dniSocio = dniSocio;
        this.nombreS = nombre;
        this.apellidoS = apellido;
        this.edad = edad;
        this.correo = correo;
        this.telefono = telefono;
        this.estado= estado;
    }

    public Socio(String dniSocio, String nombre, String apellido, int edad, String correo, String telefono, boolean estado) {
        this.dniSocio = dniSocio;
        this.nombreS = nombre;
        this.apellidoS = apellido;
        this.edad = edad;
        this.correo = correo;
        this.telefono = telefono;
         this.estado= estado;
    }

    public Socio() {
    }

    public int getIdSocio() {
        return idSocio;
    }

    public void setIdSocio(int idSocio) {
        this.idSocio = idSocio;
    }

    public String getDniSocio() {
        return dniSocio;
    }

    public void setDniSocio(String dniSocio) {
        this.dniSocio = dniSocio;
    }

    public String getNombre() {
        return nombreS;
    }

    public void setNombre(String nombre) {
        this.nombreS = nombre;
    }

    public String getApellido() {
        return apellidoS;
    }

    public void setApellido(String apellido) {
        this.apellidoS = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Socio{" + "idSocio=" + idSocio + ", dniSocio=" + dniSocio + ", nombre=" + nombreS + ", apellido=" + apellidoS + ", edad=" + edad + ", correo=" + correo + ", telefono=" + telefono + ", estado"+estado+ '}';
    }
    
    
    
}
