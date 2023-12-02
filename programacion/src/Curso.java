package programacion.src;

public class Curso {
    // Atributos
    private int idcurso;
    private String nombre;
    private String fechaImp;

    // Constructor
    public Curso (int idcurso, String nombre,
                  String fechaImp) {
        this.idcurso=idcurso;
        this.nombre=nombre;
        this.fechaImp=fechaImp;
    }

    // Getters y Setters
    public int getIdcurso() {
        return this.idcurso;
    }
    public String getNombre() {
        return this.nombre;
    }
    public String getfechaImp() {
        return this.fechaImp;
    }
    public void setIdcurso(int idcurso) {
        this.idcurso=idcurso;
    }
    public void setNombre(String nombre) {
        this.nombre=nombre;
    }
    public void setFechaImp(String fechaImp) {
        this.fechaImp=fechaImp;
    }

    // Metodos
    @Override
    public String toString() {
        return "Curso: " + idcurso + ", Nombre: " + nombre + ", Fecha: " + fechaImp;
    }
    public void cambiarSituacion(TrabajadorCurso trabajadorCurso, String situacion) {
        trabajadorCurso.setSituacion(situacion);
    }
}
