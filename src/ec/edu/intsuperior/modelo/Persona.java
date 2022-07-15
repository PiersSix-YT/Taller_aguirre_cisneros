
package ec.edu.intsuperior.modelo;

import java.util.Date;

public class Persona {
  
    String cedula1;
    String nombre1;
    String apellido1;
    String direccion1;
    Date fechaNacimiento1;
    String correo1;

    public Persona(String cedula1, String nombre1, String apellido1, String direccion1, Date fechaNacimiento1, String correo1) {
        this.cedula1 = cedula1;
        this.nombre1 = nombre1;
        this.apellido1 = apellido1;
        this.direccion1 = direccion1;
        this.fechaNacimiento1 = fechaNacimiento1;
        this.correo1 = correo1;
    }

    public String getCedula1() {
        return cedula1;
    }

    public String getNombre1() {
        return nombre1;
    }

    public String getApellido1() {
        return apellido1;
    }

    public String getDireccion1() {
        return direccion1;
    }

    public Date getFechaNacimiento1() {
        return fechaNacimiento1;
    }

    public String getCorreo1() {
        return correo1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public void setCedula1(String cedula1) {
        this.cedula1 = cedula1;
    }

    public void setDireccion1(String direccion1) {
        this.direccion1 = direccion1;
    }

    public void setFechaNacimiento1(Date fechaNacimiento1) {
        this.fechaNacimiento1 = fechaNacimiento1;
    }

    public void setCorreo1(String correo1) {
        this.correo1 = correo1;
    }
    
    
        
    
}
