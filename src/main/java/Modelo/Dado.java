package Modelo;

import java.util.Random;

/**
 * Representa un dado de 6 caras
 */
public class Dado {
    private int caraSuperior;
    private Random random;

    public Dado() {
        this.random = new Random(); //Dado sin cara superior definida
    }

    public void lanzar() {
        this.caraSuperior = random.nextInt(6) + 1; //Genera valor aleatorio entre 1 y 6 para el dado.
    }

    public int getCaraSuperior() {
        return caraSuperior;
    }
}
