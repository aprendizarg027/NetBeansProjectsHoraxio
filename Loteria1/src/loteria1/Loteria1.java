/*
En el código Java, se utilizó un arreglo bidimensional int[][] para almacenar los valores de los números ingresados por el usuario para la jugada tradicional
y la revancha. Se utilizó un bucle for para iterar y solicitar los números al usuario en lugar de repetir código de forma redundante. 
Además, se utilizó la clase Scanner para leer la entrada del usuario de manera eficiente. 
Finalmente, se utilizó el método mostrarJugada() para imprimir la jugada en la salida estándar en lugar de usar printf.
 */

package loteria1;

// @author Horacio

import java.util.Scanner;

public class Loteria1 {
    // Declaración de variables
    private final int[][] quini = new int[3][3];
    private final int[][] revan = new int[3][3];

    // Método para cargar los valores de tradicional y quini
    public void cargar() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingrese tradicional");
            for (int i = 0; i < 3; i++) {
                System.out.println("Ingrese 1º numero del tradicional");
                quini[i][0] = scanner.nextInt();
                System.out.println("Ingrese 2º numero del tradicional");
                quini[i][1] = scanner.nextInt();
                System.out.println("Ingrese 3º numero del tradicional");
                quini[i][2] = scanner.nextInt();
            }
            
            System.out.println("Ingrese revancha");
            for (int i = 0; i < 3; i++) {
                System.out.println("Ingrese 1º numero de la revancha");
                revan[i][0] = scanner.nextInt();
                System.out.println("Ingrese 2º numero de la revancha");
                revan[i][1] = scanner.nextInt();
                System.out.println("Ingrese 3º numero de la revancha");
                revan[i][2] = scanner.nextInt();
            }
        }
    }

    // Método para mostrar la jugada
    public void mostrarJugada() {
        System.out.println("\nTradicional:");
        for (int i = 0; i < 3; i++) {
            System.out.println("1º numero: " + quini[i][0]);
            System.out.println("2º numero: " + quini[i][1]);
            System.out.println("3º numero: " + quini[i][2]);
        }

        System.out.println("\nRevancha:");
        for (int i = 0; i < 3; i++) {
            System.out.println("1º numero: " + revan[i][0]);
            System.out.println("2º numero: " + revan[i][1]);
            System.out.println("3º numero: " + revan[i][2]);
        }
    }

    public static void main(String[] args) {
        Loteria1 loteria = new Loteria1();
        loteria.cargar();
        loteria.mostrarJugada();
    }
}