package paradigma_polimorfismo;

public class Circulo extends FigurasGeometricas{

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }
    @Override
    public double CalcularArea() {
        return Math.PI * radio * radio;
    }
}
