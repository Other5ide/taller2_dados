package Vista;

import Modelo.JuegoDados;
import Modelo.Jugador;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Clase que gestiona el menú y la interacción con el usuario para el juego de dados INDIVIDUAL.
 */
public class ConsolaJuegoIndividual {

    private static Scanner scanner = new Scanner(System.in);
    private static boolean salirConfirmado = false;

    /**
     * Controla el ciclo principal del menú del juego de dados individual.
     * Muestra opciones, captura la entrada del usuario y ejecuta la acción correspondiente
     * hasta que el usuario elija salir y confirme.
     */
    public static void menu() {
        String opcion;
        do {
            mostrarOpciones();
            opcion = scanner.nextLine();
            ejecutarOpcion(opcion);
        } while (!(opcion.equals("2") && salirConfirmado));

        if (salirConfirmado) {
        }
    }

    /**
     * Muestra las opciones disponibles para el usuario en el menú del juego individual.
     */
    private static void mostrarOpciones() {
        System.out.println("\n==== Juego de Dados Individual ====");
        System.out.println("1. Jugar Ronda");
        System.out.println("2. Volver al Menú Principal");
        System.out.print("Seleccione una opción: ");
    }

    /**
     * Ejecuta la acción correspondiente a la opción seleccionada por el usuario.
     * @param opcion La opción (String) ingresada por el usuario.
     */
    private static void ejecutarOpcion(String opcion) {
        switch (opcion) {
            case "1":
                iniciarRondaJuegoIndividual();
                break;
            case "2":
                confirmarSalida();
                break;
            default:
                System.out.println("Opción inválida. Por favor, ingrese 1 o 2.");
                break;
        }
    }

    /**
     * Inicia una única ronda del juego de dados individual.
     * Crea un objeto Jugador "temporal" para realizar la tirada
     * y muestra si la suma de los dados fue 7.
     */
    private static void iniciarRondaJuegoIndividual() {
        System.out.println("\n--- Iniciando ronda individual ---");
        Jugador jugadorIndividual = new Jugador("Jugador Único");

        int suma = jugadorIndividual.tirarDados();

        if (suma == 7) {
            System.out.println("¡Felicidades! ¡La suma es 7! ¡Ganaste la ronda individual!");
        } else {
            System.out.println("Lo siento, la suma no es 7. Perdiste la ronda individual.");
        }
        System.out.println("----------------------------------");
    }

    /**
     * Pregunta al usuario si realmente desea salir de la sección de juego individual.
     * Actualiza el flag 'salirConfirmado' basándose en la respuesta del usuario (S/N).
     */
    private static void confirmarSalida() {
        System.out.print("¿Está seguro que desea volver al Menú Principal? (S/N): ");
        String respuesta = scanner.nextLine().trim().toUpperCase();
        if (respuesta.equals("S")) {
            salirConfirmado = true;
            System.out.println("Volviendo al Menú Principal...");
        } else {
            System.out.println("¡Operación cancelada! Permaneciendo en el Juego Individual.");
            salirConfirmado = false;
        }
    }
}