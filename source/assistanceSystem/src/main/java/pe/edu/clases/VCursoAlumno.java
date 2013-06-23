package pe.edu.clases;


/**
 * @(#)VAlumnoCurso.java
 *
 *
 * @author
 * @version 1.00 2013/6/15
 */
public class VCursoAlumno {

    CursoAlumno ca[];

    public VCursoAlumno() {
        ca = new CursoAlumno[54];
    }

    public void caRegistrado() {
        String cursos[] = {"721", "721", "731", "731", "741", "741", "751", "751", "761", "761", "771", "771", "721", "731", "741", "751", "761", "771", "722", "722", "722", "732", "732", "732", "742", "742", "742", "752", "752", "752", "762", "762", "762", "772", "772", "772", "723", "723", "723", "733", "733", "733", "743", "743", "743", "753", "753", "753", "763", "763", "763", "773", "773", "773"};
        String alum[] = {"132", "131", "132", "131", "132", "131", "132", "131", "132", "131", "132", "131", "130", "130", "130", "130", "130", "130", "122", "126", "127", "122", "126", "127", "122", "126", "127", "122", "126", "127", "122", "126", "127", "122", "126", "127", "112", "113", "119", "112", "113", "119", "112", "113", "119", "112", "113", "119", "112", "113", "119", "112", "113", "119"};
        ca = new CursoAlumno[54];
        for (int i = 0; i < ca.length; i++) {
            ca[i] = new CursoAlumno(cursos[i], alum[i]);
        }
    }

    public void mostrar() {
        for (int i = 0; i < ca.length; i++) {
            System.out.println(ca[i]);
        }
    }

    public void CursoAsiganadosporAlumno(String alumno, VCursos c) {

        for (int i = 0; i < ca.length; i++) {
            if (alumno.equals(ca[i].getCodAlumno())) {
                //System.out.println("Dia "+ (i+1));
                System.out.println("Curso :" + c.consulta(ca[i].getCodCurso()));
            }
        }
    }
}