package ProyectAsistencia;

public class Usuario extends Persona {
    
    private String usuario;
    private String password;
    private Docente docente;
    private Administrativo administrativo;
    
    public Usuario(){
    }
    
    public Usuario(String usuario,String password){
        this.usuario = usuario;
        this.password = password;
    }

    public Usuario(String usuario){
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
