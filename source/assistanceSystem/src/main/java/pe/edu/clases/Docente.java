package pe.edu.clases;


/**
 * @(#)Docente.java
 *
 * @Proyecto: Asistencia
 *
 * @author : Carranza Alarcon Marelynn Juarez Magallanes Karol Lopez Pariona
 * Sandra
 */
import java.util.Scanner;

public class Docente extends Persona {

    Scanner d = new Scanner(System.in);
    private String curso;

    public Docente() {
    }

    public Docente(String cod, String nom) {
        super(cod, nom);
    }

    public Docente(String nom, String cod, String curso) {
        this.nombre = nom;
        this.codigo = cod;
        this.curso = curso;
    }

    public void setNombre(String nom) {
        this.nombre = nom;
    }

    public void setCodigo(String cod) {
        this.codigo = cod;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getCod() {
        return codigo;
    }

    public String getNom() {
        return nombre;
    }

    public String getCurso() {
        return curso;
    }

    public String toString() {
        return "Docente: " + getNom() + "\n"
                + "Codigo:  " + getCod() + "\n";
        // "Curso:   "+getCurso();
    }
}