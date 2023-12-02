package programacion.src;

public class SistemaPuntos {
    // Atributos
    private int puntos;

    // Constructor
    public SistemaPuntos() {
        this.puntos=0;
    }

    // Getters y Setters
    public int getPuntos() {
        return this.puntos;
    }
    public void setPuntos(int puntos) {
        this.puntos=puntos;
    }

    @Override
    public String toString() {
        return "Puntos: " + puntos;
    }
}
