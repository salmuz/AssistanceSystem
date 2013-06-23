package pe.edu.clases;

import java.io.Serializable;


/**
 *
 * @author alumno
 */
public class Administrador  implements Serializable{
    
    private String usuario;
    private String password;

    Administrador(){

    }

    public Administrador(String usuario, String password){
        this.password = password;
        this.usuario = usuario;
    }

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
