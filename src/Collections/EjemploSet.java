package Collections;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class EjemploSet {
    public static void main(String[] args) {
        Set<Integer> numeros = new TreeSet<>();
        numeros.add(5);
        numeros.add(4);
        numeros.add(3);
        numeros.add(2);
        numeros.add(1);
        for (Integer i : numeros) {
            System.out.println(i);
        }

        Set<String> nombres = new TreeSet<>(Comparator.reverseOrder());
        nombres.add("Maria");
        nombres.add("Jorge");
        nombres.add("Solia");
        nombres.add("Alex");
        nombres.add("Juan");
        for(String nombre : nombres) {
            System.out.println(nombre);
        }

    }
}
