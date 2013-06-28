package clases;

import java.io.Serializable;
import java.util.Date;

public class Sesiones implements Serializable{

    private Date horIni;
    private Date horFinal;
    private String tipoSesion;
    private Grupo  grupo;

    public Sesiones() {
    }

    public void setTipoSesion(String tipoSesion) {
        this.tipoSesion = tipoSesion;
    }

    public String getTipoSesion() {
        return tipoSesion;
    }

    public String toString() {
        return "Tipo de Sesion" + tipoSesion;
    }


}