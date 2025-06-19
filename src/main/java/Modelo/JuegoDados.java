package Modelo;

public class JuegoDados {
    private Dado dado1;
    private Dado dado2;

    /**
     * Inicializa 2 dados
     */
    public JuegoDados() {
        this.dado1 = new Dado();
        this.dado2 = new Dado();
    }

    /**
     * Simula la ronda del juego.
     * @return true si la suma de ambas caras en 7 (gg), false en caso contrario.
     */
    public void jugar() {
        dado1.lanzar();
        dado2.lanzar();

        int sumaCaras = calcularResultado(dado1.getCaraSuperior(), dado2.getCaraSuperior());

        System.out.println("Dado 1: " + dado1.getCaraSuperior() + " | Dado 2: " +  dado2.getCaraSuperior());
        System.out.println("Suma de las caras: " + sumaCaras);
        determinarVictoria();
    }

    public int calcularResultado(int dado1, int dado2) {
        return dado1 + dado2;
    }

    /**
     * Para testing.
     * @return suma de las caras superiores de ambos dados.
     */
    public int getSumaCaras() {
        return calcularResultado(dado1.getCaraSuperior(), dado2.getCaraSuperior());
    }

    //Métodos de acceso a dados individuales
    public Dado getDado1() {
        return dado1;
    }

    public Dado getDado2() {
        return dado2;
    }

    public void determinarVictoria() {
        if (calcularResultado(dado1.getCaraSuperior(), dado2.getCaraSuperior()) == 7) {
            System.out.println("Victoria!!");
        } else
            System.out.println("Derrota, no has conseguido obtener una suma de 7");
    }
}