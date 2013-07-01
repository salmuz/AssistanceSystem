/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import clases.Sesiones;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
//import javax.media.j3d.Sound;
import main.Inicializar;

public class VerificaSesion {

    public List<Alumno> retornaAlumnosPorDocentePorSession(List<Sesiones> sesiones) {
        Date diasistema = new Date();
        List<Alumno> a = new ArrayList<Alumno>();
        for (int i = 0; i < sesiones.size(); i++) {
            Sesiones sesion = sesiones.get(i);
            Grupo group = sesion.getGrupo();
            if (sesion.getDia().toLowerCase().trim().equals(conver(diasistema, "EEEE").toLowerCase().trim())) {
                try {
                    SimpleDateFormat hora = new SimpleDateFormat("HH:mm:ss");
                    Date d = hora.parse(conver(diasistema, "HH:mm:ss"));
                    if (sesion.getHoraIni().before(d) && sesion.getHoraFinal().after(d)) {
                        a = group.getAlumno();
                    }
                } catch (ParseException ex) {
                    System.out.println("ERRROR DEL SISTEMA");
                }
            }
        }
        return a;
    }

    public static String conver(Date fecha, String formato) {
        String r_fecha = " ";
        Format formato_fecha;
        Locale locale = new Locale("es");
        formato_fecha = new SimpleDateFormat(formato, locale);
        r_fecha = formato_fecha.format(fecha);
        return r_fecha;
    }

    public static void main(String[] args) {
        Inicializar inicializar = new Inicializar();
        List<Alumno> alumnos = inicializar.inicializaAlumnos();
        List<Cursos> cursos = inicializar.inicializaCursos();
        List<Docente> docentes = inicializar.inicializaDocentes();
        List<Area> areas = inicializar.inicializaAreas();
        List<Administrativo> administrativos = inicializar.inicializaAdministrativos(areas);
        List<Grupo> grupos = inicializar.inicializaGrupos(docentes, alumnos, cursos);
        List<Sesiones> sessiones = inicializar.inicializaSessiones(grupos);

        VerificaSesion verificaSesion = new VerificaSesion();
        System.out.println(verificaSesion.retornaAlumnosPorDocentePorSession(sessiones).size());

    }
}
