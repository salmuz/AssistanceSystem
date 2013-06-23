package pe.edu.clases;


/**
 * @(#)VDocente.java
 *
 *
 * @author
 * @version 1.00 2013/6/15
 */
import java.util.Scanner;

public class VDocente {

    Docente doc[];
    Scanner mat = new Scanner(System.in);

    public VDocente() {
        doc = new Docente[12];
    }

    public void docRegistrado() {
        String nom[] = {"Salinas", "Carhuamaca", "Pardo", "Castro", "Gamboa", "Solis", "Neihl", "Carhuamaca", "Vilcapoma", "Simpe", "Salinas", "Recavarren", "Melo", "Arba�il", "Quinto", "Vilcapoma", "Molina", "Canepa"};
        String cod[] = {"111", "222", "333", "444", "555", "666", "777", "222", "999", "888", "111", "604", "605", "606", "607", "999", "608", "609"};
        doc = new Docente[12];
        for (int i = 0; i < doc.length; i++) {
            doc[i] = new Docente(cod[i], nom[i]);
        }
    }

    public String consulta1(String codigo) {
        String nombre = "";
        for (int i = 0; i < doc.length; i++) {
            if (codigo.equals(doc[i].getCod())) {
                nombre = doc[i].getNom();

            }
        }
        return nombre;
    }

    public void busquedad(String codi) {
        docRegistrado();
        int i = 0;
        int hallado = 0;

        while (i < doc.length && hallado == 0) {
            if (codi.compareTo(doc[i].getCod()) == 0) {
                //System.out.println("Alumno registrado");
                System.out.println(doc[i]);
                i = doc.length;
                hallado = 1;

            }
            i = i + 1;
        }
        if (hallado == 0) {
            System.out.println("No se encuentra en el sistema");
            adicionar();
            mostrar1();
        }
    }

    public void adicionar() {
        String nom, cod;
        Docente val[];
        int i;
        redimensionar();
        System.out.print("Ingrese Nuevo Codigo : ");
        cod = mat.nextLine();
        System.out.print("Ingrese Nuevo Nombre : ");
        nom = mat.nextLine();
        i = doc.length - 1;
        val = new Docente[doc.length];
        val[i] = new Docente(cod, nom);
        doc[i] = val[i];

    }

    public void redimensionar() {
        Docente x[] = new Docente[doc.length + 1];
        for (int i = 0; i < doc.length; i++) {
            x[i] = doc[i];
        }
        doc = x;
    }

    public void mostrar1() {
        for (int i = 0; i < doc.length; i++) {
            System.out.println(doc[i]);
        }
    }
}