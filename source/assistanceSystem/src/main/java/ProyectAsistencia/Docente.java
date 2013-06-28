package ProyectAsistencia;

import java.util.Scanner;

public class Docente extends Usuario{
	
    private String nombre;
    private String codigo;

    public Docente(){
    }	
    
    public Docente(String nom, String cod) {
    	this.nombre = nom;
    	this.codigo = cod;
    }
    public void setNombre(String nom){
    	this.nombre = nom;
    }
    
    public void setCodigo(String cod){
            this.codigo = cod;
    }

    public String getCod(){
            return codigo;
    }

    public String getNom(){
            return nombre;
    }    

    public String toString(){
    	return "    \t\t\t\t   "+getCod()+"\t\t\t    "+getNom();
    			//"Docente: "+getNom()+"\n"+
    		   	//"Codigo:  "+getCod()+"\n";
    		  	// "Curso:   "+getCurso();
    		  
    }
}