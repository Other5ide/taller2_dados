package Vista;

import Modelo.JuegoVersus;
import Modelo.Jugador;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsolaJuegoVersus {
    private static Scanner scanner = new Scanner(System.in);
    private static JuegoVersus juegoVersus;
    private static boolean salirDeVersus = false;

    public static void menu() {
        salirDeVersus = false;
        String opcion;
        do {
            mostrarOpciones();
            opcion = scanner.nextLine();
            ejecutarOpcion(opcion);
        } while (!salirDeVersus);

        System.out.println("Volviendo al Menú Principal...");
    }

    private static void mostrarOpciones() {
        System.out.println("\n==== Juego de Dados Versus ====");
        System.out.println("1. Iniciar Nueva Partida Versus");
        System.out.println("2. Volver al Menú Principal");
        System.out.print("Seleccione una opción: ");
    }

    private static void ejecutarOpcion(String opcion) {
        switch (opcion) {
            case "1" -> configurarYJugarVersus();
            case "2" -> salirDeVersus = true;
            default -> System.out.println("Opción inválida. Por favor, ingrese 1 o 2.");
        }
    }

    private static void configurarYJugarVersus() {
        System.out.println("\n--- Configuración de Nueva Partida Versus ---");
        System.out.print("Ingrese el nombre del Jugador 1: ");
        String nombreJ1 = scanner.nextLine();

        System.out.print("Ingrese el nombre del Jugador 2: ");
        String nombreJ2 = scanner.nextLine();

        int rondasMaximas = obtenerRondasMaximas();

        juegoVersus = new JuegoVersus(nombreJ1, nombreJ2, rondasMaximas);

        jugarPartidaVersus();
    }

    private static int obtenerRondasMaximas() {
        int rondas = 0;
        while (true) {
            System.out.println("Seleccione el modo de juego:");
            System.out.println("1. Al primer intento (Una ronda)");
            System.out.println("3. Mejor de 3");
            System.out.println("5. Mejor de 5");
            System.out.print("Ingrese 1, 3 o 5: ");
            try {
                rondas = scanner.nextInt();
                scanner.nextLine();

                if (rondas == 1 || rondas == 3 || rondas == 5) {
                    return rondas;
                } else {
                    System.out.println("Opción inválida. Por favor, ingrese 1, 3 o 5.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada no válida. Por favor, ingrese un número.");
                scanner.next();
                scanner.nextLine();
            }
        }
    }

    private static void jugarPartidaVersus() {
        int rondaActual = 1;
        while (!juegoVersus.juegoTerminado()) {
            System.out.println("\n==== Ronda " + rondaActual + " ====");
            juegoVersus.jugarRonda();

            if (juegoVersus.juegoTerminado()) {
                Jugador ganador = juegoVersus.getGanadorFinal();
                if (ganador != null) {
                    System.out.println("\n--- ¡Fin del Juego Versus! ---");
                    System.out.println("¡El ganador es: " + ganador.getNombre() + "!");
                } else {
                    System.out.println("\n--- ¡Fin del Juego Versus! ---");
                    System.out.println("La partida ha terminado en empate.");
                }
            } else {
                System.out.println("Presiona ENTER para la siguiente ronda...");
                scanner.nextLine();
            }
            rondaActual++;
        }
        juegoVersus.reiniciarMarcador();
        System.out.println("\n--- Partida Versus Terminada ---");
    }
}