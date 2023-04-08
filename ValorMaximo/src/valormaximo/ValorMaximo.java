/*
 7 Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio de n números (n>0).
    El valor de n se solicitará al principio del programa y los números serán introducidos por el usuario. 
    Realice dos versiones del programa, una usando el bucle “while” y otra con el bucle “do - while”.
 */

package valormaximo;

// @author Horacio

import java.util.Scanner;

public class ValorMaximo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Crear objeto Scanner para leer entrada del usuario
        int n; // Variable para almacenar el valor de n
        double num, total = 0, max = Double.MIN_VALUE, min = Double.MAX_VALUE; // Inicializar variables totales, máximo y mínimo

        // Pedir al usuario que ingrese el valor de n
        System.out.print("Ingrese el valor de n: ");
        n = input.nextInt();

        // Bucle while para calcular el valor máximo, el valor mínimo y el promedio de n números
        int i = 1; // Inicializar contador
        while (i <= n) {
            System.out.print("Ingrese el número " + i + ": ");
            num = input.nextDouble();

            // Actualizar valor máximo y mínimo
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }

            // Agregar número al total
            total += num;

            // Incrementar contador
            i++;
        }

        // Calcular promedio
        double promedio = total / n;

        // Mostrar resultados
        System.out.println("Valor máximo: " + max);
        System.out.println("Valor mínimo: " + min);
        System.out.println("Promedio: " + promedio);

        // Bucle do-while para calcular el valor máximo, el valor mínimo y el promedio de n números
        i = 1; // Reinicializar contador
        total = 0; // Reinicializar variable total
        max = Double.MIN_VALUE; // Reinicializar variable máxima
        min = Double.MAX_VALUE; // Reinicializar variable mínima
        do {
            System.out.print("Ingrese el número " + i + ": ");
            num = input.nextDouble();

            // Actualizar valor máximo y mínimo
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }

            // Agregar número al total
            total += num;

            // Incrementar contador
            i++;
        } while (i <= n);

        // Calcular promedio
        promedio = total / n;

        // Mostrar resultados
        System.out.println("Valor máximo: " + max);
        System.out.println("Valor mínimo: " + min);
        System.out.println("Promedio: " + promedio);
    }
}

/*
*En este programa en Java, se pide al usuario que ingrese el valor de n y luego 
*introduzca n números. Luego, se calcula el valor máximo, el valor mínimo y el 
*promedio de los números ingresados. 
*Para hacer esto, se utilizan dos bucles diferentes: el bucle while y el bucle do- while. 
*Ambos bucles realizan la misma operación, pero el bucle do-while se 
*ejecuta al menos una vez, mientras que el bucle while puede no ejecutarse en 
*absoluto si n es igual a cero.
*La entrada del usuario se lee utilizando un objeto Scanner. Se inicializan las 
*variables totales, máximas y mínimas con valores predeterminados. Luego, se 
*solicita al usuario que ingrese n y se ejecuta el bucle while o el bucle do- while, según corresponda.
*Dentro del bucle, se solicita al usuario que ingrese un número y se actualiza el 
*valor máximo y mínimo según sea necesario. Además, el número se agrega al 
*total. Una vez que se han ingresado todos los números, se calcula el promedio y se *muestran los resultados.

*/