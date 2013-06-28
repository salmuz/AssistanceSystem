package ProyectAsistencia;

public class Grupo {

    private String codigo;
    private int aula;
    private int cantAlu;
    private int nroGrupo;
    private Docente docente;
    private Cursos cursos;
    private Alumno alumno;
    
    public Grupo() {
    }
    
    public Grupo(Cursos cursos, int nroGrupo, int aula, int cantAlu,Docente docente){
    //	this.codigo = codigo;
        this.aula = aula;
        this.cantAlu = cantAlu;
        this.nroGrupo = nroGrupo;
        this.docente = docente;
        this.cursos = cursos;
    }
    
    public void setAula(int aula){
    	this.aula = aula;
    }
    
    public int getAula(){
    	return aula;
    }
    
    public void setCantAlu(int cantAlu){
    	this.cantAlu = cantAlu;
    }
    
    public int getCantAlun(){
    	return cantAlu;
    }
    
    public void setNroGrupo(int nroGrupo){
    	this.nroGrupo = nroGrupo;
    }
    
    public int getNroGrupo(){
    	return nroGrupo;
    }
    
    public String toString(){
    	return "Grupo "+this.nroGrupo;
    }
}