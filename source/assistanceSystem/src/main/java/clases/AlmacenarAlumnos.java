/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author c0mput3r
 */
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class AlmacenarAlumnos implements Serializable {

    private List<Alumno> alumnos;
 
    public AlmacenarAlumnos(){
       alumnos = new ArrayList<Alumno>();
    }
   
    public Asistemcia Registar(Sesiones sesion){
        Asistemcia asistencia = new Asistemcia();
        asistencia.setSesiones(sesion);
        asistencia.setCodigoAsistencia(1);
        List<Alumno> alumnos = sesion.getGrupo().getAlumno();
        for (int i =0 ; i< alumnos.size();i++){
            DetalleAsistencia detalle = new DetalleAsistencia(alumnos.get(i), true, false);
            asistencia.anadirAsistenciaAlumno(detalle);
        }
        return asistencia;        
    }
}
