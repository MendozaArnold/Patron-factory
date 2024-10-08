package patron.factory;

public class PagoFactory {
    public Pago obtenerPago(TipoDePago tipoDePago) throws NoSuchFieldException {
        return switch (tipoDePago) {
            case CREDIT -> new PagoCredit();
            case EFFECTIVE -> new PagoEffective();
            case NEQUI -> new PagoNequi();
            default -> throw new NoSuchFieldException("Tipo de pago no soportado");
        };
    }
}
