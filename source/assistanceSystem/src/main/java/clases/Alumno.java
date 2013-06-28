package clases;

import java.io.Serializable;

public class Alumno extends Persona implements Serializable {

    private String codigo;
    private String promocion; 

    public Alumno() {
    }

    public Alumno(String dni, String nombre,String codigo,String promocion){
        this.dni = dni;
        this.codigo = codigo;
        this.nombre = nombre;
        this.promocion = promocion;
    }


    /**
     * @return the codigo

     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the promocion
     */
    public String getPromocion() {
        return promocion;
    }

    /**
     * @param promocion the promocion to set
     */
    public void setPromocion(String promocion) {
        this.promocion = promocion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Alumno)) return false;

        Alumno alumno = (Alumno) o;

        if (codigo != null ? !codigo.equals(alumno.codigo) : alumno.codigo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return codigo != null ? codigo.hashCode() : 0;
    }
}