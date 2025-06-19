package Modelo;

public class JuegoDeDados {
    private Dado dado1;
    private Dado dado2;
    private Calculadora calculadora;

    /**
     * Inicializa 2 dados y la calculadora.
     * @param calculadora para utilizar sumas.
     */
    public JuegoDeDados(Calculadora calculadora) {
        this.dado1 = new Dado();
        this.dado2 = new Dado();
        this.calculadora = calculadora;
    }

    /**
     * Simula la ronda del juego.
     * @return true si la suma de ambas caras en 7 (gg), false en caso contrario.
     */
    public boolean jugar() {
        dado1.lanzar();
        dado2.lanzar();

        int sumaCaras = calculadora.sumar(dado1.getCaraSuperior(), dado2.getCaraSuperior());

        System.out.println("Dado 1: " + dado1.getCaraSuperior() + " | Dado 2: " +  dado2.getCaraSuperior());
        System.out.println("Suma de las caras: " + sumaCaras);

        return sumaCaras == 7;
    }

    /**
     * Para testing.
     * @return suma de las caras superiores de ambos dados.
     */
    public int getSumaCaras() {
        return calculadora.sumar(dado1.getCaraSuperior(), dado2.getCaraSuperior());
    }

    //Métodos de acceso a dados individuales, en caso de testing.
    public Dado getDado1() {
        return dado1;
    }

    public Dado getDado2() {
        return dado2;
    }
}
