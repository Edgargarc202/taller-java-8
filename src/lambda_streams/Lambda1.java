package lambda_streams;

public class Lambda1 {
    public static void main(String[] args) {
        Mensaje saludo = () -> System.out.println("Hola desde una lambda");
        saludo.imprimir();
    }


    public String mensaje() {
        return "cadena de retorno";
    }
}
