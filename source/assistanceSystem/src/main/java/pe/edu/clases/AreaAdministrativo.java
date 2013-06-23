package pe.edu.clases;


/**
 * @(#)AdministradorArea.java
 *
 *
 * @author
 * @version 1.00 2013/6/16
 */
public class AreaAdministrativo {

    private String codAdmistrativo;
    private String codArea;

    public AreaAdministrativo() {
    }

    public AreaAdministrativo(String codAr, String codAdm) {
        this.codAdmistrativo = codAdm;
        this.codArea = codAr;
    }

    public void setCodAdmistrativo(String codAdm) {
        this.codAdmistrativo = codAdm;
    }

    public void setCodArea(String codAr) {
        this.codArea = codAr;
    }

    public String getCodAdmistrativo() {
        return codAdmistrativo;
    }

    public String getCodArea() {
        return codArea;
    }

    public String toString() {
        String mensaje = " ";
        mensaje = " Area :" + getCodArea() + "Administrativo : " + getCodAdmistrativo();
        return mensaje;
    }
}