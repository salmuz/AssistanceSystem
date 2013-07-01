/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.List;

/**
 *
 * @author c0mput3r
 */
public class AmacenarAlumnos {

    public static Asistemcia crearAsistencia(Sesiones sesion, int codAsistencia) {
        Asistemcia asistencia = new Asistemcia ();
        asistencia.setSesiones(sesion);
        asistencia.setCodigoAsistencia(codAsistencia);
        
        List<Alumno> alumnos = sesion.getGrupo().getAlumno();
        for (int i =0 ; i< alumnos.size();i++){
            DetalleAsistencia detalle = new DetalleAsistencia(alumnos.get(i), true, false);
            asistencia.anadirAsistenciaAlumno(detalle);
        }
        return asistencia;
    }
}
