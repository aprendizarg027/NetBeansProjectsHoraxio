/*
 3-Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */

package contadordigitos;

// @author Horacio

import java.util.Scanner;

public class ContadorDigitos {

    public static void main(String[] args) {
        // Creación de un arreglo de enteros
        int[] vector;
        
        // Declaración de variables
        int n, num, digito;
        int[] contador = new int[6]; // El índice 0 no se utiliza
        try ( // Creación de una instancia de Scanner para leer la entrada del usuario
                Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingrese el tamaño del vector: ");
            n = sc.nextInt(); // Lectura del tamaño del vector
            vector = new int[n]; // Creación del arreglo con el tamaño ingresado
            // Lectura de los números enteros del usuario y almacenamiento en el arreglo
            System.out.println("Ingrese los números enteros: ");
            for (int i = 0; i < n; i++) {
                vector[i] = sc.nextInt();
            }   // Recorrido del vector y conteo de los números de dígitos
            for (int i = 0; i < n; i++) {
                num = vector[i];
                digito = contarDigitos(num);
                contador[digito]++; // Incremento del contador en la posición correspondiente
            }   // Impresión de los resultados
            System.out.println("Resultados:");
            for (int i = 1; i <= 5; i++) {
                System.out.println("Cantidad de números con " + i + " dígitos: " + contador[i]);
            }
            // Cierre del scanner
        }
    }

    // Método para contar la cantidad de dígitos en un número entero
    public static int contarDigitos(int num) {
        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        return count;
    }

}
/*
Se importa la clase Scanner del paquete java.util para leer la entrada del usuario.
Se declara un arreglo de enteros llamado vector para almacenar los números ingresados por el usuario.
Se declaran variables n para el tamaño del vector, num para almacenar los números del vector durante el recorrido, 
digito para contar los dígitos de cada número y contador como un arreglo de enteros de tamaño 6 para contar la cantidad de números con 1,
2, 3, 4 o 5 dígitos. El índice 0 del arreglo contador no se utiliza.
Se crea una instancia de Scanner llamada sc para leer la entrada del usuario.
Se solicita al usuario que ingrese el tamaño del vector.
Se crea el arreglo vector con el tamaño ingresado por el usuario.
Se solicita al usuario que ingrese los números enteros y se almacenan en el arreglo vector mediante un ciclo for.
Se recorre el arreglo vector y se cuenta la cantidad de dígitos de cada número utilizando el método `contarDigit
*/