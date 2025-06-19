package Vista;

import java.util.Scanner;

/**
 * Clase responsable de interactuar con el usuario por consola.
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
        System.out.println("Consola:");
        System.out.println("Selecciona una opcion: ");
        System.out.println("1. Agregar disco");
        System.out.println("2. Salir");
        System.out.println("3. Ver coleccion");
        System.out.println("4. Buscar disco");
        System.out.println("5. Ver cantidad de discos agregados");
        System.out.println("6. Ver espacios disponibles");
    }

    /**
     * Ejecuta la opción seleccionada por el usuario.
     *
     * @param opcion opción ingresada por el usuario
     */
    private static void ejecutarOpcion(String opcion) {
        switch (opcion) {
            case "1" -> System.out.println("hola1");
            case "2" -> {
                System.out.println("Saliendo del Sistema...");
                scanner.close();
            }
            case "3" -> System.out.println("hola2");
            case "4" -> System.out.println("hola3");
            case "5" -> System.out.println("hola4");
            case "6" -> System.out.println("hola5");
            default -> System.out.println("Opcion invalida");
        }
    }
}