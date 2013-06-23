package pe.edu.clases;


/**
 * @(#)VAdministrativo.java
 *
 *
 * @author
 * @version 1.00 2013/6/16
 */
import java.util.Scanner;

public class VAdministrativo {

    protected Administrativo ad[];
    Scanner mat = new Scanner(System.in);

    public VAdministrativo() {
        ad = new Administrativo[5];
    }

    public void AdRegistrado() {
        String nom[] = {"Sandra Sanches", "Maribel Trujillo", "Carlos Carrero", "Marco Tenorio", "Angel Paredes", "Sofia Molina"};
        String cod[] = {"10", "11", "12", "13", "14", "15"};
        ad = new Administrativo[5];
        for (int i = 0; i < ad.length; i++) {
            ad[i] = new Administrativo(cod[i], nom[i]);
        }
    }

    public String consulta4(String codigo) {
        String nombre = "";
        for (int i = 0; i < ad.length; i++) {
            if (codigo.equals(ad[i].getCod())) {
                nombre = ad[i].getNom();
            }
        }
        return nombre;
    }

    public void busquedad(String codi) {
        AdRegistrado();
        int i = 0;
        int hallado = 0;

        while (i < ad.length && hallado == 0) {
            if (codi.compareTo(ad[i].getCod()) == 0) {
                //System.out.println("Alumno registrado");
                System.out.println(ad[i]);
                i = ad.length;
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
        Administrativo val[];
        int i;
        redimensionar();
        System.out.print("Ingrese Nuevo Codigo : ");
        cod = mat.nextLine();
        System.out.print("Ingrese Nuevo Nombre : ");
        nom = mat.nextLine();
        i = ad.length - 1;
        val = new Administrativo[ad.length];
        val[i] = new Administrativo(cod, nom);
        ad[i] = val[i];

    }

    public void redimensionar() {
        Administrativo x[] = new Administrativo[ad.length + 1];
        for (int i = 0; i < ad.length; i++) {
            x[i] = ad[i];
        }
        ad = x;
    }

    public void mostrar() {
        for (int i = 0; i < ad.length; i++) {
            System.out.println(ad[i]);
        }
    }
}