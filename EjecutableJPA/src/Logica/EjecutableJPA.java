
package Logica;

import Persistencia.ControladoraPersistencia;
import java.util.Date;


public class EjecutableJPA {


    public static void main(String[] args) {
        
        Alumno unAlumno = new Alumno("96015273", "Abdias", "Jimenez", new Date ("03/15/1999"));
        
        ControladoraPersistencia control = new ControladoraPersistencia();
        control.crearAlumno(unAlumno);
    }
    
}
