package ProyectAsistencia;

import java.util.Date;
public class Sesiones {
	
	private Date horIni;
	private Date horFinal;
	private String tipoSesion;
	private Docente doc;
	private Cursos cursos;
    public Sesiones() {
    }
    
    public void setTipoSesion(String tipoSesion){
    	this.tipoSesion = tipoSesion;
    }
    
    public String getTipoSesion(){
    	return tipoSesion;
    }
    
    public String toString(){
    	return "Tipo de Sesion" + tipoSesion;
    }
    
    
}