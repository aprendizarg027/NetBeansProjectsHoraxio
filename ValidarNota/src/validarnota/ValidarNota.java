/*
 *Ejercicio 8
*Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.

 */

package validarnota;

// @author Horacio

import java.util.Scanner;

public class ValidarNota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float nota = -1;

        while(nota < 0 || nota > 10) {
            System.out.print("Introduce una nota entre 0 y 10: ");
            nota = sc.nextFloat();
            if(nota < 0 || nota > 10) {
                System.out.println("La nota introducida no es correcta.");
            }
        }
        System.out.println("La nota introducida es: " + nota);
    }
}
/*
*Este programa en Java pide al usuario que introduzca una nota entre 0 y 10. 
*Si la nota reemplazada es menor que 0 o mayor que 10, el programa muestra un mensaje de error y vuelve a pedir al usuario que introduzca una nota. 
*Si la nota necesaria es, el programa muestra un mensaje válido indicando la nota necesaria.
*/
