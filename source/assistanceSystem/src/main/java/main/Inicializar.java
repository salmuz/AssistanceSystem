
package main;

import clases.Administrativo;
import clases.Alumno;
import clases.Area;
import clases.Cursos;
import clases.Docente;
import clases.Grupo;
import clases.Sesiones;
import clases.VerificaSesion;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Inicializar {

    public List<Sesiones> inicializaSessiones(List<Grupo> grupos) {
        List<Sesiones> sesiones = new ArrayList<Sesiones>();
        try {
            SimpleDateFormat hora = new SimpleDateFormat("HH:mm:ss");

            Sesiones sesion01T = new Sesiones(1, hora.parse("07:00:00"), hora.parse("11:59:59"), "Lunes", "T", grupos.get(0));
            Sesiones sesion01P = new Sesiones(2, hora.parse("16:00:00"), hora.parse("17:59:59"), "Lunes", "P", grupos.get(0));
            Sesiones sesion01L = new Sesiones(3, hora.parse("14:00:00"), hora.parse("15:59:59"), "Lunes", "L", grupos.get(0));

            Sesiones sesion02T = new Sesiones(4, hora.parse("14:00:00"), hora.parse("16:59:59"), "Martes", "T", grupos.get(1));
            Sesiones sesion02P = new Sesiones(5, hora.parse("10:00:00"), hora.parse("11:59:59"), "Martes", "P", grupos.get(1));
            Sesiones sesion02L = new Sesiones(6, hora.parse("08:00:00"), hora.parse("09:59:59"), "Martes", "L", grupos.get(1));


            Sesiones sesion03T = new Sesiones(7, hora.parse("10:00:00"), hora.parse("11:59:59"), "Miercoles", "T", grupos.get(2));
            Sesiones sesion03P = new Sesiones(8, hora.parse("08:00:00"), hora.parse("09:59:59"), "Miercoles", "P", grupos.get(2));
            Sesiones sesion03L = new Sesiones(9, hora.parse("12:00:00"), hora.parse("14:59:59"), "Miercoles", "L", grupos.get(2));
            
            
            Sesiones sesion04T = new Sesiones(10, hora.parse("08:00:00"), hora.parse("09:59:59"), "Jueves", "T", grupos.get(3));
            Sesiones sesion04P = new Sesiones(11, hora.parse("10:00:00"), hora.parse("11:59:59"), "Jueves", "P", grupos.get(3));
            Sesiones sesion04L = new Sesiones(12, hora.parse("12:00:00"), hora.parse("14:59:59"), "Jueves", "L", grupos.get(3));
            
            
            Sesiones sesion05T = new Sesiones(13, hora.parse("10:00:00"), hora.parse("11:59:59"), "Viernes", "T", grupos.get(3));
            Sesiones sesion05P = new Sesiones(14, hora.parse("13:00:00"), hora.parse("14:59:59"), "Viernes", "P", grupos.get(3));
            Sesiones sesion05L = new Sesiones(15, hora.parse("15:00:00"), hora.parse("16:59:59"), "Viernes", "L", grupos.get(3));
            
            
            Sesiones sesion06T = new Sesiones(16, hora.parse("08:00:00"), hora.parse("09:59:59"), "Sabado", "T", grupos.get(3));
            Sesiones sesion06P = new Sesiones(17, hora.parse("10:00:00"), hora.parse("11:59:59"), "Sabado", "P", grupos.get(3));
            Sesiones sesion06L = new Sesiones(18, hora.parse("12:00:00"), hora.parse("14:59:59"), "Sabado", "L", grupos.get(3));
            
            
            Sesiones sesion07T = new Sesiones(19, hora.parse("15:00:00"), hora.parse("16:59:59"), "Sabado", "T", grupos.get(3));
            Sesiones sesion07P = new Sesiones(20, hora.parse("17:00:00"), hora.parse("18:59:59"), "Sabado", "P", grupos.get(3));
            Sesiones sesion07L = new Sesiones(21, hora.parse("19:00:00"), hora.parse("20:59:59"), "Sabado", "L", grupos.get(3));
           
            sesiones.add(sesion01L);
            sesiones.add(sesion01P);
            sesiones.add(sesion01T);

            sesiones.add(sesion02L);
            sesiones.add(sesion02P);
            sesiones.add(sesion02T);

            sesiones.add(sesion03L);
            sesiones.add(sesion03P);
            sesiones.add(sesion03T);
            
            sesiones.add(sesion04L);
            sesiones.add(sesion04P);
            sesiones.add(sesion04T);
            
            sesiones.add(sesion05L);
            sesiones.add(sesion05P);
            sesiones.add(sesion05T);
            
            sesiones.add(sesion06L);
            sesiones.add(sesion06P);
            sesiones.add(sesion06T);
            
            sesiones.add(sesion07L);
            sesiones.add(sesion07P);
            sesiones.add(sesion07T);

        } catch (ParseException ex) {
            Logger.getLogger(Inicializar.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sesiones;

    }

    public List<Grupo> inicializaGrupos(List<Docente> docentes, List<Alumno> alumnos, List<Cursos> curso) {
        List<Grupo> grupos = new ArrayList<Grupo>();
       
        Grupo g1 = new Grupo("001", 101, 30, 1, docentes.get(0), curso.get(0), alumnos.subList(0, 30));
        Grupo g2 = new Grupo("002", 102, 30, 2, docentes.get(1), curso.get(1), alumnos.subList(10, 40));
        Grupo g3 = new Grupo("003", 204, 30, 1, docentes.get(2), curso.get(2), alumnos.subList(0, 30));
        Grupo g4 = new Grupo("004", 207, 30, 2, docentes.get(3), curso.get(3), alumnos.subList(20, 40));
        Grupo g5 = new Grupo("005", 105, 30, 1, docentes.get(4), curso.get(4), alumnos.subList(0, 30));
        Grupo g6 = new Grupo("006", 103, 30, 2, docentes.get(5), curso.get(5), alumnos.subList(0, 30));
        Grupo g7 = new Grupo("007", 201, 30, 1, docentes.get(6), curso.get(6), alumnos.subList(0, 30));
        
        grupos.add(g1);
        grupos.add(g2);
        grupos.add(g3);
        grupos.add(g4);
        grupos.add(g5);
        grupos.add(g6);
        grupos.add(g7);

        return grupos;
    }

    public List<Administrativo> inicializaAdministrativos(List<Area> areas) {
        List<Administrativo> administrativos = new ArrayList<Administrativo>();
        int limiteInferior = 0;
        int limiteSuperior = areas.size();
        int random = (int) (Math.random() * (limiteSuperior - limiteInferior)) + limiteInferior;
        Administrativo ad1 = new Administrativo("25505151", "Ines Zapata", "Ines", "401", areas.get(random), "900");
        random = (int) (Math.random() * (limiteSuperior - limiteInferior)) + limiteInferior;
        Administrativo ad2 = new Administrativo("25505152", "Alberto Martines", "Alberto", "402", areas.get(random), "901");
        random = (int) (Math.random() * (limiteSuperior - limiteInferior)) + limiteInferior;
        Administrativo ad3 = new Administrativo("25505153", "Jorge Alarcon", "Jorge", "403", areas.get(random), "902");
        random = (int) (Math.random() * (limiteSuperior - limiteInferior)) + limiteInferior;
        Administrativo ad4 = new Administrativo("25505154", "Andres Perez", "Andres", "404", areas.get(random), "903");
        random = (int) (Math.random() * (limiteSuperior - limiteInferior)) + limiteInferior;
        Administrativo ad5 = new Administrativo("25505155", "Maria Lopez", "Maria", "405", areas.get(random), "904");
        random = (int) (Math.random() * (limiteSuperior - limiteInferior)) + limiteInferior;

        administrativos.add(ad1);
        administrativos.add(ad2);
        administrativos.add(ad3);
        administrativos.add(ad4);
        administrativos.add(ad5);

        return administrativos;
    }

    public List<Area> inicializaAreas() {
        List<Area> areas = new ArrayList<Area>();
        Area a1 = new Area("701", "Matricula");
        Area a2 = new Area("702", "Economica");
        Area a3 = new Area("703", "Tesoreria");
        Area a4 = new Area("704", "Soporte Tecnico");
        Area a5 = new Area("705", "Bienestar");

        areas.add(a1);
        areas.add(a2);
        areas.add(a3);
        areas.add(a4);
        areas.add(a5);

        return areas;
    }

    public List<Cursos> inicializaCursos() {
        List<Cursos> cursos = new ArrayList<Cursos>();

        Cursos cur1 = new Cursos("201", "Algoritmica I", "Ciclo I");
        Cursos cur2 = new Cursos("301", "Algoritmica II", "Ciclo II");
        Cursos cur3 = new Cursos("403", "Calculo I", "Ciclo I");
        Cursos cur4 = new Cursos("501", "Fisica I", "Ciclo I");
        Cursos cur5 = new Cursos("605", "Dise?o Grafico", "Ciclo III");
        Cursos cur6 = new Cursos("701", "Organizacion y administracion", "Ciclo III");
        Cursos cur7 = new Cursos("802", "Matematica basica II", "Ciclo II");

        cursos.add(cur1);
        cursos.add(cur2);
        cursos.add(cur3);
        cursos.add(cur4);
        cursos.add(cur5);
        cursos.add(cur6);
        cursos.add(cur7);

        return cursos;
    }

    public List<Docente> inicializaDocentes() {
        List<Docente> docentes = new ArrayList<Docente>();
        Docente doc1 = new Docente("70150620", "Salinas", "100", "Salinas", "3010");
        Docente doc2 = new Docente("70150621", "Nehil", "101", "Nehil", "3011");
        Docente doc3 = new Docente("70150622", "Carhuamaca", "102", "Carhuamaca", "3012");
        Docente doc4 = new Docente("70150623", "Vilcapoma", "103", "Vilcapoma", "3013");
        Docente doc5 = new Docente("70150624", "Molina", "104", "Molina", "3014");
        Docente doc6 = new Docente("70150625", "Canepa", "105", "Canepa", "3015");
        Docente doc7 = new Docente("70150626", "Simpe", "106", "Simpe", "3016");
        docentes.add(doc1);
        docentes.add(doc2);
        docentes.add(doc3);
        docentes.add(doc4);
        docentes.add(doc5);
        docentes.add(doc6);
        docentes.add(doc7);
        return docentes;
    }

    public List<Alumno> inicializaAlumnos() {
        List<Alumno> alumnos = new ArrayList<Alumno>();

        Alumno alu1 = new Alumno("40256100", "Ana Rivera", "11200123", "2011");
        Alumno alu2 = new Alumno("40256101", "Sofia Martines", "12200023", "2012");
        Alumno alu3 = new Alumno("40256102", "Sandra Gonzales", "13200120", "2013");
        Alumno alu4 = new Alumno("40256103", "Karla Correa", "10200005", "2010");
        Alumno alu5 = new Alumno("40256104", "Oscar Rosales", "10200103", "2010");
        Alumno alu6 = new Alumno("40256105", "Mario Tafur", "13200016", "2013");
        Alumno alu7 = new Alumno("40256106", "Maria Sanchez", "12200105", "2012");
        Alumno alu8 = new Alumno("40256107", "Andrea Huachua", "12200003", "2012");
        Alumno alu9 = new Alumno("40256108", "Rocio Danos", "11200113", "2011");
        Alumno alu10 = new Alumno("40256109", "Angela Cristobal", "13200017", "2013");
        Alumno alu11 = new Alumno("40256110", "Raul Guerra", "11200058", "2011");
        Alumno alu12 = new Alumno("40256111", "Axel Lopez", "11200109", "2011");
        Alumno alu13 = new Alumno("40256112", "Mariano Cortez", "12200053", "2012");
        Alumno alu14 = new Alumno("40256113", "Vanesa Rivera", "10200083", "2010");
        Alumno alu15 = new Alumno("40256114", "Lucero Belon", "12200096", "2012");
        Alumno alu16 = new Alumno("40256115", "Angel Alarcon", "13200074", "2013");
        Alumno alu17 = new Alumno("40256116", "Richar Campos", "10200035", "2010");
        Alumno alu18 = new Alumno("40256117", "Manuel Perez", "10200046", "2010");
        Alumno alu19 = new Alumno("40256118", "Rodriguez Alvares", "11200111", "2011");
        Alumno alu20 = new Alumno("40256119", "Karol Lavado", "11200033", "2011");
        Alumno alu21 = new Alumno("40256120", "Juan Mejia", "12200019", "2012");
        Alumno alu22 = new Alumno("40256121", "Alex Purca", "102000109", "2010");
        Alumno alu23 = new Alumno("40256122", "Antoanela Segobia", "12200093", "2012");
        Alumno alu24 = new Alumno("40256123", "Cielo Vera", "12200044", "2012");
        Alumno alu25 = new Alumno("40256124", "Miguel Anastacio", "12200013", "2012");
        Alumno alu26 = new Alumno("40256125", "Paul Tarazona", "11200100", "2011");
        Alumno alu27 = new Alumno("40256126", "Jaime Cornejo", "10200067", "2010");
        Alumno alu28 = new Alumno("40256127", "Anderson Marigorda", "12200012", "2012");
        Alumno alu29 = new Alumno("40256128", "Estrella Polo", "12200073", "2012");
        Alumno alu30 = new Alumno("40256129", "Tatiana Romero", "12200094", "2012");
        Alumno alu31 = new Alumno("40256130", "Jean Garcia", "12200069", "2012");
        Alumno alu32 = new Alumno("40256131", "Ziggy Rojas", "10200016", "2010");
        Alumno alu33 = new Alumno("40256132", "Ivan Gomez", "11200088", "2011");
        Alumno alu34 = new Alumno("40256133", "Josep Olacuaga", "12200001", "2012");
        Alumno alu35 = new Alumno("40256134", "Michel Pisco", "10200104", "2010");
        Alumno alu36 = new Alumno("40256135", "Erick Rodriguez", "11200112", "2011");
        Alumno alu37 = new Alumno("40256136", "Dory Tupia", "12200011", "2012");
        Alumno alu38 = new Alumno("40256137", "Carlos Villon", "12200097", "2012");
        Alumno alu39 = new Alumno("40256138", "Junior Saavedra", "10200064", "2010");
        Alumno alu40 = new Alumno("40256139", "Samir Morocho", "13200084", "2013");
        Alumno alu41 = new Alumno("40256140", "Lucia Costa", "13200046", "2013");

        alumnos.add(alu1);
        alumnos.add(alu2);
        alumnos.add(alu3);
        alumnos.add(alu4);
        alumnos.add(alu5);
        alumnos.add(alu6);
        alumnos.add(alu7);
        alumnos.add(alu8);
        alumnos.add(alu9);
        alumnos.add(alu10);
        alumnos.add(alu11);
        alumnos.add(alu12);
        alumnos.add(alu13);
        alumnos.add(alu14);
        alumnos.add(alu15);
        alumnos.add(alu16);
        alumnos.add(alu17);
        alumnos.add(alu18);
        alumnos.add(alu19);
        alumnos.add(alu20);
        alumnos.add(alu21);
        alumnos.add(alu22);
        alumnos.add(alu23);
        alumnos.add(alu24);
        alumnos.add(alu25);
        alumnos.add(alu26);
        alumnos.add(alu27);
        alumnos.add(alu28);
        alumnos.add(alu29);
        alumnos.add(alu30);
        alumnos.add(alu31);
        alumnos.add(alu32);
        alumnos.add(alu33);
        alumnos.add(alu34);
        alumnos.add(alu35);
        alumnos.add(alu36);
        alumnos.add(alu37);
        alumnos.add(alu38);
        alumnos.add(alu39);
        alumnos.add(alu40);
        alumnos.add(alu41);


        return alumnos;
    }
}
