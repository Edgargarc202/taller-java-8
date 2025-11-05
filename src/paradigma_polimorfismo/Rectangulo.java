package paradigma_polimorfismo;

public class Rectangulo extends FigurasGeometricas{
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double CalcularArea() {
        return base * altura;
    }
}
