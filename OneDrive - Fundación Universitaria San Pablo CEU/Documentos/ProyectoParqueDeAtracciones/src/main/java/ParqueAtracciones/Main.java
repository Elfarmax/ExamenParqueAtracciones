/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ParqueAtracciones;
import java.util.Scanner;
/**
 *
 * @author Raúl de la Rosa
 */
public class Main {
    public static void main(String[] args) {
        ParqueAtracciones parque = new ParqueAtracciones();
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("****************************************");
            System.out.println("*--- Menú del Parque de Atracciones ---*");
            System.out.println("****************************************");
            System.out.println("*** 1. Agregar Atracción ***");
            System.out.println("*** 2. Agregar Empleado  ***");
            System.out.println("*** 3. Agregar Visitante ***");
            System.out.println("*** 4. Mostrar Información del Parque *** ");
            System.out.println("*** 0. Salir");
            System.out.print(" Ingrese una opción:  ");

            try {
                opcion = scanner.nextInt();
                scanner.nextLine(); // Limpiar el buffer

                switch (opcion) {
                    case 1:
                        agregarAtraccion(parque, scanner);
                        break;
                    case 2:
                        agregarEmpleado(parque, scanner);
                        break;
                    case 3:
                        agregarVisitante(parque, scanner);
                        break;
                    case 4:
                        parque.mostrarInformacionParque();
                        break;
                    case 0:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción inválida.");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, ingrese un número.");
                scanner.nextLine(); // Limpiar el buffer
                opcion = -1; // Para que el bucle continúe
            }
        } while (opcion != 0);

        scanner.close();
    }

    private static void agregarAtraccion(ParqueAtracciones parque, Scanner scanner) {
        System.out.print("Nombre de la atracción: ");
        String nombre = scanner.nextLine();
        System.out.print("Capacidad: ");
        int capacidad = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
        System.out.print("Estado: Operativa, En mantenimiento, Cerrada: ");
        String estado = scanner.nextLine();

        try {
            Atraccion atraccion = new Atraccion(nombre, capacidad, estado);
            parque.agregarAtraccion(atraccion);
            System.out.println("Atracción agregada con éxito.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void agregarEmpleado(ParqueAtracciones parque, Scanner scanner) {
        System.out.print("Nombre del empleado: ");
        String nombre = scanner.nextLine();
        System.out.print("ID del empleado: ");
        int idEmpleado = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
        System.out.print("Puesto (Operador, Mantenimiento, Ventas): ");
        String puesto = scanner.nextLine();

        try {
            Empleado empleado = new Empleado(nombre, idEmpleado, puesto);
            parque.agregarEmpleado(empleado);
            System.out.println("Empleado agregado con éxito.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void agregarVisitante(ParqueAtracciones parque, Scanner scanner) {
        System.out.print("Nombre del visitante: ");
        String nombre = scanner.nextLine();
        System.out.print("ID del visitante: ");
        int idVisitante = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
        System.out.print("Edad del visitante: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        try {
            Visitante visitante = new Visitante(nombre, idVisitante, edad);
            parque.agregarVisitante(visitante);
            System.out.println("Visitante agregado con éxito.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}