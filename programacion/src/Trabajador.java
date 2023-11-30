package programacion.src;

public class Trabajador {
    // Atributos
    private int idempleado;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String fechaNacimiento;
    private String puesto;
    private String localizacion;
    private String descripcion;

    // Constructor
    public Trabajador(int idempleado, String nombre, String apellido1, String apellido2,
                      String fecha_nacimineto, String puesto,
                      String localizacion, String descripcion){
        this.idempleado=idempleado;
        this.nombre=nombre;
        this.apellido1=apellido1;
        this.apellido2=apellido2;
        this.fechaNacimiento=fecha_nacimineto;
        this.puesto=puesto;
        this.localizacion=localizacion;
        this.descripcion=descripcion;
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
    public String getPuesto() {
        return this.puesto;
    }
    public String getLocalizacion() {
        return this.localizacion;
    }
    public String getDescripcion() {
        return this.descripcion;
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
    public void setLocalizacion(String localizacion) {
        this.localizacion=localizacion;
    }
    public void setPuesto(String puesto) {
        this.puesto=puesto;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion=descripcion;
    }

    // Metodos de la clase
    public void mostrarPerfil(){
        System.out.println("Id del empleado: " + getIdempleado() + ", Nombre: " + getNombre() +
                ", Primer apellido: " + getApellido1() + ", Segundo apellido: " + getApellido2() +
                ", Fecha nacimiento: " + getFechaNacimiento() + ", Puesto: " + getPuesto() +
                ", Localizacion: " + getLocalizacion() + ", Descripcion: " + getDescripcion());
    }
    public void modificarDatos(int idempleado, String nombre,String apellido1, String apellido2,
                               String fechaNacimineto, String puesto,
                               String localizacion,String descripcion){
        setIdempleado(idempleado);
        setNombre(nombre);
        setApellido1(apellido1);
        setApellido2(apellido2);
        setFechaNacimiento(fechaNacimineto);
        setPuesto(puesto);
        setLocalizacion(localizacion);
        setDescripcion(descripcion);
    }
    public void visualizarcursos(){

    }
    public void añadircurso(){

    }
    public void borrarcurso(){

    }



    public static void main(String[] args) {

    }
}
