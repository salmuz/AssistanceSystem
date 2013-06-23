package pe.edu.clases;


/**
 * @(#)Aula.java
 *
 *
 * @author
 * @version 1.00 2013/6/14
 */
import java.util.Scanner;

public class Aula {

    protected Alumno alu[];
    private int ind;

    public Aula() {
        alu = new Alumno[9];
    }
    Scanner mat = new Scanner(System.in);

    public void aluRegistrado() {
        String nom[] = {"Christian Quispe", "Maria Sanchez", "Jordy Villazana", "Rocio Salcedo", "Karla Correa", "Oscar Rosales", "Mirya Huachua", "Sebastin Perez", "Liset Montes"};
        String cod[] = {"132", "120", "112", "122", "113", "131", "126", "127", "119"};
        alu = new Alumno[9];
        for (int i = 0; i < alu.length; i++) {
            alu[i] = new Alumno(cod[i], nom[i]);
        }
    }

    public void ciclo(String cod) {
        for (int i = 0; i < alu.length; ind++) {
            String b = cod.substring(0, 2);
            int a = Integer.parseInt(b);
            switch (a) {
                case 11:
                    alu[i].setCiclo("III Ciclo");
                    break;
                case 12:
                    alu[i].setCiclo("II Ciclo");
                    break;
                case 13:
                    alu[i].setCiclo("I Ciclo");
                    break;
            }

        }
        /* int b;
         for(int ind = 0 ; ind < alu.length ; ind++ ){
         a = alu[ind].getCod().substring(0,2);
         b = Integer.parseInt(a);
         switch(b){
         case 11:
         alu[ind].setCiclo("III Ciclo");
         break;
         case 12:
         alu[ind].setCiclo("II Ciclo");
         break;
         case 13:
         alu[ind].setCiclo("I Ciclo");
         break;
         }
         }*/
    }

    public String consulta2(String codigo) {
        String nombre = "";
        for (int i = 0; i < alu.length; i++) {
            if (codigo.equals(alu[i].getCod())) {
                nombre = alu[i].getNom();

            }
        }
        return nombre;
    }

    public void horario() {
        String h1[] = {"Algoritmica I", "Calculo I", "Matematica Basica", "Comp e Informatica", "Taller de tecnicas", "Teoria de Sistemas"};
        String h2[] = {"Algoritmica II", "Calculo II", "Matematica Basica II", "Fisica", "Estructura de Datos", "Economia"};
        String h3[] = {"Algoritmica III", "Estadistica", "Matematica Discreta", "Electromagnetismo", "Dise�o Grafico", "Organizacion y Administracion"};


    }

    public void busquedad(String codi) {
        aluRegistrado();
        int i = 0;
        int hallado = 0;

        while (i < alu.length && hallado == 0) {
            if (codi.compareTo(alu[i].getCod()) == 0) {
                //System.out.println("Alumno registrado");
                System.out.println(alu[i]);
                i = alu.length;
                hallado = 1;

            }
            i = i + 1;
        }
        if (hallado == 0) {
            System.out.println("No se encuentra en el sistema");
            adicionar();
            mostrar();
        }
    }

    public void adicionar() {
        String nom, cod;
        Alumno val[];
        int i;
        redimensionar();
        System.out.print("Ingrese Nuevo Codigo (de base 11 a 13): ");
        cod = mat.nextLine();
        System.out.print("Ingrese Nuevo Nombre : ");
        nom = mat.nextLine();
        i = alu.length - 1;
        val = new Alumno[alu.length];
        val[i] = new Alumno(cod, nom);
        alu[i] = val[i];

    }

    public void redimensionar() {
        Alumno x[] = new Alumno[alu.length + 1];
        for (int i = 0; i < alu.length; i++) {
            x[i] = alu[i];
        }
        alu = x;
    }

    public void mostrar() {
        for (int i = 0; i < alu.length; i++) {
            System.out.println(alu[i]);
        }
    }
}