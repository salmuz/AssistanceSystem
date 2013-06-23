package pe.edu.clases;

/**
 * @(#)Persona.java
 *
 *
 * @author 
 * @version 1.00 2011/9/20
 */


public class Persona {
	protected String codigo;
	protected String nombre;	
	
	public Persona(){	
	}	
	public Persona(String cod, String nom){
		codigo=cod;
		nombre=nom;
	}
	public void  setCod(String codigo){
	  this.codigo = codigo;
	}
	public void  setNombre(String nom){
	  this.nombre = nom;
	}
	public String getCod(){
	  return this.codigo;
	}
	public String getNombre(){
	  return this.nombre;
	}
}