package paradigma_herencia;

public class ClaseEmpleado {
    public static void main(String[] args) {

        Gerente gte1 = new Gerente("Carlos", "15000", "Cholchoneria");
        gte1.mostrarInformacion();
        System.out.println("");

        Empleado empleado = new Empleado("Mariana", "12345");
        empleado.mostrarInformacion();

    }
}
