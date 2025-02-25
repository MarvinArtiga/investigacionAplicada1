package sv.edu.udb.subclases;

import sv.edu.udb.Competencia;
import sv.edu.udb.Equipo;
import sv.edu.udb.Torneo;

import java.util.HashMap;
import java.util.Map;

public class TorneoLiga extends Torneo implements Competencia {

    private Map<Equipo, Integer> puntos;

    public TorneoLiga() {
        super();
        puntos = new HashMap<>();
    }

    @Override
    public void asignarPuntos() {
        // Asignar puntos a los equipos de manera aleatoria por ahora
        System.out.println("Asignando puntos en la Liga...");
        for (Equipo equipo : equipos) {
            int puntosEquipo = (int) (Math.random() * 10); // Puntos aleatorios entre 0 y 9
            puntos.put(equipo, puntosEquipo);
            System.out.println("Equipo '" + equipo.getNombre() + "' ha recibido " + puntosEquipo + " puntos.");
        }
    }

    @Override
    public Equipo calcularGanador() {
        System.out.println("Calculando ganador en la modalidad Liga...");
        Equipo ganador = null;
        int maxPuntos = -1;
        for (Map.Entry<Equipo, Integer> entry : puntos.entrySet()) {
            if (entry.getValue() > maxPuntos) {
                maxPuntos = entry.getValue();
                ganador = entry.getKey();
            }
        }
        return ganador;
    }
}
