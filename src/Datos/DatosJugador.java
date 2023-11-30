package guis;
package datos;
import modelo.Seleccion;
import modelo.Jugador;
import java.util.ArrayList;
import java.util.List;
public class DatosJugador {
    private List<Jugador> jugadores;
    private List<Seleccion> seleccionList;
    public DatosJugador() {
        this.jugadores = new ArrayList<>();
        this.seleccionList = new ArrayList<>();
    }

    public List<jugadores> getJugadores() {
        return jugadores;
    }

    public List<Seleccion> getSeleccionList() {
        return seleccionList;
    }
    public void editarJugadores(Jugador jugador){
        catalogo.add(jugador);
    }
    public void mostrarSeleccion(Seleccion seleccion){
        usuarios.add(usuario);
    }




}