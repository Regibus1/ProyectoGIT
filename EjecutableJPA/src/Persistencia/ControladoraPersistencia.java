
package Persistencia;

import Logica.Alumno;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladoraPersistencia {
    
    AlumnoJpaController alumnoJPA = new AlumnoJpaController();
    
    public void crearAlumno(Alumno unAlumno){
        try {
            alumnoJPA.create(unAlumno);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
