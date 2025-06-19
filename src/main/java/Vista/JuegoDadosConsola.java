package Vista;

import Modelo.JuegoDados;

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

        } while (true);
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
     * Ejecuta la opción seleccionada por el usuario.
     *
     * @param opcion opción ingresada por el usuario
     */
    private static void ejecutarOpcion(String opcion) {
        switch (opcion) {
            case "1" -> iniciarJuego();
            case "2" -> confirmarSalida();
            default -> System.out.println("Opcion invalida");
        }
    }

    public static void iniciarJuego() {
        JuegoDados juego = new JuegoDados();
        juego.jugar();
    }

    public static void confirmarSalida(){
        System.out.println("¿De verdad quieres salir? (yes/no)");
        String usuarioInput = scanner.nextLine();
        if (verificarSiSeSale(usuarioInput)) {
            System.out.println("Saliendo del Sistema...");
            System.exit(0);
        }
    }

    public static boolean verificarSiSeSale(String respuesta) {
        return respuesta.equalsIgnoreCase("yes");
    }
}