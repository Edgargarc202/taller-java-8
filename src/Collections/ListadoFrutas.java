package Collections;

import java.util.ArrayList;
import java.util.List;

public class ListadoFrutas {
    public static void main(String[] args) {
        List<String> frutas = new ArrayList<>();
        frutas.add("manzana");
        frutas.add("pera");
        frutas.add("uva");
        frutas.add("melon");

        //System.out.println(frutas);

        for(int i = 0; i < frutas.size(); i++ ) {
            System.out.println(frutas.get(i));
        }

        // For mejorado for-each
        for(String l : frutas ) {
            System.out.println("fruta " + l);
        }
    }
}
