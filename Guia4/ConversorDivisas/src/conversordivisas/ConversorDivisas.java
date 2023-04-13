/*
 * 3.-Crea una aplicación que a través de una función nos convierta una cantidad de euros introducida por teclado a otra moneda,
estas pueden ser a dólares, yenes o libras. 
La función tendrá como parámetros, la cantidad de euros y la moneda a convertir que será una cadena, 
este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
El cambio de divisas es:
i.	* 0.86 libras es un 1 €
ii.	* 1.28611 $ es un 1 €
iii.	* 129.852 yenes es un 1 €

 */

package conversordivisas;

// @author Horacio

import java.util.Scanner; // Importación de la clase Scanner para leer entrada del usuario

public class ConversorDivisas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Creación de un objeto Scanner para leer entrada del usuario

        // Solicitar cantidad de euros al usuario
        System.out.println("Ingrese la cantidad de euros: ");
        double euros = sc.nextDouble(); // Lectura de la cantidad de euros ingresada por el usuario

        // Solicitar moneda a la que se desea convertir
        System.out.println("Ingrese la moneda a la que desea convertir (libras/dólares/yenes): ");
        sc.nextLine(); // Limpieza del buffer del Scanner
        String moneda = sc.nextLine(); // Lectura de la moneda ingresada por el usuario

        // Llamada a la función para realizar la conversión de divisas
        convertirDivisas(euros, moneda);
        
        sc.close(); // Cierre del objeto Scanner
    }

    // Función para convertir una cantidad de euros a otra moneda
    public static void convertirDivisas(double euros, String moneda) {
        double cambio = 0; // Variable para almacenar el valor de cambio

        // Determinar el valor de cambio según la moneda seleccionada
        if (moneda.equalsIgnoreCase("libras")) {
            cambio = euros * 0.86;
        } else if (moneda.equalsIgnoreCase("dólares")) {
            cambio = euros * 1.28611;
        } else if (moneda.equalsIgnoreCase("yenes")) {
            cambio = euros * 129.852;
        } else {
            System.out.println("Moneda no válida."); // Mensaje de error si la moneda no es válida
            return; // Retorno de la función si la moneda no es válida
        }

        // Impresión del mensaje de cambio de divisas
        System.out.println(euros + " euros equivale a " + cambio + " " + moneda);
    }
}
/*
En este programa, se utiliza la clase Scanner para solicitar la cantidad de euros y la moneda a la que se desea convertir al usuario. 
Luego, se llama a la función convertirDivisas() pasando como parámetros la cantidad de euros y la moneda ingresada por el usuario. 
Dentro de la función, se utiliza una serie de condicionales if y else if para determinar el valor de cambio según la moneda seleccionada. 
Si la moneda no es válida, se muestra un mensaje de error y se retorna de la función.
Si la moneda es válida, se imprime un mensaje con el valor de cambio. 

*/