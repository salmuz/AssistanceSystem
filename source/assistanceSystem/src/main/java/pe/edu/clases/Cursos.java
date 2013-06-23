package pe.edu.clases;


/**
 * @(#)Cursos.java
 *
 * @Proyecto: Asistencia
 *
 * @author : Carranza Alarcon Marelynn Juarez Magallanes Karol Lopez Pariona
 * Sandra
 */
public class Cursos {

    private String nom;
    private String cod;

    public Cursos(String codigo, String nombre) {
        this.cod = codigo;
        this.nom = nombre;
    }

    public void setNom(String nombre) {
        nom = nombre;
    }

    public void setCod(String codigo) {
        cod = codigo;
    }

    public String getNom() {
        return nom;
    }

    public String getCod() {
        return cod;
    }

    public String toString() {
        return getCod() + getNom();
    }
    /* public void buscar(String curso){

     int sw = 0;
     if(sw==0){
     for(int i = 0; i <3; i++ ){
     if(cur1[i]==curso){
     System.out.println("Curso: "+cur1[i]);
     sw = 1;
     }else{
     if(cur2[i] == curso){
     System.out.println("Curso: "+cur2[i]);
     sw = 1;
     }else{
     if(cur3[i]== curso){
     System.out.println("Curso: "+cur3[i]);
     sw = 1;	
     }
     }
     }
     }	
     }
     if(sw==0){
     System.out.println("Curso: "+curso+" No Existe");
     }
     }*/
    /*public void listarCursos1(){
     int i;
     System.out.println("--------------------------------");
     System.out.println("\t  CURSOS DEL PRIMER CICLO");
     System.out.println("--------------------------------");
     for(i=0; i< cur1.length; i++){
     System.out.println("["+(i+1)+"] "+cur1[i]);
     }
     System.out.println("--------------------------------");	
     }
    
     public void listarCursos2(){
     int i;
     System.out.println("--------------------------------");
     System.out.println("\t CURSOS DEL SEGUNDO CICLO");
     System.out.println("--------------------------------");
     for(i=0; i< cur2.length; i++){
     System.out.println("["+(i+1)+"] "+cur2[i]);
     }
     System.out.println("--------------------------------");	
     }
    
     public void listarCursos3(){
     int i;
     System.out.println("--------------------------------");
     System.out.println("\t  CURSOS DEL TERCER CICLO");
     System.out.println("--------------------------------");
     for(i=0; i< cur3.length; i++){
     System.out.println("["+(i+1)+"] "+cur3[i]);
     }
     System.out.println("--------------------------------");	
     }*/
}