package wrapper_enum_generico;

public class ClaseCajaGenerica {
    public static void main(String[] args) {

        CajaGenerica<String> caja1 = new CajaGenerica<>();
        caja1.guardar("cadena de muestra");
        System.out.println(caja1.obteber());

        CajaGenerica<Integer> caja2 = new CajaGenerica<>();
        caja2.guardar(12);
        System.out.println(caja2.obteber());


    }
}
