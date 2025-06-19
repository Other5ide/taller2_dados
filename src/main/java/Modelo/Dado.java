package Modelo;

import java.util.Random;

/**
 * Representa un dado de 6 caras
 */
public class Dado {
    private int caraSuperior;

    public Dado() {//El dado empieza con su cara superior en 1
        this.caraSuperior = 1;
    }

    public void lanzar() {
        Random random = new Random();
        this.caraSuperior = random.nextInt(6) + 1; //Genera un valor aleatorio entre 1 y 6 para el dado.
    }

    public int getCaraSuperior() {
        return caraSuperior;
    }
}