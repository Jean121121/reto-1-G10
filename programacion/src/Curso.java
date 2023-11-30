package programacion.src;

public class Curso {
    // Atributos
    private int idcurso;
    private String nombre;
    private String fechaImp;
    private String situacion;

    // Constructor
    public Curso (int idcurso, String nombre,
                  String fechaImp, String situacion) {
        this.idcurso=idcurso;
        this.nombre=nombre;
        this.fechaImp=fechaImp;
        this.situacion=situacion;
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
    public String getSituacion() {
        return this.situacion;
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
    public void setSituacion(String situacion) {
        this.situacion=situacion;
    }

    // Metodos
    public void cambiarSituacion(String situacion) {
        setSituacion(situacion);
    }
}
