package wrapper_enum_generico;

public class CajaGenerica<T> {

    private T contenido;

    public void guardar(T valor){
        this.contenido = valor;
    }

    public T obteber() {
        return contenido;
    }
}
