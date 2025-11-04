package taller.clases_abstractas_interfaces;

abstract class Animal {
    String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public void dormir() {
        System.out.println("esta durmiendo");
    }

    public abstract void hacenSonido();

}
