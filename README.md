# Universidad Don Bosco - Investigacion Aplicada I Problema #3 (Torneo de Videojuegos)
<p>Una organización de eSports quiere un sistema que administre torneos de videojuegos con diferentes tipos de
competencias. Existen tres formatos de torneo:

● Eliminación Directa: Los equipos juegan rondas eliminatorias hasta que quede un ganador.

● Liga: Cada equipo juega contra todos los demás y se acumulan puntos.

● Doble Eliminación: Un equipo debe perder dos veces para quedar eliminado.

Cada torneo puede incluir entre 4 y 16 equipos. Los equipos están formados por jugadores con un ranking, y los
enfrentamientos se generan automáticamente.



![nuevoLogoUDB](https://github.com/user-attachments/assets/5e9d7527-1fe7-4fc8-b784-ff3d28306059)


### Modelado de clases y relaciones

● Torneo (clase abstracta con métodos registrarEquipo(), iniciarTorneo(), asignarPuntos()). <br>
 &nbsp; &nbsp; ○ Subclases (TorneoEliminacionDirecta, TorneoLiga, TorneoDobleEliminacion) con reglas
específicas. <br> <br>
● Jugador con atributos nombre, ranking, equipo. <br>
● Equipo con atributos nombre, listaDeJugadores. <br>
●Interfaces y abstracción
 &nbsp; &nbsp; ○ Una interfaz Competencia con calcularGanador(), asignarPuntos().

### Reglas del sistema
✅ Un torneo solo puede iniciarse si tiene al menos 4 equipos.<br>
✅ Un equipo debe tener mínimo 2 jugadores para inscribirse.<br>
✅ En la modalidad de Liga, el equipo con más puntos al final gana. <br>
✅ En Eliminación Directa, un equipo que pierde es eliminado inmediatamente <br>

### Casos de prueba
🔹 Intentar registrar un equipo con solo un jugador y validar que el sistema lo impide. <br>
🔹 Simular un torneo con 8 equipos y verificar que los emparejamientos se generan correctamente. <br>
🔹 Probar la asignación de puntos en la modalidad Liga y confirmar que el equipo con más puntos

### Instalacion 
  -Clonar el repositorio (git clone  https://github.com/MarvinArtiga/investigacionAplicada1.git) <br>
  -Abrir el proyecto en intellij idea <br>
  -Actualizar la JDK si es necesario (se esta usando la version 23.0.2) 


### Créditos
## Los contribuidores de este proyecto somos los estudiantes de la Universidad Don Bosco:
* Marvin Edgardo Artiga Gonzalez AG230133
* José Manuel reyes Echeverría RE242138
* Waldo Jose Perez Aguillon PA230265
* Jefferson Edenilson Campos Rosales CR241530








