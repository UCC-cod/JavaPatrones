package Factory;

public class Barco implements Transporte{
    @Override
    public void entregar() {
        System.out.println("Estoy entregando en un barco...");
    }
}
