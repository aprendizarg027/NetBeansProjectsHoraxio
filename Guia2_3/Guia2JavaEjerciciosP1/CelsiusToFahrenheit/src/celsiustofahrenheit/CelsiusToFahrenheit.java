/*
* Ejercicio 4
 * Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. 
 * La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */

package celsiustofahrenheit;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la temperatura en grados Celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheit = 32 + (9 * celsius / 5);

        System.out.println(celsius + " grados Celsius equivalen a " + fahrenheit + " grados Fahrenheit.");
    }
}
/*
*En este programa, se utiliza la clase Scanner para obtener una temperatura en grados Celsius ingresada por el usuario mediante el teclado.
*Luego, se utiliza la fórmula correspondiente para convertir la temperatura a grados Fahrenheit y se almacena en la variable fahrenheit. 
*Finalmente, se muestra el resultado de la conversión en la consola utilizando el método println de la clase System.
*/