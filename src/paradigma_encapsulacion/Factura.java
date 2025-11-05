package paradigma_encapsulacion;

public abstract class Factura {
    private String id;
    private double importe;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public abstract double calcularTotal();
}
