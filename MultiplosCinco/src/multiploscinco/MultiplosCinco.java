/*
 *8-Escriba un programa que lea números enteros. 
*    Si el número es múltiplo de cinco debe detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares
*    y la cantidad de números impares. Al igual que en el ejercicio anterior los números negativos no deben sumarse. 
*    Nota: recordar el uso de la sentencia break.
 */

package multiploscinco;

// @author Horacio

import java.util.Scanner; // importar la clase Scanner para recibir entrada del usuario

public class MultiplosCinco {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // crear objeto Scanner para recibir entrada del usuario
        int num, contador = 0, pares = 0, impares = 0; // inicializar variables contador, pares e impares
        while (true) { // bucle infinito
            System.out.print("Ingrese un número entero: ");
            num = entrada.nextInt(); // leer número entero del usuario
            if (num % 5 == 0) { // si el número es múltiplo de 5
                break; // salir del bucle
            }
            if (num < 0) { // si el número es negativo
                continue; // saltar al siguiente número
            }
            contador++; // incrementar el contador de números leídos
            if (num % 2 == 0) { // si el número es par
                pares++; // incrementar el contador de números pares
            } else { // si no
                impares++; // incrementar el contador de números impares
            }
        }

        // mostrar resultados
        System.out.println("Cantidad de números leídos: " + contador);
        System.out.println("Cantidad de números pares: " + pares);
        System.out.println("Cantidad de números impares: " + impares);
    }
}
/*
================================================================
*El programa primero importa la clase Scanner para recibir entrada del usuario. Luego se 
*define la clase MultiplosCinco con su método main. Dentro del método main, se crea 
*un objeto Scanner para recibir entrada del usuario. También se inicializan las variables 
*num, contador, pares e impares en 0.
*A continuación, se inicia un bucle while infinito. En cada iteración, el programa le pide al 
*usuario que ingrese un número entero y lo lee con el método nextInt() del objeto Scanner. 
*Si el número es múltiplo de 5, se sale del bucle usando la sentencia break. Si el 
*número es negativo, se salta al siguiente número usando la sentencia continue. 
*Si el número es positivo, se incrementa el contador contador y se comprueba si es par o impar. 
*En caso de ser par, se incrementa el contador pares y en caso de ser impar, se incrementa *el contador impares.
*Finalmente, se muestran los resultados de los contadores contador, pares e impares.

*/
