package patron.factory;

public class PagoEffective implements Pago {
    @Override
    public void pago() {
        System.out.println("Se ha procesado el pago por efectivo.");
    }

    @Override
    public void recibo() {
        System.out.println("Se ha generado el recibo de efectivo.");
    }
}
