/*
 5.-Realizar un programa que llene una matriz de tamaño NxM con valores aleatorios y muestre la suma de sus elementos.
 */

package matrizsuma;

// @author Horacio

import java.util.Random; // Importar la clase Random para generar números aleatorios

public class MatrizSuma {
    public static void main(String[] args) {
        int N = 3; // Número de filas de la matriz
        int M = 4; // Número de columnas de la matriz

        int[][] matriz = new int[N][M]; // Crear una matriz de NxM para almacenar los valores aleatorios

        Random rand = new Random(); // Crear un objeto de la clase Random para generar números aleatorios

        // Llenar la matriz con valores aleatorios entre 1 y 10
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matriz[i][j] = rand.nextInt(10) + 1; // Generar un número aleatorio entre 1 y 10 y asignarlo a la posición (i,j) de la matriz
            }
        }

        int suma = 0; // Variable para almacenar la suma de los elementos de la matriz

        // Calcular la suma de los elementos de la matriz
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                suma += matriz[i][j]; // Sumar el valor de cada elemento de la matriz a la variable "suma"
            }
        }

        // Imprimir la matriz generada
        System.out.println("Matriz generada:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(matriz[i][j] + " "); // Imprimir el valor de cada elemento de la matriz separado por espacio
            }
            System.out.println(); // Imprimir una nueva línea después de cada fila de la matriz
        }
        // Imprimir la suma de los elementos de la matriz
        System.out.println("Suma de los elementos de la matriz: " + suma);
    }
}
/*
Se declara una clase llamada "MatrizSuma" que contiene el método "main" como punto de entrada del programa.
Se definen las variables "N" y "M" para representar el número de filas y columnas de la matriz, respectivamente.
Se crea una matriz bidimensional llamada "matriz" de tamaño NxM para almacenar los valores aleatorios.
Se crea un objeto de la clase "Random" para generar números aleatorios.
Se utiliza un bucle "for" anidado para llenar la matriz con valores aleatorios entre 1 y 10.
Se utiliza otro bucle "for" anidado para calcular la suma de todos los elementos de la matriz y se almacena en la variable "suma".
Se utiliza otro bucle "for" anidado para imprimir por pantalla la matriz generada.
Se imprime por pantalla la suma de los elementos de la matriz.
*/
