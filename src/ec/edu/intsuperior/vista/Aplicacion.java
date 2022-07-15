
package ec.edu.intsuperior.vista;

import ec.edu.intsuperior.modelo.Persona;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Aplicacion {
  
    public static void main(String[] args) {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("16/6/2002");
        Date fec = new Date(16/6/2002);
        fec.setYear(2002);
        fec.setMonth(6);
        fec.setDate(16);
        
        Persona obj1 = new Persona("1728504679", "David", "Aguirre", "Cayambe", fec, "ariuzdavid@gmail.com");
      
        System.out.println("SU NOMBRE ES: "+obj1.getNombre1());
        System.out.println("SU APELLIDO ES: "+obj1.getApellido1());
        System.out.println("SU CEDULA ES: "+obj1.getCedula1());
        System.out.println("SU DIRECCION ES: "+obj1.getDireccion1());
        System.out.println("SU FECHA DE NACIMIENTO ES: "+obj1.getFechaNacimiento1());
        System.out.println("SU CORREO ES: "+obj1.getCorreo1());   
    }
}
