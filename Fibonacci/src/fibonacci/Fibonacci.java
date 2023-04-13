/*
 *7.-Realizar un programa que complete un vector con los N primeros números de la sucesión de Fibonacci. 
Recordar que la sucesión de Fibonacci es la sucesión de los siguientes números:
1, 1, 2, 3, 5, 8, 13, 21, 34, ...
Donde cada uno de los números se calcula sumando los dos anteriores a él. Por ejemplo:
La sucesión del número 2 se calcula sumando (1+1)
Análogamente, la sucesión del número 3 es (1+2),
Y la del 5 es (2+3),
Y así sucesivamente…
La sucesión de Fibonacci se puede formalizar de acuerdo a la siguiente fórmula:
Fibonaccin = Fibonaccin-1 + Fibonaccin-2 para todo n>1
Fibonaccin = 1 para todo n<=1
Por lo tanto, si queremos calcular el término “n” debemos escribir una función
que reciba como parámetro el valor de “n” y que calcule la serie hasta llegar a ese valor.
Para conocer más acerca de la serie de Fibonacci consultar el siguiente link: https://quantdare.com/numeros-de-fibonacci/

 */

package fibonacci;

// @author Horacio

public class Fibonacci {
    public static void main(String[] args) {
        int n = 10; // Número de términos de Fibonacci a generar
        int[] fibonacci = new int[n]; // Crear un arreglo para almacenar los términos de Fibonacci

        // Calcular la sucesión de Fibonacci
        for (int i = 0; i < n; i++) {
            if (i <= 1) {
                fibonacci[i] = 1; // El primer y segundo término de Fibonacci es 1
            } else {
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2]; // Los términos siguientes se calculan sumando los dos anteriores
            }
        }

        // Imprimir los términos de Fibonacci generados
        System.out.println("Los primeros " + n + " números de la sucesión de Fibonacci son:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci[i] + " ");
        }
    }
}
/*
Se declara una clase llamada "Fibonacci" que contiene el método "main" como punto de entrada del programa.
Se define una variable "n" que representa el número de términos de la sucesión de Fibonacci que se desea generar.
Se crea un arreglo llamado "fibonacci" con un tamaño de "n" para almacenar los términos de Fibonacci generados.
Se utiliza un bucle "for" para calcular los términos de Fibonacci. Si "i" es menor o igual a 1, se asigna el valor 1 al arreglo "fibonacci[i]" ya que los dos primeros términos de Fibonacci son 1. De lo contrario, se suma el valor de los dos términos anteriores (fibonacci[i - 1] y fibonacci[i - 2]) para obtener el siguiente término de Fibonacci.
Se utiliza otro bucle "for" para imprimir los términos de Fibonacci generados por pantalla.
Se imprime por pantalla los términos de Fibonacci generados.
*/