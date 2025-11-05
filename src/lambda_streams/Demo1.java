package lambda_streams;

public class Demo1 {
    public static void main(String[] args) {
        Mensaje saludo = new Mensaje() {
            @Override
            public void imprimir() {
                System.out.println("Hola desde una clase anonima");
            }
        };

        saludo.imprimir();
    }
}
