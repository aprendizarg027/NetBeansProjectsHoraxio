/* Extras Guia5
 *2.-Escriba un programa que averigüe si dos vectores de N enteros son iguales 
(la comparación deberá detenerse en cuanto se detecte alguna diferencia entre los elementos).
 */

package compararvectores;

// @author Horacio

 import java.util.Scanner; // Importamos la clase Scanner para leer la entrada del usuario

public class CompararVectores {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Creamos una instancia de Scanner para leer la entrada del usuario

        System.out.print("Ingrese el tamaño de los vectores: ");
        int N = input.nextInt(); // Leemos el tamaño de los vectores ingresado por el usuario

        int[] vector1 = new int[N]; // Creamos un arreglo de enteros para el primer vector con el tamaño N especificado
        int[] vector2 = new int[N]; // Creamos un arreglo de enteros para el segundo vector con el tamaño N especificado

        System.out.println("Ingrese los elementos del primer vector: ");
        for (int i = 0; i < N; i++) { // Usamos un ciclo for para iterar sobre el primer vector y leer los elementos ingresados por el usuario
            vector1[i] = input.nextInt(); // Leemos cada elemento del primer vector y lo almacenamos en el arreglo
        }

        System.out.println("Ingrese los elementos del segundo vector: ");
        for (int i = 0; i < N; i++) { // Usamos otro ciclo for para iterar sobre el segundo vector y leer los elementos ingresados por el usuario
            vector2[i] = input.nextInt(); // Leemos cada elemento del segundo vector y lo almacenamos en el arreglo
        }

        boolean sonIguales = true; // Inicializamos una variable booleana para indicar si los vectores son iguales o no

        for (int i = 0; i < N; i++) { // Usamos otro ciclo for para comparar los elementos de los dos vectores
            if (vector1[i] != vector2[i]) { // Comparamos los elementos en la misma posición de los dos vectores
                sonIguales = false; // Si encontramos una diferencia, actualizamos la variable sonIguales a false
                break; // Detenemos la comparación en cuanto se detecte alguna diferencia entre los elementos
            }
        }

        if (sonIguales) {
            System.out.println("Los vectores son iguales."); // Si la variable sonIguales es true, mostramos que los vectores son iguales
        } else {
            System.out.println("Los vectores son diferentes."); // Si la variable sonIguales es false, mostramos que los vectores son diferentes
        }

        input.close(); // Cerramos el Scanner para liberar recursos
    }
}
/*
En resumen, este programa solicita al usuario el tamaño de dos vectores, lee los elementos de ambos vectores ingresados por el usuario,
los almacena en arreglos de enteros, los compara elemento por elemento utilizando un ciclo for, y muestra si los vectores son iguales o diferentes en la consola.
La clase Scanner se utiliza para leer la entrada del usuario, y se cierra al final del programa para liberar recursos.
*/
