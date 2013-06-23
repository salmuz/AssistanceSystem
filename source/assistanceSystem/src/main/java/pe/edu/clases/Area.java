package pe.edu.clases;


/**
 * @(#)Area.java
 *
 * @Proyecto: Asistencia
 *
 * @author : Carranza Alarcon Marelynn Juarez Magallanes Karol Lopez Pariona
 * Sandra
 */
public class Area {

    private String nom;
    private String cod;

    public Area() {
    }

    public Area(String codigo, String nombre) {
        this.cod = codigo;
        this.nom = nombre;
    }

    public void setNom(String nombre) {
        nom = nombre;
    }

    public void setCod(String codigo) {
        cod = codigo;
    }

    public String getNom() {
        return nom;
    }

    public String getCod() {
        return cod;
    }

    public String toString() {
        return getCod() + getNom();
    }
}