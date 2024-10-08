package patron.factory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PagoFactory pagoFactory = new PagoFactory();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione el tipo de pago:");
        System.out.println("1. Crédito");
        System.out.println("2. Efectivo");
        System.out.println("3. Nequi");

        int opcion = scanner.nextInt();
        TipoDePago tipoDePago = null;

        switch (opcion) {
            case 1 -> tipoDePago = TipoDePago.CREDIT;
            case 2 -> tipoDePago = TipoDePago.EFFECTIVE;
            case 3 -> tipoDePago = TipoDePago.NEQUI;
            default -> {
                System.out.println("Opción no válida");
                System.exit(0);
            }
        }

        try {
            Pago pago = pagoFactory.obtenerPago(tipoDePago);
            pago.pago();
            pago.recibo();
        } catch (NoSuchFieldException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
