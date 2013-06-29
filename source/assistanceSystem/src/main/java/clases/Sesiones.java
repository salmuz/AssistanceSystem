package clases;

import java.io.Serializable;
import java.util.Date;

public class Sesiones implements Serializable{

    private int codigoSesion;
    private Date horaIni;
    private Date horaFinal;
    private String dia;
    private String tipoSesion; // T=teoria L=laboratorio P=practica
    
    private Grupo  grupo;

    public Sesiones() {
    }

    public Sesiones(int codigoSesion, Date horaIni, Date horaFinal, String dia, String tipoSesion, Grupo grupo) {
        this.codigoSesion = codigoSesion;
        this.horaIni = horaIni;
        this.horaFinal = horaFinal;
        this.dia = dia;
        this.tipoSesion = tipoSesion;
        this.grupo = grupo;
    }

    public int getCodigoSesion() {
        return codigoSesion;
    }

    public void setCodigoSesion(int codigoSesion) {
        this.codigoSesion = codigoSesion;
    }

    public Date getHoraIni() {
        return horaIni;
    }

    public void setHoraIni(Date horaIni) {
        this.horaIni = horaIni;
    }

    public Date getHoraFinal() {
        return horaFinal;
    }

    public void setHoraFinal(Date horaFinal) {
        this.horaFinal = horaFinal;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getTipoSesion() {
        return tipoSesion;
    }

    public void setTipoSesion(String tipoSesion) {
        this.tipoSesion = tipoSesion;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }
    
    


    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Sesiones other = (Sesiones) obj;
        if (this.codigoSesion != other.codigoSesion) {
            return false;
        }
        return true;
    }
    

}