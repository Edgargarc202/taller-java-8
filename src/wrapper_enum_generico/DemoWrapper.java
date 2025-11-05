package wrapper_enum_generico;

import java.util.Collections;

public class DemoWrapper {
    public static void main(String[] args) {
        int numero = 10;
        Integer numeroObjeto = Integer.valueOf(numero); //Boxing
        System.out.println("Valor: " + numeroObjeto);

        int sumatoria = numeroObjeto + 4; //Unboxin automatico
        System.out.println("sumatoria: " + sumatoria);
    }
}
