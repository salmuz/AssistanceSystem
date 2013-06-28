package clases;

import java.io.Serializable;

public class Cursos implements Serializable {

    private String nom;
    private String cod;
    private String ciclo;
    private String silabus;

    public Cursos(String codigo, String nombre, String ciclo) {
        this.cod = codigo;
        this.nom = nombre;
        this.ciclo = ciclo;
    }

    public void setNom(String nombre) {
        this.nom = nombre;
    }

    public void setCod(String codigo) {
        this.cod = codigo;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    public String getNom() {
        return nom;
    }

    public String getCod() {
        return cod;
    }

    public String getCiclo() {
        return ciclo;
    }

    public String getSilabus() {
        return silabus;
    }

    public void setSilabus(String silabus) {
        this.silabus = silabus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cursos)) return false;

        Cursos cursos = (Cursos) o;

        if (cod != null ? !cod.equals(cursos.cod) : cursos.cod != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return cod != null ? cod.hashCode() : 0;
    }

    public String toString() {
        return getCod() + " \t\t\t" + getNom() + "  " + getCiclo();
    }
}