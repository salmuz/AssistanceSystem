package ProyectAsistencia;
 
import java.util.Scanner;

public class Administrativo extends Usuario{
	
	Scanner d = new Scanner(System.in);
	private String nombre;
	private String codigo;
	private String area;
    
    public Administrativo(String cod, String nom) {
    	super(cod,nom);
    }
    
	public Administrativo(){
	}
	
    public void setNombre(String nom){
    	this.nombre = nom;
    }
    
	public void setCodigo(String cod){
		this.codigo = cod;
	}

    public void setArea(String area){
    	this.area = area;
    }
    

	public String getCod(){
		return codigo;
	}
	
	public String getNom(){
		return nombre;
	}    
    
    public String getArea(){
    	return area;
    }
    
    public String toString(){
    	return "  \t\t\t\t\t "+getCod()+"  \t\t\t\t   "+getNom();
    			
    			//"Aministrativo: "+getNom()+"\n"+
    		   	//"Codigo:        "+getCod()+"\n";
    		   	//"Area Adm.:     "+getArea();
    		  
    } 
    
    
}