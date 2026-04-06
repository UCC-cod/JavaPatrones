package Strategy;

public class PagoEfectivo implements Pago{
    @Override
    public void pagar(double monto) {
        System.out.println("Pagando con efectivo " + monto);
    }
}
