package pe.edu.clases;


/**
 * @(#)VAdministrativoArea.java
 *
 *
 * @author
 * @version 1.00 2013/6/16
 */
public class VAreaAdministrativo {

    AreaAdministrativo ar[];

    public VAreaAdministrativo() {
        ar = new AreaAdministrativo[6];
    }

    public void arRegistrado() {
        String area[] = {"100", "100", "200", "300", "400", "500"};
        String administrativo[] = {"10", "11", "12", "13", "14", "15"};
        ar = new AreaAdministrativo[6];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = new AreaAdministrativo(area[i], administrativo[i]);
        }
    }

    public void mostrar() {
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }
    }

    public void AreaAsiganadosPorAdministrativo(String admi, VArea a) {

        for (int i = 0; i < ar.length; i++) {
            if (admi.equals(ar[i].getCodAdmistrativo())) {
                System.out.println("Area " + a.consulta3(ar[i].getCodArea()));
            }
        }
    }
}