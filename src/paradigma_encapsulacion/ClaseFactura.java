package paradigma_encapsulacion;

public class ClaseFactura {
    public static void main(String[] args) {
        FaturaSinEva f1 = new FaturaSinEva();
        f1.setId("1");
        f1.setImporte(100);

        FacturaConIva f2 = new FacturaConIva();
        f2.setId("2");
        f2.setImporte(200);

        System.out.println(f1.calcularTotal());
        System.out.println(f2.calcularTotal());

    }
}
