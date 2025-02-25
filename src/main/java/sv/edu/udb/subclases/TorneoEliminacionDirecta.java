package sv.edu.udb.subclases;

import sv.edu.udb.Equipo;
import sv.edu.udb.Torneo;

import java.util.ArrayList;
import java.util.List;

public class TorneoEliminacionDirecta extends Torneo {

    public TorneoEliminacionDirecta() {
        super();
    }

    @Override
    public void iniciarTorneo() {
        super.iniciarTorneo();
        // Simulación de eliminación directa
        System.out.println("Iniciando el torneo de Eliminación Directa...");
        List<Equipo> equiposEliminados = new ArrayList<>();
        while (equipos.size() > 1) {
            // Aquí se simula que un equipo se elimina por ronda (ejemplo aleatorio)
            Equipo equipoEliminado = equipos.remove(0); // Elimina el primer equipo de la lista
            equiposEliminados.add(equipoEliminado);
            System.out.println("El equipo '" + equipoEliminado.getNombre() + "' ha sido eliminado.");
        }
    }

    @Override
    public Equipo calcularGanador() {
        return equipos.get(0); // El último equipo restante es el ganador
    }
}
