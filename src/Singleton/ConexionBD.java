package Singleton;

//Java -> JPA (Por defecto el patrón Singleton)
public class ConexionBD {
    private static ConexionBD instancia;
    private ConexionBD() {
        //Constructor privado para evitar que se creen instancias externas
    }
    public static ConexionBD getInstance(){
        if(instancia == null) instancia = new ConexionBD();
        return instancia;
    }
    public void Conectar(){
        System.out.println("Conectando a la base de datos...");
        //Lógica para conexión a la base de datos
    }
}
