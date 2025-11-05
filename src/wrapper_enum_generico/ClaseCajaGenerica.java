package wrapper_enum_generico;

public class ClaseCajaGenerica {
    public static void main(String[] args) {

        CajaGenerica<String> caja1 = new CajaGenerica<>("Caja para mensajes de texto");
        caja1.guardar("cadena de muestra");
        System.out.println(caja1.obteber());
        caja1.mostrarDescripcion();
        caja1.transportar();

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        CajaGenerica<Integer> caja2 = new CajaGenerica<>("Caja para mensajes enteros");
        caja2.guardar(12);
        System.out.println(caja2.obteber());
        caja2.mostrarDescripcion();
        caja2.transportar();


    }
}
