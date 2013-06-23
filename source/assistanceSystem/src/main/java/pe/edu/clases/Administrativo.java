package pe.edu.clases;


/**
 * @(#)Administrativo.java
 *
 * @Proyecto: Asistencia
 *
 * @author : Carranza Alarcon Marelynn Juarez Magallanes Karol Lopez Pariona
 * Sandra
 */
import java.util.Scanner;

public class Administrativo extends Persona {

    Scanner d = new Scanner(System.in);
//	private String nombre;
//	private String codigo;
    private String area;

    public Administrativo(String cod, String nom) {
        super(cod, nom);
    }

    public Administrativo() {
    }

    public void setNombre(String nom) {
        this.nombre = nom;
    }

    public void setCodigo(String cod) {
        this.codigo = cod;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCod() {
        return codigo;
    }

    public String getNom() {
        return nombre;
    }

    public String getArea() {
        return area;
    }

    public String toString() {
        return "Aministrativo: " + getNom() + "\n"
                + "Codigo:        " + getCod() + "\n";
        //"Area Adm.:     "+getArea();
    }
}