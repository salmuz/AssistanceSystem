package clases;

import java.io.Serializable;

public class Area implements Serializable{

    private String nom;
    private String cod;

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
        return "    \t\t\t\t   " + getCod() + "\t\t\t    " + getNom();
    }
}