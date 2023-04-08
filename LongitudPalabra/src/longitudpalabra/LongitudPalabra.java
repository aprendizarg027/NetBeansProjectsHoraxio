/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package longitudpalabra;

// @author Horacio

import java.util.Scanner; // Importar la clase Scanner

public class LongitudPalabra { // Crear la clase LongitudPalabra

    public static void main(String[] args) { // Crear el metodo main

        Scanner entrada = new Scanner(System.in); // Crear un objeto Scanner

        System.out.print("Introduzca una palabra o frase de 8 caracteres: "); // Pedir al usuario que introduzca una palabra o frase de 8 caracteres
        String palabra = entrada.nextLine(); // Leer la entrada del usuario y almacenarla en la variable palabra

        if (palabra.length() == 8) { // Verificar si la longitud de la palabra es igual a 8
            System.out.println("CORRECTO"); // Imprimir "CORRECTO" si la longitud de la palabra es igual a 8
        } else {
            System.out.println("INCORRECTO"); // Imprimir "INCORRECTO" si la longitud de la palabra no es igual a 8
        }
    }
}
/*
*Este programa en Java utiliza la clase Scanner para pedir al usuario que introduzca una palabra o frase de 8 caracteres. 
*Luego, utiliza el método length() de la clase String para verificar si la longitud de la palabra es igual a 8. 
*Si es así, imprime "CORRECTO", de lo contrario, imprime "INCORRECTO". 
*El programa utiliza una estructura de control if-else para realizar esta verificación.
*/
