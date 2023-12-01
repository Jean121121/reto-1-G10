package programacion.src;

public class Viaje {
    // Atributos
    private int idviaje;
    private String tiempoEstimado;
    private String ocupacion;
    private String valoracion;

    // Constructor
    public Viaje(int idviaje, String tiempoEstimado, String ocupacion,
                    String valoracion) {
        this.idviaje=idviaje;
        this.tiempoEstimado=tiempoEstimado;
        this.ocupacion=ocupacion;
        this.valoracion=valoracion;
    }

    // Getters y Setters
    public int getIdviaje() {
        return this.idviaje;
    }
    public String getTiempoEstimado() {
        return this.tiempoEstimado;
    }
    public String getOcupacion() {
        return this.ocupacion;
    }
    public String getValoracion() {
        return this.valoracion;
    }
    public void setIdviaje(int idviaje) {
        this.idviaje=idviaje;
    }
    public void setRetraso(String tiempoEstimado) {
        this.tiempoEstimado=tiempoEstimado;
    }
    public void setOcupacion(String ocupacion) {
        this.ocupacion=ocupacion;
    }
    public void setValoracion(String valoracion) {
        this.valoracion=valoracion;
    }

    @Override
    public String toString() {
        return "Viaje: " + idviaje + ", Tiempo estimado: " + tiempoEstimado + ", Ocupacion: " + ocupacion + ", Valoracion: " + valoracion;
    }
}
