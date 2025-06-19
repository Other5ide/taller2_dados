package Modelo;

public class JuegoVersus {
    private Jugador jugador1;
    private Jugador jugador2;
    private JuegoDados juegoDados;
    private int rondasMaximas;

    public JuegoVersus(String nombreJugador1, String nombreJugador2, int rondasMaximas) {
        this.jugador1 = new Jugador(nombreJugador1);
        this.jugador2 = new Jugador(nombreJugador2);
        this.juegoDados = new JuegoDados();
        this.rondasMaximas = rondasMaximas;
        System.out.println("Modo versus!: " + jugador1.getNombre() + " vs " + jugador2.getNombre() + " al mejor de " + rondasMaximas + " intentos");
    }

    public String jugarRonda() {
        System.out.println("\n Turno de " + jugador1.getNombre());
        boolean ganoJ1 = juegoDados.jugar();
    }
}
