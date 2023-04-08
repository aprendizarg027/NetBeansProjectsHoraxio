/*
 *Escribir un programa de Java que pida dos números enteros por teclado y calcule la suma de los dos. 
 * El programa deberá después mostrar el resultado de la suma..
 */

package sumaenteros;

// @author Horacio

import java.util.Scanner;

public class SumaEnteros {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese el primer número entero: ");
        int num1 = leer.nextInt();

        System.out.print("Ingrese el segundo número entero: ");
        int num2 = leer.nextInt();

        int suma = num1 + num2;

        System.out.println("La suma de " + num1 + " y " + num2 + " es: " + suma);
    }
}
/*
*En este programa, se utiliza la clase Scanner para obtener dos números enteros ingresados por el usuario mediante el teclado.
*Luego, se realiza la suma de los dos números y se almacena en la variable suma. 
*Finalmente, se muestra en la consola el resultado de la suma utilizando el método println de la clase System.
*/
