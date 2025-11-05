package paradigma_herencia;

public class Gerente extends Empleado {

    private String departamento;

    public Gerente(String nombre, String salario, String departamento ) {
        super(nombre, salario);
        this.departamento = departamento;
    }

    public void mostrarInformacion() {
        super.mostrarInformacion(); //Aqui se llama al metodo padre
        System.out.println("Departamento: " + this.departamento);
    }

}
