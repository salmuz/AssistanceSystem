package pe.edu.clases;


/**
 * @(#)AlumnoCurso.java
 *
 *
 * @author
 * @version 1.00 2013/6/15
 */
public class AlumnoCurso {

    private String codAlumno;
    private String codCurso;

    public AlumnoCurso() {
    }

    public AlumnoCurso(String codCur, String codAlu) {
        this.codAlumno = codAlu;
        this.codCurso = codCur;
    }

    public void setCodAlumno(String codAlu) {
        this.codAlumno = codAlu;
    }

    public void setCodCurso(String codCu) {
        this.codCurso = codCu;
    }

    public String getCodAlumno() {
        return codAlumno;
    }

    public String getCodCurso() {
        return codCurso;
    }

    public String toString() {
        String mensaje = " ";
        mensaje = "Curso :" + getCodCurso() + "Alumno : " + getCodAlumno();
        return mensaje;
    }
}