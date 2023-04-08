/*
 * Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, el triple y la raíz cuadrada de ese número.
 */

package operacionesnumero;

import java.util.Scanner;

public class OperacionesNumero {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Ingrese un número entero: ");
        int numero = leer.nextInt();

        int doble = numero * 2;
        int triple = numero * 3;
        double raizCuadrada = Math.sqrt(numero);

        System.out.println("El doble de " + numero + " es: " + doble);
        System.out.println("El triple de " + numero + " es: " + triple);
        System.out.println("La raíz cuadrada de " + numero + " es: " + raizCuadrada);
    }
}
/*
*En este programa, se utiliza la clase Scanner para obtener un número entero ingresado por el usuario mediante el teclado.
*Luego, se realizan las operaciones correspondientes para obtener el doble, el triple y la raíz cuadrada del número ingresado,
*y se almacenan en las variables doble, triple y raizCuadrada, respectivamente. Finalmente, 
*se muestra el resultado de las operaciones en la consola utilizando el método println de la clase System.
*/



