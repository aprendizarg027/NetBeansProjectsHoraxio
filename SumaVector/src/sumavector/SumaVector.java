/*Ejercicios Extras-
 *1./Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño N, con los valores ingresados por el usuario.
 */

package sumavector;

// @author Horacio

import java.util.Scanner; // Importamos la clase Scanner para leer la entrada del usuario

public class SumaVector {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in) // Creamos una instancia de Scanner para leer la entrada del usuario
        ) {
            System.out.print("Ingrese el tamaño del vector: ");
            int N = input.nextInt(); // Leemos el tamaño del vector ingresado por el usuario
            int[] vector = new int[N]; // Creamos un arreglo de enteros con el tamaño N especificado
            System.out.println("Ingrese los elementos del vector: ");
            for (int i = 0; i < N; i++) { // Usamos un ciclo for para iterar sobre el arreglo y leer los elementos ingresados por el usuario
                vector[i] = input.nextInt(); // Leemos cada elemento y lo almacenamos en el arreglo
            }   int suma = 0; // Inicializamos una variable para almacenar la suma de los elementos del vector
            for (int i = 0; i < N; i++) { // Usamos otro ciclo for para iterar sobre el arreglo y sumar sus elementos
                suma += vector[i]; // Sumamos cada elemento al total acumulado en la variable suma
            }   System.out.println("La suma de los elementos del vector es: " + suma); // Mostramos el resultado de la suma
            // Cerramos el Scanner para liberar recursos
        }
    }
}
/*
El algoritmo utiliza la clase Scanner de Java para leer la entrada del usuario desde la consola.
El usuario debe ingresar primero el tamaño del vector, y luego los elementos del vector uno por uno.
Luego, se utiliza un ciclo for para iterar sobre el arreglo y sumar sus elementos, 
y finalmente se muestra el resultado de la suma en la consola.
*/