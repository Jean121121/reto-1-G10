package programacion.src;

enum Situacion {
    APROBADO,
    NO_SUPERADO,
    PENDIENTE;
}
public class TrabajadorCurso {
    private Trabajador trabajador;
    private Curso curso;
    Situacion situacion;

    public TrabajadorCurso(Trabajador trabajador, Curso curso) {
        this.trabajador=trabajador;
        this.curso=curso;
        this.situacion=Situacion.PENDIENTE;
    }

    public Trabajador getTrabajador() {
        return this.trabajador;
    }
    public Curso getCurso() {
        return this.curso;
    }
    public Situacion getSituacion() {
        return this.situacion;
    }
    public void setTrabajador(Trabajador trabajador) {
        this.trabajador=trabajador;
    }
    public void setCurso(Curso curso) {
        this.curso=curso;
    }
    public void setSituacion(Situacion situacion) {
        this.situacion=situacion;
    }

    @Override
    public String toString() {
        return "Curso: " + this.curso.getIdcurso() + ". Nombre: " + this.curso.getNombre() + ". Fecha de imparticion: " + this.curso.getfechaImp() + ". Situacion: " + situacion.name().replace("_", " ");
    }
}
