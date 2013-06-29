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
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class VerificaSesion {
    
     List<Sesiones> sesiones = new ArrayList<Sesiones>();
     List<Docente> docente = new ArrayList<Docente>();
     List<Grupo> group = new ArrayList<Grupo>();
     List<Alumno> alu = new ArrayList<Alumno>();
     Scanner resp = new Scanner(System.in);
   
     public List<Alumno> retornaAlumnosPorDocentePorSession(List<Sesiones> sesiones){
        
      
        Sesiones sesion;
        Alumno alu;
        Date diasistema = new Date();
        List<Alumno> a = new ArrayList<Alumno>();
        for (int i = 0 ; i < sesiones.size(); i++){
           sesion = sesiones.get(i);
           Grupo group = sesion.getGrupo();
           Docente docente = group.getDocente();
           if(sesion.getDia() == conver(diasistema,"EEEE")){
               String h = conver(diasistema,"h:mm:ss");
               Date d = new Date(h);
                
               if(sesion.getHoraIni().after(d)  && sesion.getHoraFinal().before(d)){
                    a = group.getAlumno();
               }
           }
        }
        return a;
     }
     
     
    public static String conver(Date fecha,String formato){
        String r_fecha=" ";
        Format formato_fecha;
        formato_fecha = new SimpleDateFormat(formato);
        r_fecha = formato_fecha.format(fecha);
        return r_fecha;
     }  
}




