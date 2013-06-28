package ProyectAsistencia;


public class Asistemcia {
	
    private String silabxSem;
    private Docente docene;
    private Alumno alumno;
	
    public Asistemcia() {
    }
    
    public void setSilaxSem(String silaxSem){
    	this.silabxSem = silaxSem;
    }
    
    public String getSilaxSem(){
    	return silabxSem;
    }
    
    public String toString(){
    	return "  " + silabxSem;
    }
    
    
}