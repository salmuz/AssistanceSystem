package clases;

import java.io.Serializable;

public class Persona implements Serializable {

    protected String dni;
    protected String nombre;

    public Persona() {
    }

    public Persona(String dni, String nom) {
        this.dni = dni;
        this.nombre = nom;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
}