package Strategy;

public class Compra {
    private Pago metodoPago;

    public void setMetodoPago(Pago metodoPago) {
        this.metodoPago = metodoPago;
    }

    public void realizarCompra(double monto){
        if(metodoPago != null) metodoPago.pagar(monto);
        else System.out.println("No se ha seleccionado el método de pago");
    }
}
