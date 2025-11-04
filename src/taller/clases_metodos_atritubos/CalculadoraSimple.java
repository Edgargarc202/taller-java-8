package taller.clases_metodos_atritubos;

public class CalculadoraSimple {
    public static void main(String[] args) {
         Calculadora calcula = new Calculadora();

         int suma  = calcula. sumar(10, 5);
         int resta  = calcula.restar(10, 5);
        int multiplicar = calcula.multiplicar(10, 5);
        double dividir = calcula.dividir(10, 5);

//        Metodo que calcule el cuadrado del primer

        System.out.println("suma: " + suma);
        System.out.println("resta: " + resta);
        System.out.println("multiplicar: " + multiplicar);
        System.out.println("dividir: " + dividir);
    }
}
