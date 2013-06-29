package clases;

import java.io.Serializable;

public class Administrativo extends UsuarioSistemas implements Serializable {

    private Area area;
    private String codigo;

    public Administrativo() {
    }

    public Administrativo(String dni, String nom, String password, String usuario, Area area, String codigo) {
        super(dni, nom, password, usuario);
        this.area = area;
        this.codigo = codigo;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Administrativo)) return false;

        Administrativo that = (Administrativo) o;

        if (codigo != null ? !codigo.equals(that.codigo) : that.codigo != null) return false;

        return true;
    }

    public int hashCode(){
        return codigo != null ? codigo.hashCode() : 0;
    }
}