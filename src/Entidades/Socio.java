
package Entidades;


public class Socio {
    
    private int idSocio;
    private String dniSocio;
    private String nombre;
    private String apellido;
    private int edad;
    private String correo;
    private String telefono;

    public Socio(int idSocio, String dniSocio, String nombre, String apellido, int edad, String correo, String telefono) {
        this.idSocio = idSocio;
        this.dniSocio = dniSocio;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.correo = correo;
        this.telefono = telefono;
    }

    public Socio(String dniSocio, String nombre, String apellido, int edad, String correo, String telefono) {
        this.dniSocio = dniSocio;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.correo = correo;
        this.telefono = telefono;
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
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
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

    @Override
    public String toString() {
        return "Socio{" + "idSocio=" + idSocio + ", dniSocio=" + dniSocio + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", correo=" + correo + ", telefono=" + telefono + '}';
    }
    
    
    
}
