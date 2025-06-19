package Launcher;

import Modelo.Calculadora;
import Modelo.JuegoDados;
import Vista.JuegoDadosConsola;

public class Main {

    public static void main(String[] args) {
        System.out.println("Iniciando juego...");

        Calculadora calculadora = new Calculadora();
        JuegoDados juegoIndividual = new JuegoDados(calculadora);
        JuegoDadosConsola consolaJuego = new JuegoDadosConsola(juegoIndividual);

        consolaJuego.iniciar();
    }
}
