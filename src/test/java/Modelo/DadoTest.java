package Modelo;

import Vista.JuegoDadosConsola;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

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
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        juego.jugar();

        assertEquals(("Dado 1: " + dado1Cara1 + " | Dado 2: " + dado2Cara2), bos.toString());
    }

    @Test
    void testConfiracionDeSalida() {
        assertTrue(JuegoDadosConsola.verificarSiSeSale("yes"));
    }

    @Test
    void testMenu() {
        JuegoDadosConsola.ejecutarOpcion("1");
    }
    @Test
    void mostrarMensajeCorrectoDeResultado(){

    }
}