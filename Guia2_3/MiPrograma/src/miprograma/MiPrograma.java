/*
 * Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
 */

package miprograma;

// @author Horacio

import java.util.Scanner;

public class MiPrograma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();

        System.out.println("Su nombre es: " + nombre);
    }
}

/*
En este programa, se utiliza la clase Scanner para obtener el nombre ingresado por el usuario mediante el teclado. 
Luego, se almacena en la variable nombre de tipo String y se muestra en la consola utilizando el método println de la clase System.
*/