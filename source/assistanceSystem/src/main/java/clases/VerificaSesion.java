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
import java.util.Scanner;
import main.Inicializar;
import java.util.Iterator;
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
        // lis = new Lista();
        //in.encabezado1();
        //System.out.println("\n"+in.inicializaAlumnos()+"\n");
        Grupo grup = new Grupo();
        System.out.println(grup.getAlumno());
        
        Scanner resp= new Scanner(System.in);
        Iterator<Grupo> it= grupos.iterator();
        int op;
        do{
            do{
                System.out.println("\t\t\t=============================================");
                System.out.println("\t\t\t         BIENVENIDOS ASISTENCIA FISI  ");
                System.out.println("\t\t\t=============================================");
                System.out.println("");
                System.out.println(" \t\t\t\t[1].ALUMNO");
                System.out.println(" \t\t\t\t[2].DOCENTE");
                System.out.println(" \t\t\t\t[3].ADMINISTRATIVO");
                System.out.println(" \t\t\t\t[4].SALIR");
                System.out.print("\t\t\t\t Digite su opcion--->");
                op = resp.nextInt();
			 
                    
            }while(op<1 || op>4);
           
            switch(op){
                case 1:{
                    int oc;
                    Scanner n = new Scanner(System.in);
                    Iterator<Alumno> interar= alumnos.iterator();
                    boolean encontro = false;
                    do{
                        do{
                            System.out.println();
                            System.out.println();
                            System.out.println( "\t\t\t\t  FACULTAD DE INGENIERIA DE SISTEMAS E INFORMATICA" );
                            System.out.println( "\t\t\t\t           LISTADO GENERAL DE ALUMNOS" );   
                            System.out.println( "\t\t\t\t----------------------------------------------------");
                            System.out.println( "\t\t\t\t 1.-Mostrar Alumnos " );
                            System.out.println( "\t\t\t\t 2.-Buscar Alumno por codigo " );
                            System.out.println( "\t\t\t\t 3.-Ingrese asistencia  ");
                            System.out.println( "\t\t\t\t 4.-Salir  ");
                            System.out.print("\t\t\t\t Digite su opcion--->");
                            oc = n.nextInt();
                            System.out.println("\n");

                        }while(oc<1 || oc>4);
                        switch(oc){
                            case 1: 
                                {
                                    System.out.println("    ");
                                    System.out.println( "\t\t-------------------------------------------------------------------------------------");
                                    System.out.println( "\t\t\t\t  FACULTAD DE INGENIERIA DE SISTEMAS E INFORMATICAS" );
                                    System.out.println( "\t\t\t\t         LISTADO GENERAL DE LOS ALUMNOS" );
                                    System.out.println( "\t\t-------------------------------------------------------------------------------------");
                                    System.out.println( "\t\t Codigo\t\t\t\t  Nombre\t\t\t    Dni " );
                                    System.out.println( "\t\t-------------------------------------------------------------------------------------");
                                    
                                    while(interar.hasNext()){
                                        System.out.println(interar.next().toString());
                                    }
                                    System.out.println( "\t\t-------------------------------------------------------------------------------------");
                                }break;
                            case 2:
                                {
                                    Alumno p=null;
                                    Alumno q=null;
                                    System.out.println("\n");
                                    System.out.println("\t\t\t\tBUSCAR ALUMNO:");
                                    System.out.print("\t\t\t\tCodigo: ");
                                    String codigo1 = n.nextLine();
                                    codigo1 = n.nextLine();
                                    p = Alumno.buscarAlu(codigo1, alumnos);
                                    System.out.println(p);
                                    
                                   
              
                                } break;  
                            case 3: {
                                UsuarioSistemas us = new UsuarioSistemas();
                                Alumno al = new Alumno();
                                
                            }
                                break;
                            case 4: break;
                                
                          }
                        }while(oc!=4);
                        }break;
                case 2: 
                    {
                    int oc;
                    Scanner n = new Scanner(System.in);
                    Iterator<Docente> intero= docentes.iterator();
                    boolean encontro = false;
                    do{
                        do{
                            System.out.println();
                            System.out.println();
                            System.out.println( "\t\t\t\t  FACULTAD DE INGENIERIA DE SISTEMAS E INFORMATICA" );
                            System.out.println( "\t\t\t\t           LISTADO GENERAL DE DOCENTES" );   
                            System.out.println( "\t\t\t\t----------------------------------------------------");
                            System.out.println( "\t\t\t\t 1.-Mostrar Docente" );
                            System.out.println( "\t\t\t\t 2.-Buscar Docente por codigo " );
                            System.out.println( "\t\t\t\t 3.-Salir  ");
                            System.out.print("\t\t\t\t Digite su opcion--->");
                            oc = n.nextInt();
                            System.out.println("\n");

                        }while(oc<1 || oc>3);
                        switch(oc){
                            case 1: 
                                {
                                    System.out.println("    ");
                                    System.out.println( "\t\t-------------------------------------------------------------------------------------");
                                    System.out.println( "\t\t\t\t  UNIVERSIDAD NACIONAL MAYOR DE SAN MARCOS" );
                                    System.out.println( "\t\t\t\t         LISTADO GENERAL DE DOCENTES" );
                                    System.out.println( "\t\t-------------------------------------------------------------------------------------");
                                    System.out.println( "\t\t\t Codigo\t\tNombre\t\t\t  Dni " );
                                    System.out.println( "\t\t-------------------------------------------------------------------------------------");
                                    
                                    while(intero.hasNext()){
                                        System.out.println(intero.next().toString());
                                    }
                                    System.out.println( "\t\t-------------------------------------------------------------------------------------");
                                }break;
                            case 2:
                                {
                                    Docente p=null;
                                    Docente q=null;
                                    System.out.println("\n");
                                    System.out.println("\t\t\t\tBUSCAR DOCENTE:");
                                    System.out.print("\t\t\t\tCodigo: ");
                                    String codigo1 = n.nextLine();
                                    codigo1 = n.nextLine();
                                    while(intero.hasNext()){
                                        //Alumno a=(Alumno)interar.next();
                                      
                                        if(codigo1.equals(intero.next().getCod())){
                                            encontro = true;
                                            p=intero.next();
                                           break;
                                        }
                                        
                                    }
                                    if(encontro == true)
                                        System.out.println(p.getNombre());
                                    else
                                        System.out.println(q);
              
                                } break;  
                            case 3: break;
                            }
                        }while(oc!=3);

                    }break;
                case 3: 
                    {
                    int oc1;
                    Scanner n = new Scanner(System.in);
                    Iterator<Administrativo> interan= administrativos.iterator();
                    boolean encontro = false;
                    do{
                        do{
                            System.out.println();
                            System.out.println();
                            System.out.println( "\t\t\t\t  FACULTAD DE INGENIERIA DE SISTEMAS E INFORMATICA" );
                            System.out.println( "\t\t\t\t         LISTADO GENERAL DE ADMINISTRATIVOS" );   
                            System.out.println( "\t\t\t\t----------------------------------------------------");
                            System.out.println( "\t\t\t\t 1.-Mostrar Administrativos" );
                            System.out.println( "\t\t\t\t 2.-Buscar Administrativo por codigo " );
                            System.out.println( "\t\t\t\t 3.-Salir  ");
                            System.out.print("\t\t\t\t Digite su opcion--->");
                            oc1 = n.nextInt();
                            System.out.println("\n");

                        }while(oc1<1 || oc1>3);
                        switch(oc1){
                            case 1: 
                                {
                                    System.out.println("    ");
                                    System.out.println( "\t\t-------------------------------------------------------------------------------------");
                                    System.out.println( "\t\t\t\t  UNIVERSIDAD NACIONAL MAYOR DE SAN MARCOS" );
                                    System.out.println( "\t\t\t\t     LISTADO GENERAL DE ADMINISTRATIVO" );
                                    System.out.println( "\t\t-------------------------------------------------------------------------------------");
                                    System.out.println( "\t\t\t Codigo\t\tNombre\t\t\t\t  Dni " );
                                    System.out.println( "\t\t-------------------------------------------------------------------------------------");
                                    
                                    while(interan.hasNext()){
                                        System.out.println(interan.next().toString());
                                    }
                                    System.out.println( "\t\t-------------------------------------------------------------------------------------");
                                }break;
                            case 2:
                                {
                                    Administrativo p=null;
                                    Administrativo q=null;
                                    System.out.println("\n");
                                    System.out.println("\t\t\t\tBUSCAR ADMINISTRATIVO:");
                                    System.out.print("\t\t\t\tCodigo: ");
                                    String codigo1 = n.nextLine();
                                    codigo1 = n.nextLine();
                                    while(interan.hasNext()){
                                        //Alumno a=(Alumno)interar.next();
                                      
                                        if(codigo1.equals(interan.next().getCodigo())){
                                            encontro = true;
                                            p=interan.next();
                                           break;
                                        }
                                        
                                    }
                                    if(encontro == true) {
                                        System.out.println(p.getNombre());
                                    }
                                    else {
                                        System.out.println(q);
                                    }
              
                                } break;  
                            case 3: break;
                            }
                        }while(oc1!=3);

                    }
                    break;
            }
           
        }while(op!=4);
        
       
        
     }
 
}