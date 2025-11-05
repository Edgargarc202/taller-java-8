package paradigma_polimorfismo;

public class Cuadrado extends FigurasGeometricas {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double CalcularArea() {
        return lado * lado;
    }
}
