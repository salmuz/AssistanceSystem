package pe.edu.clases;


/**
 *
 * @(#)TPersona.java
 *
 *
 * @author
 * @version 1.00 2013/6/14
 */
import java.util.Scanner;

public class TPersona {

    public static void main(String[] args) {
        Scanner resp = new Scanner(System.in);
        Persona p = new Persona();
        int op;
        String codi;
        do {
            do {
                System.out.println("=============================================");
                System.out.println("*********BIENVENIDOS ASISTENCIA FISI*********");
                System.out.println("=============================================");
                System.out.println("");
                System.out.println("[1].DOCENTE");
                System.out.println("[2].ADMINISTRATIVO");
                System.out.println("[3].ALUMNO");
                System.out.println("[4].SALIR");
                System.out.print("Digite su opcion---->");
                op = resp.nextInt();
            } while (op < 1 || op > 4);

            switch (op) {
                case 1:
                    VDocente vd = new VDocente();
                    VCursoDocente cd = new VCursoDocente();
                    Docente d = new Docente();
                    VCursos curso = new VCursos();
                    vd.docRegistrado();
                    vd.mostrar1();
                    System.out.println("");
                    System.out.print("Codigo: ");
                    codi = resp.nextLine();
                    codi = resp.nextLine();
                    System.out.println("");
                    vd.busquedad(codi);
                    System.out.println("");
                    curso.cuRegistrado();
                    cd.Registrado();
                    cd.cursosDictadosporelDocente(codi, curso);
                    System.out.println("");
                    //vd.adicionar();
                    break;

                case 2:
                    VAdministrativo va = new VAdministrativo();
                    VAreaAdministrativo ar = new VAreaAdministrativo();
                    Administrativo adm = new Administrativo();
                    VArea area = new VArea();
                    va.AdRegistrado();
                    va.mostrar();
                    System.out.println("");
                    System.out.print("Codigo: ");
                    codi = resp.nextLine();
                    codi = resp.nextLine();
                    System.out.println("");
                    va.busquedad(codi);
                    System.out.println("");
                    area.areaRegistrada();
                    ar.arRegistrado();
                    ar.AreaAsiganadosPorAdministrativo(codi, area);
                    System.out.println("");
                    //va.adicionar();
                    break;

                case 3:
                    Aula a = new Aula();
                    VCursoAlumno cal = new VCursoAlumno();
                    Alumno alu = new Alumno();
                    VCursos cursos = new VCursos();
                    a.aluRegistrado();
                    a.mostrar();
                    System.out.println("");
                    System.out.print("Codigo: ");
                    codi = resp.nextLine();
                    codi = resp.nextLine();
                    System.out.println("");
                    a.busquedad(codi);
                    System.out.println("");
                    cursos.cuRegistrado();
                    cal.caRegistrado();
                    cal.CursoAsiganadosporAlumno(codi, cursos);
                    System.out.println("");
                    //a.adicionar();
                    break;
                case 4:
                    break;

            }

        } while (op != 4);

    }
}
