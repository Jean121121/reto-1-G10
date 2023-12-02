package programacion.src;

import com.sun.source.doctree.HiddenTree;

import java.util.ArrayList;

enum Puesto {
    RESPONSABLE_DE_ESTACION("Son los encargados de dirigir la circulación de los trenes en una estación y el jefe del personal de las estaciones y trenes", "Estacion ferroviaria"),
    MANTENIMIENTO("Son los encargados de revisar que tanto las estaciones como el tren estén en buen estado", "Movil"),
    LOGISTICA("Son lo encargados de planificar, gestionar y controlar la agilidad en el transporte", "Movil"),
    CONDUCTOR("Son los encargados de manejar el tren.", "Casco urbano");

    private final String descripcion;
    private final String localizacion;

    Puesto(String descripcion, String localizacion) {
        this.descripcion=descripcion;
        this.localizacion=localizacion;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    public String getLocalizacion() {
        return this.localizacion;
    }
}
public class Trabajador {
    // Atributos
    private int idempleado;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String fechaNacimiento;
    private Puesto puesto;
    public ArrayList<TrabajadorCurso> listacursos;

    // Constructor
    public Trabajador(int idempleado, String nombre, String apellido1, String apellido2,
                      String fecha_nacimineto, Puesto puesto){
        this.idempleado=idempleado;
        this.nombre=nombre;
        this.apellido1=apellido1;
        this.apellido2=apellido2;
        this.fechaNacimiento=fecha_nacimineto;
        this.puesto=puesto;
        this.listacursos = new ArrayList<>();
    }

    // Getters y Setters
    public int getIdempleado() {
        return this.idempleado;
    }
    public String getNombre() {
        return this.nombre;
    }
    public String getApellido1() {
        return this.apellido1;
    }
    public String getApellido2() {
        return this.apellido2;
    }
    public String getFechaNacimiento() {
        return this.fechaNacimiento;
    }
    public Puesto getPuesto() {
        return this.puesto;
    }
    public ArrayList<TrabajadorCurso> getListacursos() {
        return this.listacursos;
    }
    public void setIdempleado(int idempleado) {
        this.idempleado=idempleado;
    }
    public void setNombre(String nombre) {
        this.nombre=nombre;
    }
    public void setApellido1(String apellido1) {
        this.apellido1=apellido1;
    }
    public void setApellido2(String apellido2) {
        this.apellido2=apellido2;
    }
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento=fechaNacimiento;
    }
    public void setPuesto(Puesto puesto) {
        this.puesto=puesto;
    }

    // Metodos de la clase
    @Override
    public String toString() {
        return "Trabajador: " + idempleado + ". Nombre: " + nombre + ". Apellidos: " + apellido1 + " " + apellido2 +
                ". Fecha nacimiento: " + fechaNacimiento +". Puesto: " + puesto.name().replace("_", " ") + ". Descripcion: " + puesto.getDescripcion() + ". Localizacion: " + puesto.getLocalizacion() ;
    }
    public void mostrarPerfil(){
        System.out.println(this.toString());
    }
    public void modificarDatos(int idempleado, String nombre,String apellido1, String apellido2,
                               String fechaNacimineto, Puesto puesto){
        setIdempleado(idempleado);
        setNombre(nombre);
        setApellido1(apellido1);
        setApellido2(apellido2);
        setFechaNacimiento(fechaNacimineto);
        setPuesto(puesto);
    }
    public void visualizarcursos(){
        for (int i=0; i<listacursos.size(); i++) {
            System.out.println(listacursos.get(i).toString());
        }
    }
    public void agregarcurso(Curso curso){
        TrabajadorCurso c1 = new TrabajadorCurso(this, curso);
        listacursos.add(c1);
    }
    public void borrarcurso(Curso curso){
        TrabajadorCurso c1 = new TrabajadorCurso(this, curso);
        listacursos.remove(c1);
    }
}
