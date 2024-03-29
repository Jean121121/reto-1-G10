package programacion.src;

import java.util.ArrayList;

public class Usuario {
    // Atributos
    private int idusuario;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String fechaNacimiento;
    private String email;
    private ArrayList<UsuarioViaje> listaViajes;
    private SistemaPuntos puntos;

    // Constructor
    public Usuario (int idusuario, String nombre,
                    String apellido1, String apellido2,
                    String fechaNacimiento, String email, SistemaPuntos puntos) {
        this.idusuario=idusuario;
        this.nombre=nombre;
        this.apellido1=apellido1;
        this.apellido2=apellido2;
        this.fechaNacimiento=fechaNacimiento;
        this.email=email;
        this.puntos=puntos;
        this.listaViajes= new ArrayList<>();
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
    @Override
    public String toString() {
        return "Usuario: " + idusuario + ", Nombre: " + nombre + "Apellidos: " + apellido1 + " " + apellido2 +
                ", Fecha nacimiento: " + fechaNacimiento + ", Email: " + email;
    }
    public void verViajes() {
        for (int i=0; i<listaViajes.size(); i++) {
            System.out.println(listaViajes.get(i).toString());
        }
    }
    public void recogerInfoViajes(Viaje viaje) {
        for (int i=0; i<listaViajes.size(); i++) {
            if (listaViajes.get(i).getViaje().getIdviaje()==viaje.getIdviaje()) {
                System.out.println(listaViajes.get(i).getViaje().getTiempoEstimado());
                System.out.println(listaViajes.get(i).getViaje().getOcupacion());
            }
        }
    }
    public void valorarViaje(Viaje viaje, String valoracion) {
        for (int i=0; i<listaViajes.size(); i++) {
            if (listaViajes.get(i).getViaje().getIdviaje()==viaje.getIdviaje()) {
                listaViajes.get(i).setValoracion(valoracion);
            }
        }
    }
    public void agregarViaje(Viaje viaje) {
        UsuarioViaje usuarioViaje = new UsuarioViaje(this, viaje);
        listaViajes.add(usuarioViaje);
    }
    public void verPuntos() {
        System.out.println(puntos.toString());
    }
    public void ganarPuntos(int puntos) {
        this.puntos.setPuntos(this.puntos.getPuntos() + puntos);

    }
    public void intercambiarPuntos(int puntos) {
        if (this.puntos.getPuntos() - puntos >=0) {
            this.puntos.setPuntos(this.puntos.getPuntos() - puntos);
        }
        else {
            System.out.println("No quedan puntos para intercambiar");
        }
    }
}
