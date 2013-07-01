package clases;

import java.io.Serializable;

public class Docente extends UsuarioSistemas implements Serializable {
	
    private String codigo;

    public Docente(){
        
    }

    public Docente(String dni, String nom, String password, String usuario, String codigo) {
        super(dni, nom, password, usuario);
        this.codigo = codigo;
    }

    public void setNombre(String nom){
    	    this.setNombre(nom);
    }
    
    public void setCodigo(String cod){
            this.codigo = cod;
    }

    public String getCod(){
            return codigo;
    }


    @Override
    public String toString() {
        return "Docente{" +
                "codigo='" + codigo + '\'' +
                '}';
    }
}