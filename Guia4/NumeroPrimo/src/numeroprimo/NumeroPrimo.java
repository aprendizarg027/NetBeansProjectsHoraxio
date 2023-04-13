/*
 *4.- Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos por parámetro
para que nos indique si es o no un número primo, debe devolver true si es primo, sino false. 

Un número primo es aquel que solo puede dividirse entre 1 y sí mismo. 
   Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
 */

package numeroprimo;

// @author Horacio

 import java.util.Scanner; // Importación de la clase Scanner para leer entrada del usuario

public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Creación de un objeto Scanner para leer entrada del usuario

        // Solicitar número al usuario
        System.out.println("Ingrese un número: ");
        int numero = sc.nextInt(); // Lectura del número ingresado por el usuario

        // Llamada a la función para verificar si el número es primo
        boolean esPrimo = esNumeroPrimo(numero);

        // Impresión del resultado
        if (esPrimo) {
            System.out.println(numero + " es un número primo.");
        } else {
            System.out.println(numero + " no es un número primo.");
        }

        sc.close(); // Cierre del objeto Scanner
    }

    // Función para verificar si un número es primo
    public static boolean esNumeroPrimo(int numero) {
        // Los números menores o iguales a 1 no son primos
        if (numero <= 1) {
            return false;
        }

        // Verificación si el número es primo
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false; // Si el número es divisible por algún otro número, no es primo
            }
        }

        return true; // Si el número no es divisible por ningún otro número, es primo
    }
}
/*
En este programa, se utiliza la clase Scanner para solicitar un número al usuario. 
Luego, se llama a la función esNumeroPrimo() pasando como parámetro el número ingresado por el usuario. 
Dentro de la función, se verifica si el número es menor o igual a 1, en cuyo caso no es primo y se retorna false.
Luego, se realiza un bucle for [Para] desde 2 hasta la raíz cuadrada del número
(ya que no es necesario verificar divisores mayores que la raíz cuadrada), y se verifica si el número es divisible por algún otro número. 
Si es divisible por algún otro número, se retorna false. 
Si no es divisible por ningún otro número, se retorna true, lo que indica que el número es primo.
*/