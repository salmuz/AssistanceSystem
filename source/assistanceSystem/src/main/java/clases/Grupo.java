package clases;

import com.sun.media.sound.AlawCodec;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Grupo implements Serializable {

    private String codigo;
    private int aula;
    private int cantAlu;
    private int nroGrupo;
    private Docente docente;
    private Cursos cursos;
    private List<Alumno> alumnos;

    public Grupo() {
        alumnos = new ArrayList<Alumno>();
    }

    public Grupo(Cursos cursos, int nroGrupo, int aula, int cantAlu, Docente docente) {
        this();
        this.aula = aula;
        this.cantAlu = cantAlu;
        this.nroGrupo = nroGrupo;
        this.docente = docente;
        this.cursos = cursos;
    }

    public void setAula(int aula) {
        this.aula = aula;
    }

    public int getAula() {
        return aula;
    }

    public void setCantAlu(int cantAlu) {
        this.cantAlu = cantAlu;
    }

    public int getCantAlun() {
        return cantAlu;
    }

    public void setNroGrupo(int nroGrupo) {
        this.nroGrupo = nroGrupo;
    }

    public int getNroGrupo() {
        return nroGrupo;
    }
    
    public void anadirAlumno(Alumno alumno){
        alumnos.add(alumno);
    }
    
    public void eliminarAlumno(String codigo){
        Alumno alumno = new Alumno();
        alumno.setCodigo(codigo);
        alumnos.remove(alumno);
    }
    
    public Alumno buscarAlumno(String codigo){
        Alumno alumno = new Alumno();
        alumno.setCodigo(codigo);
        return alumnos.get(alumnos.indexOf(alumno));
    }
    
    public List<Alumno> getAlumno() {
        return alumnos;
    }

    public String toString() {
        return "Grupo " + this.nroGrupo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Grupo)) return false;

        Grupo grupo = (Grupo) o;

        if (codigo != null ? !codigo.equals(grupo.codigo) : grupo.codigo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return codigo != null ? codigo.hashCode() : 0;
    }
}