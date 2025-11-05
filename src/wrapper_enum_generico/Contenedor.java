package wrapper_enum_generico;

public class Contenedor {
    private String descripcion;

    public Contenedor(String descripcion) {
        this.descripcion = descripcion;
    }

    public void mostrarDescripcion(){
        System.out.println("Descripcion de contenedor " + descripcion);
    }
}
