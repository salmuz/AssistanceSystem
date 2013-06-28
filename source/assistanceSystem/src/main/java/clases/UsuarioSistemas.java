package clases;

import java.io.Serializable;


public class UsuarioSistemas extends Persona  implements Serializable{

    private String usuario;
    private String password;

    public UsuarioSistemas(){
    }

    public UsuarioSistemas(String dni, String nom, String password, String usuario) {
        super(dni, nom);
        this.password = password;
        this.usuario = usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
