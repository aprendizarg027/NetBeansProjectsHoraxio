/*
 *3- Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal. 
       Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String..
 */

package vocaldetector;

// @author Horacio

import java.util.Scanner; // Importamos la clase Scanner para poder leer la entrada del usuario

public class VocalDetector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Creamos un objeto Scanner para leer la entrada del usuario
        System.out.println("Ingresa una letra: ");
        String letra = sc.nextLine(); // Leemos la letra ingresada por el usuario y la almacenamos en una variable

        // Comparamos la letra ingresada con las vocales
        if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
            System.out.println("La letra ingresada es una vocal.");
        } else {
            System.out.println("La letra ingresada no es una vocal.");
        }
    }
}
/*
*En este ejemplo, primero importamos la clase Scanner para poder leer la entrada 
*del usuario. Luego, creamos un objeto Scanner y le pedimos al usuario que ingrese 
*una letra. La letra ingresada se almacena en una variable llamada letra.
*Después, comparamos la letra ingresada con las vocales utilizando la función 
*equals() de la clase String. Si la letra es una vocal, se muestra un mensaje 
*indicando que la letra es una vocal. Si no es una vocal, se muestra un mensaje 
*indicando que la letra no es una vocal.
*/