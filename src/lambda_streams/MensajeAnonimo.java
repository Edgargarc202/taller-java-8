package lambda_streams;

public class MensajeAnonimo implements Mensaje {
    @Override
    public void imprimir() {
        System.out.println("Hola desde otra clase anonima");
    }
}
