package programacion.src;

public class UsuarioViaje {
    private Usuario usuario;
    private Viaje viaje;
    private String valoracion;

    public UsuarioViaje(Usuario usuario, Viaje viaje) {
        this.usuario=usuario;
        this.viaje=viaje;
        this.valoracion="Sin valoracion";
    }

    public Usuario getUsuario() {
        return this.usuario;
    }
    public Viaje getViaje() {
        return this.viaje;
    }
    public String getValoracion() {
        return this.valoracion;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario=usuario;
    }
    public void setViaje(Viaje viaje) {
        this.viaje=viaje;
    }
    public void setValoracion(String valoracion) {
        this.valoracion=valoracion;
    }

    @Override
    public String toString() {
        return "Viaje: " + this.viaje.getIdviaje() + ". Tiempo estimado: " + this.viaje.getTiempoEstimado() + ". Ocupacion: " + this.viaje.getOcupacion() + ". Valoracion: " + this.valoracion;
    }
}
