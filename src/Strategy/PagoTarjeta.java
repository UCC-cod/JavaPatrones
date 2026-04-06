package Strategy;

public class PagoTarjeta implements Pago{
    @Override
    public void pagar(double monto) {
        System.out.println("Pagando con tarjeta " + monto);
    }
}
