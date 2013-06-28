package ProyectAsistencia;

public class Cursos {
	
	private String nom;
	private String cod;
	private String ciclo;
	
	public Cursos(String codigo,String nombre,String ciclo){
		this.cod=codigo;
		this.nom=nombre;
		this.ciclo=ciclo;
	}
	
	public void setNom(String nombre){
		this.nom = nombre;
	}
	
	public void setCod(String codigo){
		this.cod = codigo;	
	}
	
	public void setCiclo(String ciclo){
		this.ciclo = ciclo;	
	}

	public String getNom(){
		return nom;
	}
	
	public String getCod(){
		return cod;
	}
	
	public String getCiclo(){
		return ciclo;
	}
	
	public String toString(){
		return getCod()+" \t\t\t"+getNom()+ "  "+getCiclo();
	}


}