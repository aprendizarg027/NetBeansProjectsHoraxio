/* Extras Guia 5
 *3.-Crear una función rellene un vector con números aleatorios, pasándole un arreglo por parámetro. 
Después haremos otra función o procedimiento que imprima el vector.
 */

package vectoraleatorio;

// @author Horacio

 import java.util.Random; // Importamos la clase Random para generar números aleatorios

public class VectorAleatorio {

    public static void main(String[] args) {
        int N = 10; // Tamaño del vector
        int[] vector = new int[N]; // Creamos un arreglo de enteros con el tamaño N especificado

        llenarVectorAleatorio(vector); // Llamamos a la función llenarVectorAleatorio para llenar el vector con números aleatorios
        imprimirVector(vector); // Llamamos a la función imprimirVector para imprimir el vector lleno

    }

    // Función para llenar un vector con números aleatorios
    public static void llenarVectorAleatorio(int[] vector) {
        Random rand = new Random(); // Creamos una instancia de la clase Random para generar números aleatorios

        for (int i = 0; i < vector.length; i++) { // Usamos un ciclo for para iterar sobre el vector
            vector[i] = rand.nextInt(101); // Generamos un número aleatorio entre 0 y 100, y lo almacenamos en la posición i del vector
        }
    }

    // Función para imprimir un vector
    public static void imprimirVector(int[] vector) {
        System.out.println("Elementos del vector:");
        for (int i = 0; i < vector.length; i++) { // Usamos un ciclo for para iterar sobre el vector
            System.out.println(vector[i]); // Imprimimos el elemento en la posición i del vector
        }
    }
}
/*
En resumen, este programa crea una función llamada llenarVectorAleatorio que recibe un arreglo de enteros como parámetro 
y lo llena con números aleatorios entre 0 y 100 utilizando la clase Random. 
Luego, tiene otra función llamada imprimirVector que recibe un arreglo de enteros como parámetro y lo imprime en la consola. 
En la función main, se crea un vector de tamaño N, se llama a la función llenarVectorAleatorio para llenar el vector con números aleatorios
y se llama a la función imprimirVector para imprimir el vector lleno.
*/