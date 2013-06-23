package pe.edu.clases;


/**
 * @(#)CursoDocente.java
 *
 *
 * @author
 * @version 1.00 2013/6/15
 */
public class CursoDocente {

    private String codDocente;
    private String codCurso;

    public CursoDocente() {
    }

    public CursoDocente(String codCur, String codDoc) {
        this.codDocente = codDoc;
        this.codCurso = codCur;
    }

    public void setCodDocente(String codDoc) {
        this.codDocente = codDoc;
    }

    public void setCodCurso(String codCu) {
        this.codCurso = codCu;
    }

    public String getCodDocente() {
        return codDocente;
    }

    public String getCodCurso() {
        return codCurso;
    }

    public String toString() {
        String mensaje = " ";
        mensaje = "Curso :" + getCodCurso() + "Doncente : " + getCodDocente();
        return mensaje;
    }
}
