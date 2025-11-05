package wrapper_enum_generico;

public class CajaGenerica<T> extends Contenedor implements Transportable {

    private T contenido;

    public CajaGenerica(String descripcion) {
        super(descripcion);
    }

    public void guardar(T valor){
        this.contenido = valor;
    }

    public T obteber() {
        return contenido;
    }

    @Override
    public void transportar() {
        System.out.println("contenido de la caja: " + contenido);
    }
}
