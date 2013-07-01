package clases;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Alumno extends Persona implements Serializable {

    private String codigo;
    private String promocion; 
    int length;
    List<Alumno> al = new ArrayList<Alumno>();

    public Alumno() {
    }

    public Alumno(String dni, String nombre,String codigo,String promocion){
        this.dni = dni;
        this.codigo = codigo;
        this.nombre = nombre;
        this.promocion = promocion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getPromocion() {
        return promocion;
    }

    public void setPromocion(String promocion) {
        this.promocion = promocion;
    }

    public static Alumno buscarAlu(String codigo, List<Alumno> al) {
        Alumno a = null;
        for (Alumno alu : al) {
            if (alu.getCodigo().equals(codigo)) {
                a = alu;
            }
        }
        return a;
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