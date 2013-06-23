package pe.edu.clases;


/**
 * @(#)VDocenteCurso.java
 *
 *
 * @author
 * @version 1.00 2013/6/15
 */
public class VCursoDocente {

    CursoDocente d[];

    public VCursoDocente() {
        d = new CursoDocente[12];
    }

    public void Registrado() {
        String cursos[] = {"721", "731", "741", "751", "761", "771", "722", "732", "742", "752", "762", "772", "723", "733", "743", "753", "763", "773"};
        String docentes[] = {"111", "222", "333", "444", "555", "666", "777", "222", "999", "888", "111", "604", "605", "606", "607", "999", "608", "609"};
        d = new CursoDocente[12];
        for (int i = 0; i < d.length; i++) {
            d[i] = new CursoDocente(cursos[i], docentes[i]);
        }
    }

    public void mostrar() {
        for (int i = 0; i < d.length; i++) {
            System.out.println(d[i]);
        }
    }

    public void cursosDictadosporelDocente(String docente, VCursos c) {

        for (int i = 0; i < d.length; i++) {
            if (docente.equals(d[i].getCodDocente())) {

                System.out.println("Curso " + c.consulta(d[i].getCodCurso()));
            }
        }
    }
}