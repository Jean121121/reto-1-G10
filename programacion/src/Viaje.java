package programacion.src;

public class Viaje {
    // Atributos
    private int idviaje;
    private String retraso;
    private String ocupacion;
    private String valoracion;

    // Constructor
    public Viaje(int idviaje, String retraso, String ocupacion,
                    String valoracion) {
        this.idviaje=idviaje;
        this.retraso=retraso;
        this.ocupacion=ocupacion;
        this.valoracion=valoracion;
    }

    // Getters y Setters
    public int getIdviaje() {
        return this.idviaje;
    }
    public String getRetraso() {
        return this.retraso;
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
    public void setRetraso(String retraso) {
        this.retraso=retraso;
    }
    public void setOcupacion(String ocupacion) {
        this.ocupacion=ocupacion;
    }
    public void setValoracion(String valoracion) {
        this.valoracion=valoracion;
    }
}
