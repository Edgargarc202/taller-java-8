package taller.clases_metodos_atritubos;

public class Calculadora {

    int sumar(int a, int b) {
//        return this.valor1 + b;
       return a + b;
    }

    int restar(int a, int b) {
        return a - b;
    }
    int multiplicar(int a, int b) {
        return a*b;
    }
    double dividir(int a, int b) {
        if(b == 0) {
            System.out.println("No se puede dividir entre cero");
            return 0;
        }
        return (double) a/b;
    }
}
