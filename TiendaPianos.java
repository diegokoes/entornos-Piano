/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pianos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author koeshoro
 */
// Clase principal que contiene el menú y las opciones de la aplicación
public class TiendaPianos {

    // ArrayList para guardar los pianos disponibles en la tienda
    static ArrayList<Piano> listaPianos = new ArrayList<Piano>();

    // Scanner para leer los datos por teclado
    static Scanner sc = new Scanner(System.in);

    // Método principal que llama al método mostrarMenu()
    public static void main(String[] args) {
        mostrarMenu();
    }

    // Método que muestra el menú y permite elegir una opción
    public static void mostrarMenu() {

        int opcion;

        do {

            System.out.println("***** TIENDA DE PIANOS *****");
            System.out.println("1. Añadir piano");
            System.out.println("2. Listar pianos");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    // Llamamos al método añadirPiano() para crear un nuevo piano y añadirlo a la lista
                    añadirPiano();
                    break;
                case 2:
                    // Llamamos al método listarPianos() para mostrar los pianos disponibles en la tienda
                    listarPianos();
                    break;
                case 3:
                    // Salimos del programa
                    System.out.println("Gracias por usar la aplicación. Hasta pronto.");
                    break;
                default:
                    // Mostramos un mensaje de error si la opción no es válida
                    System.out.println("Opción incorrecta. Inténtalo de nuevo.");
            }
        } while (opcion != 3); // Repetimos el menú hasta que se elija la opción 3

    }

// Método que crea un nuevo piano y lo añade a la lista de pianos
    public static void añadirPiano() {

// Pedimos los datos del piano por teclado
        System.out.print("Introduce el modelo del piano: ");
        String modelo = sc.next();
        System.out.print("Introduce el precio del piano: ");
        double precio = sc.nextDouble();
        System.out.print("Introduce el tipo de piano (Cola, Pared o Electrónico): ");
        String tipo = sc.next();

// Creamos un objeto Piano según el tipo elegido y lo añadimos a la lista
        switch (tipo) {
            case "Cola":
            case "cola":
                Piano cola = new Cola(modelo, precio);
                listaPianos.add(cola);
                break;
            case "Pared":
            case "pared":
                Piano pared = new Pared(modelo, precio);
                listaPianos.add(pared);
                break;
            case "Electrónico":
            case "electrónico":
                Piano electronico = new Electronico(modelo, precio);
                listaPianos.add(electronico);
                break;
            default:
                System.out.println("Tipo de piano no válido.");
        }

// Mostramos un mensaje de confirmación
        System.out.println("Se ha añadido el piano correctamente.");

    }

// Método que muestra los pianos disponibles en la tienda
    public static void listarPianos() {

// Comprobamos si hay algún piano en la lista
        if (listaPianos.isEmpty()) {
            System.out.println("No hay ningún piano disponible.");
        } else {
// Recorremos la lista de pianos y mostramos sus datos
            for (int i = 0; i < listaPianos.size(); i++) {
                System.out.println("***** Piano " + (i + 1) + " *****");
                System.out.println("Modelo: " + listaPianos.get(i).getModelo());
                System.out.println("Precio: " + listaPianos.get(i).getPrecio());
                System.out.println("Tipo: " + listaPianos.get(i).getTipo());
            }
        }
    }
}
