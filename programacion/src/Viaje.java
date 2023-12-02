package programacion.src;

public class Viaje {
    // Atributos
    private int idviaje;
    private String tiempoEstimado;
    private String ocupacion;

    // Constructor
    public Viaje(int idviaje, String tiempoEstimado, String ocupacion) {
        this.idviaje=idviaje;
        this.tiempoEstimado=tiempoEstimado;
        this.ocupacion=ocupacion;
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
    public void setIdviaje(int idviaje) {
        this.idviaje=idviaje;
    }
    public void setRetraso(String tiempoEstimado) {
        this.tiempoEstimado=tiempoEstimado;
    }
    public void setOcupacion(String ocupacion) {
        this.ocupacion=ocupacion;
    }

    @Override
    public String toString() {
        return "Viaje: " + idviaje + ", Tiempo estimado: " + tiempoEstimado + ", Ocupacion: " + ocupacion;
    }
}
