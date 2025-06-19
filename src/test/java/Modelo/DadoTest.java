package Modelo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DadoTest {

    @Test
    void testCalculoSuma() {
        JuegoDados juego = new JuegoDados();
        int dado1Cara1 = juego.getDado1().getCaraSuperior();
        int dado2Cara2 = juego.getDado2().getCaraSuperior();
        int suma = dado1Cara1 + dado2Cara2;
        assertEquals(suma, juego.calcularResultado(dado1Cara1, dado2Cara2));

    }

    @Test
    void testMostrarValoresCorrectos() {
        JuegoDados juego = new JuegoDados();
        int dado1Cara1 = juego.getDado1().getCaraSuperior();
        int dado2Cara2 = juego.getDado2().getCaraSuperior();
        assertEquals(juego.determinarVictoria(), "");
    }
}