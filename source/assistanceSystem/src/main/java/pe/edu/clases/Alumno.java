package pe.edu.clases;


/**
 * @(#)Alumno.java
 *
 * @Proyecto: Asistencia
 *
 * @author : Carranza Alarcon Marelynn Juarez Magallanes Karol Lopez Pariona
 * Sandra
 */
import java.util.Scanner;

public class Alumno extends Persona {

    Scanner n = new Scanner(System.in);
    private String ciclo;// en curso 

    public Alumno(String cod, String nom) {
        super(cod, nom);
        String b = cod.substring(0, 2);
        int a = Integer.parseInt(b);
        switch (a) {
            case 11:
                this.setCiclo("III Ciclo");
                break;
            case 12:
                this.setCiclo("II Ciclo");
                break;
            case 13:
                this.setCiclo("I Ciclo");
                break;
        }
    }

    public Alumno() {
    }

    /*public Alumno(String nom, String cod, String ciclo) {
     this.nombre = nom;
     this.codigo = cod;
     this.ciclo = ciclo;
     }*/
    public void setNombre(String nom) {
        nombre = nom;
    }

    public void setCodigo(String cod) {
        codigo = cod;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    public String getCod() {
        return codigo;
    }

    public String getNom() {
        return nombre;
    }

    public String getCiclo() {
        return ciclo;
    }

    public String toString() {
        return "Alumno: " + getNom() + "\n"
                + "Codigo: " + getCod() + "\n"
                + "Ciclo:  " + getCiclo() + "\n";

    }
}