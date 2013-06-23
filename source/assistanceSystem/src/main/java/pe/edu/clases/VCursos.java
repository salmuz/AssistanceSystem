package pe.edu.clases;


/**
 * @(#)VCursos.java
 *
 *
 * @author
 * @version 1.00 2013/6/15
 */
import java.util.Scanner;

public class VCursos {

    protected Cursos cu[];
    Scanner mat = new Scanner(System.in);

    public VCursos() {
        cu = new Cursos[18];

    }

    public void cuRegistrado() {
        String nom[] = {"Algoritmica I", "Calculo I", "Matematica Basica", "Comp e Informatica", "Taller de tecnicas", "Teoria de Sistemas", "Algoritmica II", "Calculo II", "Matematica Basica II", "Fisica", "Estructura de Datos", "Economia", "Algoritmica III", "Estadistica", "Matematica Discreta", "Electromagnetismo", "Dise�o Grafico", "Organizacion y Administracion"};
        String cod[] = {"721", "731", "741", "751", "761", "771", "722", "732", "742", "752", "762", "772", "723", "733", "743", "753", "763", "773"};
        cu = new Cursos[18];
        for (int i = 0; i < cu.length; i++) {
            cu[i] = new Cursos(cod[i], nom[i]);
        }
    }

    public void mostrar() {
        for (int i = 0; i < cu.length; i++) {
            System.out.println(cu[i]);
        }


    }

    public String consulta(String codigo) {
        String nombre = "";
        for (int i = 0; i < cu.length; i++) {
            if (codigo.equals(cu[i].getCod())) {
                nombre = cu[i].getNom();
            }
        }
        return nombre;
    }
}