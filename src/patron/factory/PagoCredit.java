package patron.factory;

public class PagoCredit implements Pago {
    @Override
    public void pago() {
        System.out.println("Se ha procesado el pago por crédito.");
    }

    @Override
    public void recibo() {
        System.out.println("Se ha generado el recibo de crédito.");
    }
}
