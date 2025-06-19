package Launcher;

import Vista.ConsolaJuegoIndividual;
import Vista.ConsolaJuegoVersus;
import java.util.Scanner;

public class Main {
    private static Scanner mainScanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("==== Bienvenido al Juego de Dados ====");
        String opcionPrincipal;

        do {
            mostrarMenuPrincipal();
            opcionPrincipal = mainScanner.nextLine();
            ejecutarOpcionPrincipal(opcionPrincipal);
        } while (!opcionPrincipal.equals("3"));

        System.out.println("Gracias por jugar! Cerrando la aplicación...");
        mainScanner.close();
    }

    private static void mostrarMenuPrincipal() {
        System.out.println("\n--- Menú Principal ---");
        System.out.println("1. Jugar Modo Individual");
        System.out.println("2. Jugar Modo Versus");
        System.out.println("3. Salir de la aplicación");
        System.out.print("Seleccione una opción: ");
    }

    private static void ejecutarOpcionPrincipal(String opcion) {
        switch (opcion) {
            case "1":
                ConsolaJuegoIndividual.menu();
                break;
            case "2":
                ConsolaJuegoVersus.menu();
                break;
            case "3":
                break;
            default:
                System.out.println("Opción inválida. Por favor, ingrese 1, 2 o 3.");
                break;
        }
    }
}