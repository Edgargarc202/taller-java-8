package paradigma_encapsulacion;

public class FaturaSinEva extends Factura {

    @Override
    public double calcularTotal() {
        return this.getImporte();
    }
}
