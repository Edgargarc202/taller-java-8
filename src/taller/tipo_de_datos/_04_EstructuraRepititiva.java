package taller.tipo_de_datos;

public class _04_EstructuraRepititiva {
    public static void main(String[] args) {
        int valor = 10;
        /*
        for(int valorAuxiliar = 1;valorAuxiliar < valor; valorAuxiliar ++ ) {
            System.out.println("valorAuxiliar " + valorAuxiliar);
            if(valorAuxiliar > 3 ) {
                System.out.println("Cumplió la condición if, el valor es: " + valorAuxiliar);
                break;
            }
        }
*/

        int limite = 5;
        int contador = 0;

        while(limite > contador) {
            contador = contador +1;
            System.out.println("Ejecución del while, valor con count: " + contador);
        }

        do {
            contador = contador +1;
            System.out.println("Ejecución del while, valor con count: " + contador);
        }
        while(contador < limite);


    }
}
