package sv.edu.udb.subclases;

import sv.edu.udb.Equipo;
import sv.edu.udb.Torneo;

import java.util.HashMap;
import java.util.Map;

public class TorneoDobleEliminacion extends Torneo {

    private final Map<Equipo, Integer> derrotas;

    public TorneoDobleEliminacion() {
        super();
        derrotas = new HashMap<>();
    }

    @Override
    public void iniciarTorneo() {
        super.iniciarTorneo();

        System.out.println("Iniciando el torneo de Doble Eliminación...");
    }

    @Override
    public Equipo calcularGanador() {
        return equipos.get(0); // Solo se elige el primer equipo, pero en la realidad sería más elaborado.
    }

    public void registrarDerrota(Equipo equipo) {
        int derrotasEquipo = derrotas.getOrDefault(equipo, 0) + 1;
        derrotas.put(equipo, derrotasEquipo);
        if (derrotasEquipo >= 2) {
            equipos.remove(equipo);
            System.out.println("El equipo '" + equipo.getNombre() + "' ha sido eliminado por tener 2 derrotas.");
        }
    }
}
