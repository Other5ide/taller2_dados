package Modelo;

public class JuegoVersus {
    private Jugador jugador1;
    private Jugador jugador2;
    private int rondasMaximas;

    public JuegoVersus(String nombreJugador1, String nombreJugador2, int rondasMaximas) {
        this.jugador1 = new Jugador(nombreJugador1);
        this.jugador2 = new Jugador(nombreJugador2);
        this.rondasMaximas = rondasMaximas;
        System.out.println("Modo versus!: " + jugador1.getNombre() + " vs " + jugador2.getNombre() + " al mejor de " + rondasMaximas + " intentos");
    }

    public String jugarRonda() {
        System.out.println("\n Turno de " + jugador1.getNombre());
        int sumaJ1 = jugador1.tirarDados();

        System.out.println("\n--- Turno de " + jugador2.getNombre() + " ---");
        int sumaJ2 = jugador2.tirarDados();

        boolean ganoJ1 = (sumaJ1 == 7);
        boolean ganoJ2 = (sumaJ2 == 7);

        String resultadoRonda;
        if (ganoJ1 && !ganoJ2) {
            jugador1.incrementarPuntos();
            resultadoRonda = jugador1.getNombre() + " gana esta ronda.";
        } else if (ganoJ2 && !ganoJ1) {
            jugador2.incrementarPuntos();
            resultadoRonda = jugador2.getNombre() + " gana esta ronda.";
        } else {
            resultadoRonda = "Empate en esta ronda. ¡Nadie suma puntos!";
        }
        System.out.println(resultadoRonda);
        System.out.println("Marcador: " + jugador1.getNombre() + " " + jugador1.getPuntos() + " - " + jugador2.getNombre() + " " + jugador2.getPuntos());
        return resultadoRonda;
    }

    public boolean juegoTerminado() {
        if (rondasMaximas == 1) {
            return jugador1.getPuntos() > 0 || jugador2.getPuntos() > 0;
        }

        int victoriasNecesarias = (rondasMaximas / 2) + 1;
        return jugador1.getPuntos() >= victoriasNecesarias || jugador2.getPuntos() >= victoriasNecesarias;
    }

    public Jugador getGanadorFinal() {
        if (!juegoTerminado()) {
            return null;
        }

        if (rondasMaximas == 1) {
            if (jugador1.getPuntos() > 0) return jugador1;
            if (jugador2.getPuntos() > 0) return jugador2;
            return null;
        }

        int victoriasNecesarias = (rondasMaximas / 2) + 1;
        if (jugador1.getPuntos() >= victoriasNecesarias) {
            return jugador1;
        } else if (jugador2.getPuntos() >= victoriasNecesarias) {
            return jugador2;
        }
        return null;
    }

    public void reiniciarMarcador() {
        jugador1.reiniciarPuntos();
        jugador2.reiniciarPuntos();
    }

    public Jugador getJugador1() {
        return jugador1;
    }

    public Jugador getJugador2() {
        return jugador2;
    }

    public int getRondasMaximas() {
        return rondasMaximas;
    }

}
