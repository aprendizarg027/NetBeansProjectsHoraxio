/*
 * Realice un programa en java en donde el usuario elija al azar 6 (seis) números sobre un total de 46 (cuarenta y seis) que van desde el '00' 
*  al '45 inclusive'. El programa debe indicar al usuario si su respuesta es o no correcta. 
*  En caso que la respuesta sea incorrecta se debe permitir al usuario ingresar su respuesta nuevamente. Comente todas las líneas del codigo.
 */

package proyectoquini;

// @author Horacio

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ProyectoQuini {
    public static void main(String[] args) {
        // Creamos un objeto Random para generar los números aleatorios
        Random random = new Random();

        // Creamos un array de 6 elementos para almacenar los números elegidos por el usuario y los generados aleatoriamente
        int[] numeros = new int[6];

        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedimos al usuario que ingrese sus 6 números
        System.out.println("Ingrese 6 números del 00 al 45 inclusive:");
        for (int i = 0; i < 6; i++) {
            // Leemos el número ingresado por el usuario
            int numero;
            do {
                System.out.print("Número " + (i + 1) + ": ");
                numero = scanner.nextInt();
            } while (numero < 0 || numero > 45);

            // Agregamos el número al array
            numeros[i] = numero;
        }

        // Generamos los 6 números aleatorios y los almacenamos en otro array
        int[] numerosAleatorios = new int[6];
        for (int i = 0; i < 6; i++) {
            numerosAleatorios[i] = random.nextInt(46);
        }

        // Ordenamos los dos arrays
        Arrays.sort(numeros);
        Arrays.sort(numerosAleatorios);

        // Imprimimos los números elegidos por el usuario y los generados aleatoriamente
        System.out.println("Sus números: " + Arrays.toString(numeros));
        System.out.println("Números aleatorios: " + Arrays.toString(numerosAleatorios));

        // Comparamos los dos arrays para determinar si la respuesta del usuario es correcta
        boolean respuestaCorrecta = Arrays.equals(numeros, numerosAleatorios);

        // Si la respuesta es incorrecta, permitimos al usuario ingresar su respuesta nuevamente
        while (!respuestaCorrecta) {
            System.out.println("Lo siento, su respuesta es incorrecta. Intente nuevamente.");
            for (int i = 0; i < 6; i++) {
                // Leemos el número ingresado por el usuario
                int numero;
                do {
                    System.out.print("Número " + (i + 1) + ": ");
                    numero = scanner.nextInt();
                } while (numero < 0 || numero > 45);

                // Agregamos el número al array
                numeros[i] = numero;
            }

            // Ordenamos el array del usuario
            Arrays.sort(numeros);

            // Comparamos los dos arrays para determinar si la respuesta del usuario es correcta
            respuestaCorrecta = Arrays.equals(numeros, numerosAleatorios);
        }

        // Imprimimos un mensaje de felicitación si la respuesta es correcta
        System.out.println("¡Felicitaciones! Su respuesta es correcta.");
    }
}
/*
*Este programa en Java permite al usuario elegir 6 números del 00 al 45 inclusive, y luego genera 6 números aleatorios y los 
*compara con los elegidos por el usuario para determinar si la respuesta es correcta. 
*Si la respuesta es incorrecta, se le permite al usuario ingresar su respuesta nuevamente hasta que acierte. 
*El programa utiliza un objeto Random para generar los números aleatorios, y un objeto Scanner para leer la entrada del usuario. 
*Primero, se le pide al usuario que ingrese sus 6 números, y se verifica que cada número esté dentro del rango permitido. 
*Luego, se generan los 6 números aleatorios y se los compara con los elegidos por el usuario utilizando el método Arrays.equals(). 
*Si la respuesta del usuario es incorrecta, se le permite ingresar sus 6 números nuevamente, 
*y se repite el proceso de comparación hasta que acierte. Si la respuesta es correcta, se imprime un mensaje de felicitación.
*/