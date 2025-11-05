package paradigma_herencia;

public class Empleado {
    String nombre;
    String salario;

    //Constructor
    public Empleado(String nombre, String salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public void mostrarInformacion(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: $" + salario);
    }

}
