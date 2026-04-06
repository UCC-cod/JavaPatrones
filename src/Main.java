import Factory.FabricaTransporte;
import Factory.Transporte;
import Singleton.ConexionBD;
import Observer.Canal;
import Observer.Usuario;
import Strategy.Compra;
import Strategy.PagoEfectivo;


void main() {

    //Singleton
    ConexionBD conexion1 = ConexionBD.getInstance();
    conexion1.Conectar();
    ConexionBD conexion2 = ConexionBD.getInstance();
    conexion2.Conectar();
    System.out.println("Comparando conexiones: ");
    System.out.println(conexion1==conexion2);

    //Factory
    Transporte transporte1 = FabricaTransporte.crearTransporte("barco");
    transporte1.entregar();
    //Transporte transporte2 = FabricaTransporte.crearTransporte("bicicleta");
    //transporte2.entregar();

    //Observer
    Canal canal1 = new Canal("Moda");
    canal1.agregarObservador(new Usuario("Carla"));
    canal1.notificarObservadores(" Nuevas tendencias de moda");

    //Strategy
    Compra compra = new Compra();
    compra.setMetodoPago(new PagoEfectivo());
    compra.realizarCompra(5000);

}
