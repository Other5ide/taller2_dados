package Modelo;

public class Jugador {
    private String nombre;
    private JuegoDados juego;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.juego = new JuegoDados();
    }

    public String getNombre() {
        return nombre;
    }

    public void tirarDados() {
        System.out.println(nombre +" ha tirado sus dados...");
        juego.jugar();
    }
}
