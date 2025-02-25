package sv.edu.udb;

public class Jugador {
    private String nombre;
    private int ranking;

    public Jugador(String nombre, int ranking) {
        this.nombre = nombre;
        this.ranking = ranking;
    }

    public String getNombre() {
        return nombre;
    }

    public int getRanking() {
        return ranking;
    }
}
