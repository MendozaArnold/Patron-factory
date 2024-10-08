package patron.factory;

public class PagoNequi implements Pago {
    @Override
    public void pago() {
        System.out.println("Se ha procesado el pago por Nequi.");
    }

    @Override
    public void recibo() {
        System.out.println("Se ha generado el recibo de Nequi.");
    }
}
