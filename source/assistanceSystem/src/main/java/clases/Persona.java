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

    /**
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
}