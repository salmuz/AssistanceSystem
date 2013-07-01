package clases;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Asistemcia implements Serializable {

    private int codigoAsistencia;
    private Sesiones sesiones;
    private List<DetalleAsistencia> detalleAsistencias;
	
    public Asistemcia() {
        detalleAsistencias = new ArrayList<DetalleAsistencia>();
    }

    public Sesiones getSesiones() {
        return sesiones;
    }

    public void setSesiones(Sesiones sesiones) {
        this.sesiones = sesiones;
    }

    public int getCodigoAsistencia() {
        return codigoAsistencia;
    }

    public void setCodigoAsistencia(int codigoAsistencia) {
        this.codigoAsistencia = codigoAsistencia;
    }

    public List<DetalleAsistencia> getDetalleAsistenciaList() {
        return detalleAsistencias;
    }

    public void anadirAsistenciaAlumno(DetalleAsistencia detalleAsistencia){
        detalleAsistencias.add(detalleAsistencia);
    }

    public void eliminarAsistenciaAlumno(int codigo){
        DetalleAsistencia detalleAsistencia = new DetalleAsistencia();
        detalleAsistencia.setCodigoDetalleAsistencia(codigo);
        detalleAsistencias.remove(detalleAsistencia);
    }

    public DetalleAsistencia buscarAsistenciaAlumno(int codigo){
        DetalleAsistencia detalleAsistencia = new DetalleAsistencia();
        detalleAsistencia.setCodigoDetalleAsistencia(codigo);
        return detalleAsistencias.get(detalleAsistencias.indexOf(detalleAsistencia));
    }

}