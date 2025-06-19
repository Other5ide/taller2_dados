package Vista;

import Modelo.JuegoDados;
import Modelo.Jugador;

import java.util.Scanner;

/**
 * Clase responsable de interactuar con el usuario por consola.2
 */
public class JuegoDadosConsola {
    static Scanner scanner = new Scanner(System.in);

    /**
     * Controla el ciclo principal del menú del sistema.
     */
    public static void menu() {
        String opcion;

        do {
            mostrarOpciones();
            opcion = scanner.nextLine();
            ejecutarOpcion(opcion);

        } while (!opcion.equals("2"));
    }

    /**
     * Muestra las opciones disponibles para el usuario.
     */
    private static void mostrarOpciones() {
        System.out.println("Juego de dados:");
        System.out.println("Selecciona una opcion: ");
        System.out.println("1. Jugar");
        System.out.println("2. Salir");
    }

    /**
     * Ejecuta la opción seleccionada por el usuario..
     *
     * @param opcion opción ingresada por el usuario
     */
    private static void ejecutarOpcion(String opcion) {
        switch (opcion) {
            case "1" -> iniciarJuego();
            case "2" -> {
                System.out.println("Saliendo del Sistema...");
                scanner.close();
            }
            default -> System.out.println("Opcion invalida");
        }
    }

    public static void iniciarJuego() {
        Jugador jugador = new Jugador("hola");
        jugador.tirarDados();
    }
}