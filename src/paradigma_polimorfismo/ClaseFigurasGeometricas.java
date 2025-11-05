package paradigma_polimorfismo;

public class ClaseFigurasGeometricas {
    public static void main(String[] args) {

        FigurasGeometricas circulo = new Circulo(5);
        FigurasGeometricas cuadrado = new Cuadrado(10);
        FigurasGeometricas rectangulo = new Rectangulo(2,5);

        System.out.println("Area del circulo: " + circulo.CalcularArea());
        System.out.println("Area del cuadrado: " + cuadrado.CalcularArea());
        System.out.println("Area del rectangulo: " + rectangulo.CalcularArea());
    }
}
