package Launcher;

import Modelo.Calculadora;
import Modelo.JuegoDeDados;
import Vista.JuegoDadosConsola;

public class Main {

    public static void main(String[] args) {
        System.out.println("Iniciando juego...");

        Calculadora calculadora = new Calculadora();
        JuegoDeDados juegoIndividual = new JuegoDeDados(calculadora);
        JuegoDadosConsola consolaJuego = new JuegoDadosConsola(juegoIndividual);

        consolaJuego.iniciar();
    }
}
