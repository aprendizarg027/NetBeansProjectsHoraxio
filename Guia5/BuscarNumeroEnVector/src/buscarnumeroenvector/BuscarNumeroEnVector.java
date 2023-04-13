/*
 * 2-Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios y le pida al usuario un número a buscar en el vector.
El programa mostrará dónde se encuentra el número y si se encuentra repetido.
 */

package buscarnumeroenvector;

// @author Horacio

import java.util.Scanner; // Importamos la clase Scanner para leer la entrada del usuario
import java.util.Random; // Importamos la clase Random para generar números aleatorios

public class BuscarNumeroEnVector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creamos una instancia de la clase Scanner para leer la entrada del usuario

        System.out.print("Ingrese el tamaño del vector: ");
        int n = scanner.nextInt(); // Leemos el tamaño del vector ingresado por el usuario

        int[] vector = new int[n]; // Creamos un vector de tamaño n

        Random random = new Random(); // Creamos una instancia de la clase Random para generar números aleatorios

        System.out.println("El vector generado es: ");
        for (int i = 0; i < n; i++) {
            vector[i] = random.nextInt(101); // Generamos un número aleatorio entre 0 y 100 y lo asignamos al vector
            System.out.print(vector[i] + " "); // Imprimimos el valor del vector en la posición i
        }
        System.out.println(); // Imprimimos un salto de línea para separar la salida

        System.out.print("Ingrese un número a buscar en el vector: ");
        int numeroBuscado = scanner.nextInt(); // Leemos el número a buscar ingresado por el usuario

        boolean encontrado = false; // Variable booleana para indicar si se encontró el número buscado
        int cantidadRepetido = 0; // Variable para contar la cantidad de veces que se repite el número buscado

        for (int i = 0; i < n; i++) {
            if (vector[i] == numeroBuscado) { // Comparamos si el número en la posición i del vector es igual al número buscado
                encontrado = true; // Si se encuentra el número buscado, actualizamos la variable encontrado a true
                cantidadRepetido++; // Incrementamos la cantidad de veces que se repite el número buscado
                System.out.println("El número " + numeroBuscado + " se encuentra en la posición " + i + " del vector."); // Mostramos la posición del número encontrado
            }
        }

        if (!encontrado) {
            System.out.println("El número " + numeroBuscado + " no se encuentra en el vector."); // Si no se encuentra el número buscado, mostramos un mensaje
        } else {
            if (cantidadRepetido > 1) {
                System.out.println("El número " + numeroBuscado + " se encuentra repetido " + cantidadRepetido + " veces en el vector."); // Si el número buscado se encuentra repetido, mostramos la cantidad de veces que se repite
            } else {
                System.out.println("El número " + numeroBuscado + " se encuentra repetido una vez en el vector."); // Si el número buscado se encuentra repetido una sola vez, mostramos un mensaje
            }
        }

        scanner.close(); // Cerramos la instancia de la clase Scanner para liberar recursos
    }
}
/*
Importación de clases: Se importan dos clases necesarias para el funcionamiento del programa, Scanner y Random, que están en los paquetes java.util. 
La clase Scanner se utiliza para leer la entrada del usuario, mientras que la clase Random se utiliza para generar números aleatorios.

Declaración de variables: Se declaran las variables necesarias para el programa. 
Esto incluye una instancia de Scanner para leer la entrada del usuario, un arreglo de enteros vector para almacenar los números aleatorios
generados, una instancia de Random para generar números aleatorios, y variables para rastrear si se encuentra el número buscado
y cuántas veces se repite.

Lectura del tamaño del vector: Se solicita al usuario que ingrese el tamaño del vector mediante la clase Scanner
y se almacena en la variable n.

Generación del vector aleatorio: Se crea un ciclo for que itera n veces para generar números aleatorios entre 0 y 100 (inclusive)
utilizando la clase Random, y se asignan a las posiciones correspondientes del arreglo vector. 
Los números generados se imprimen en la consola.

Lectura del número buscado: Se solicita al usuario que ingrese el número que desea buscar en el vector mediante la clase Scanner 
y se almacena en la variable numeroBuscado.

Búsqueda del número buscado en el vector: Se crea otro ciclo for que itera a través del vector "vector" y compara cada elemento 
con el número buscado utilizando una estructura condicional if. 
Si se encuentra una coincidencia, se actualiza la variable encontrado a true y se incrementa la
variable cantidadRepetido en caso de que el número buscado se repita más de una vez en el vector.
Además, se muestra en la consola la posición del número buscado si se encuentra.

Resultados de la búsqueda: Se utiliza otra estructura condicional if para mostrar los resultados de la búsqueda. 
Si el número buscado no se encuentra en el vector, se muestra un mensaje indicando esto.
Si se encuentra, se muestra la cantidad de veces que se repite el número buscado en el vector.

Cierre del scanner: Finalmente, se cierra la instancia de la clase Scanner utilizando el método close() para liberar recursos.
*/
