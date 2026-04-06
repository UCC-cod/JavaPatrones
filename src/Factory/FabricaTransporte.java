package Factory;

public class FabricaTransporte {
    public static Transporte crearTransporte(String tipo){
        if(tipo.equals("camion")){
            return new Camion();
        }else if (tipo.equals("barco")){
            return new Barco();
        }
        throw new IllegalArgumentException("Tipo de transporte no válido");
    }
}
