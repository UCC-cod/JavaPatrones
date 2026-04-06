package Observer;

import java.util.ArrayList;
import java.util.List;

public class Canal {
    private String nombre;
    private List<Observador> observadores;

    public Canal(String nombre) {
        this.nombre = nombre;
        this.observadores = new ArrayList<>();
    }
    public void agregarObservador(Observador observador){
        observadores.add(observador);
    }

    public void eliminarObservador(Observador observador){
        //Lógica para buscar el observador
        //Eliminar el observador
    }

    public void notificarObservadores(String mensaje){
        for(Observador observador: observadores){
            observador.actualizar(mensaje);
        }
    }
}
