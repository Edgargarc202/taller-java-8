package taller.clases_abstractas_interfaces;

public class ClasePajaro {
    public static void main(String[] args) {

        String nombreDelAve = "Guacamaya del sur";

        Pajaro guacamaya = new Pajaro(nombreDelAve);
        guacamaya.hacenSonido();
        guacamaya.volar();
    }
}
