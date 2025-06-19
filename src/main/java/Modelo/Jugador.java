package Modelo;

public class Jugador {
    private String nombre;
    private JuegoDados juego;
    private int puntos;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.juego = new JuegoDados();
        this.puntos = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    public int tirarDados() {
        System.out.println(nombre +" ha tirado sus dados...");
        juego.jugar();

        return juego.getSumaCaras();
    }

    public void incrementarPuntos() {
        this.puntos++;
    }

    public void reiniciarPuntos() {
        this.puntos = 0;
    }
}
