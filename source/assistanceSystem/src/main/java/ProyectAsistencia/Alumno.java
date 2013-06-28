package ProyectAsistencia;

public class Alumno  extends Persona{
	private String ciclo;// en curso 
    
    public Alumno (){
    }
   	
    public Alumno(String nom, String cod, String ciclo) {
    	this.nombre = nom;
    	this.codigo = cod;
    	this.ciclo = ciclo;
    }
    
    public void setNombre(String nom){
    	nombre = nom;
    }
    
	public void setCodigo(String cod){
		codigo = cod;
	}

    public void setCiclo(String ciclo){
    	this.ciclo = ciclo;
    }
    
	public String getCod(){
		return codigo;
	}
	
	public String getNom(){
		return nombre;
	}    
    
    public String getCiclo(){
    	return ciclo;
    }
    
    public String toString(){
    	return "  \t\t "+getCod()+"\t\t\t "+getNom()            +"\t\t\t\t\t  "+getCiclo();
    		
    			//"Alumno: "+getNom()+"\n"+
    		    //"Codigo: "+getCod()+"\n"+
    		    //"Ciclo:  "+getCiclo()+"\n";		   
    		   
    }
    
}