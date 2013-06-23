package pe.edu.clases;


/**
 * @(#)VArea.java
 *
 *
 * @author
 * @version 1.00 2013/6/16
 */
import java.util.Scanner;

public class VArea {

    protected Area a[];
    Scanner mat = new Scanner(System.in);

    public VArea() {
        a = new Area[5];
    }

    public void areaRegistrada() {
        String nom[] = {"Unidad Economica", "Unidad de Matricula", "Soporte Tecnico", "Unidad Academica", "Unidad de Posgrado"};
        String cod[] = {"100", "200", "300", "400", "500"};
        a = new Area[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = new Area(cod[i], nom[i]);
        }
    }

    public void mostrar() {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public String consulta3(String codigo) {
        String nombre = "";
        for (int i = 0; i < a.length; i++) {
            if (codigo.equals(a[i].getCod())) {
                nombre = a[i].getNom();
            }
        }
        return nombre;
    }
}