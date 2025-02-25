package sv.edu.udb;

import sv.edu.udb.subclases.TorneoDobleEliminacion;
import sv.edu.udb.subclases.TorneoEliminacionDirecta;
import sv.edu.udb.subclases.TorneoLiga;

public class App {
    public static void main(String[] args) {
        // Crear equipos
        Equipo equipo1 = new Equipo("Equipo 1");
        equipo1.agregarJugador(new Jugador("Jugador 1", 100));
        equipo1.agregarJugador(new Jugador("Jugador 2", 95));

        Equipo equipo2 = new Equipo("Equipo 2");
        equipo2.agregarJugador(new Jugador("Jugador 3", 98));
        equipo2.agregarJugador(new Jugador("Jugador 4", 92));

        Equipo equipo3 = new Equipo("Equipo 3");
        equipo3.agregarJugador(new Jugador("Jugador 5", 90));
        equipo3.agregarJugador(new Jugador("Jugador 6", 88));

        Equipo equipo4 = new Equipo("Equipo 4");
        equipo4.agregarJugador(new Jugador("Jugador 7", 93));
        equipo4.agregarJugador(new Jugador("Jugador 8", 91));

        // Torneo de Liga
        System.out.println("\n--- Torneo de Liga ---");
        Torneo torneoLiga = new TorneoLiga();
        torneoLiga.registrarEquipo(equipo1);
        torneoLiga.registrarEquipo(equipo2);
        torneoLiga.registrarEquipo(equipo3);
        torneoLiga.registrarEquipo(equipo4);
        torneoLiga.iniciarTorneo();
        ((TorneoLiga) torneoLiga).asignarPuntos(); // Asegúrate de asignar puntos
        Equipo ganadorLiga = torneoLiga.calcularGanador();
        System.out.println("Ganador del Torneo de Liga: " + ganadorLiga.getNombre());

        // Torneo de Eliminación Directa
        System.out.println("\n--- Torneo de Eliminación Directa ---");
        Torneo torneoEliminacionDirecta = new TorneoEliminacionDirecta();
        torneoEliminacionDirecta.registrarEquipo(equipo1);
        torneoEliminacionDirecta.registrarEquipo(equipo2);
        torneoEliminacionDirecta.registrarEquipo(equipo3);
        torneoEliminacionDirecta.registrarEquipo(equipo4);
        torneoEliminacionDirecta.iniciarTorneo();
        Equipo ganadorEliminacionDirecta = torneoEliminacionDirecta.calcularGanador();
        System.out.println("Ganador del Torneo de Eliminación Directa: " + ganadorEliminacionDirecta.getNombre());

        // Torneo de Doble Eliminación
        System.out.println("\n--- Torneo de Doble Eliminación ---");
        Torneo torneoDobleEliminacion = new TorneoDobleEliminacion();
        torneoDobleEliminacion.registrarEquipo(equipo1);
        torneoDobleEliminacion.registrarEquipo(equipo2);
        torneoDobleEliminacion.registrarEquipo(equipo3);
        torneoDobleEliminacion.registrarEquipo(equipo4);
        torneoDobleEliminacion.iniciarTorneo();
        Equipo ganadorDobleEliminacion = torneoDobleEliminacion.calcularGanador();
        System.out.println("Ganador del Torneo de Doble Eliminación: " + ganadorDobleEliminacion.getNombre());
    }
}
