package Factory;

public class Camion implements Transporte{
    @Override
    public void entregar() {
        System.out.println("Estoy entregando en un camión...");
    }
}
