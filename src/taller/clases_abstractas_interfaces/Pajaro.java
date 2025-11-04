package taller.clases_abstractas_interfaces;

public class Pajaro extends Animal implements Volador {

    public Pajaro(String nombre) {
        super(nombre);
    }

    @Override
    public void hacenSonido() {
        System.out.println("El  pajarito canta!");
    }

    @Override
    public void volar() {
        System.out.println("esta volando");
    }
}
