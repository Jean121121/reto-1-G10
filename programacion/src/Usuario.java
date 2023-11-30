package programacion.src;

public class Usuario {
    // Atributos
    private int idusuario;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String fechaNacimiento;
    private String email;

    // Constructor
    public Usuario (int idusuario, String nombre,
                    String apellido1, String apellido2,
                    String fechaNacimiento, String email) {
        this.idusuario=idusuario;
        this.nombre=nombre;
        this.apellido1=apellido1;
        this.apellido2=apellido2;
        this.fechaNacimiento=fechaNacimiento;
        this.email=email;
    }

    // Getters y Setters
    public int getIdusuario() {
        return this.idusuario;
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
    public String getEmail() {
        return this.email;
    }
    public void setIdusuario(int idusuario) {
        this.idusuario=idusuario;
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
    public void setEmail(String email) {
        this.email=email;
    }

    // Metodos
    public void verViajes() {

    }
    public void recogerInfoViajes(String tiempo, String ocupacion) {

    }
    public void valorarViaje() {

    }
    public void verPuntos() {

    }
    public void ganarPuntos() {

    }
    public void intercambiarPuntos() {

    }
}
