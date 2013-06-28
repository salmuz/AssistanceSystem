package clases;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: salmuz
 * Date: 28/06/13
 * Time: 19:17
 * To change this template use File | Settings | File Templates.
 */
public class DetalleAsistencia implements Serializable {

    private int codigoDetalleAsistencia;
    private Alumno alumno;
    private boolean asistio;
    private boolean tardanza;

    public DetalleAsistencia() {

    }

    public DetalleAsistencia(Alumno alumno, boolean asistio, boolean tardanza) {
        this.alumno = alumno;
        this.asistio = asistio;
        this.tardanza = tardanza;
    }

    public boolean isTardanza() {
        return tardanza;
    }

    public void setTardanza(boolean tardanza) {
        this.tardanza = tardanza;
    }

    public boolean isAsistio() {
        return asistio;
    }

    public void setAsistio(boolean asistio) {
        this.asistio = asistio;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public int getCodigoDetalleAsistencia() {
        return codigoDetalleAsistencia;
    }

    public void setCodigoDetalleAsistencia(int codigoDetalleAsistencia) {
        this.codigoDetalleAsistencia = codigoDetalleAsistencia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DetalleAsistencia)) return false;

        DetalleAsistencia that = (DetalleAsistencia) o;

        if (codigoDetalleAsistencia != that.codigoDetalleAsistencia) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return codigoDetalleAsistencia;
    }
}
