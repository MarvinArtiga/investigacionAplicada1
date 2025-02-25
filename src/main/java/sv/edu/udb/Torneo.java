package sv.edu.udb;

import java.util.ArrayList;
import java.util.List;

public abstract class Torneo {
 protected List<Equipo> equipos;

 public Torneo() {
  equipos = new ArrayList<>();
 }

 public void registrarEquipo(Equipo equipo) {
  if (equipo.getJugadores().size() >= 2) {
   equipos.add(equipo);
   System.out.println("Equipo '" + equipo.getNombre() + "' registrado correctamente.");
  } else {
   System.out.println("No se puede registrar el equipo '" + equipo.getNombre() + "' (debe tener al menos 2 jugadores).");
  }
 }

 public void iniciarTorneo() {
  if (equipos.size() < 4) {
   System.out.println("No hay suficientes equipos para iniciar el torneo.");
   return;
  }
  System.out.println("¡Torneo iniciado con " + equipos.size() + " equipos! Que comience la batalla.");
 }

 public abstract Equipo calcularGanador();

 public List<Equipo> getEquipos() {
  return equipos;
 }
}
