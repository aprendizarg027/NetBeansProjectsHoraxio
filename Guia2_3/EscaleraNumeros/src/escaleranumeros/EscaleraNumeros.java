/*
 * 13.-Crear un programa que dibuje una escalera de números, donde cada línea de números comience en uno 
 *       y termine en el número de la línea. Solicitar la altura de la escalera al usuario al comenzar. Ejemplo: si se ingresa el número 3:
*1
*12
*123

 */

package escaleranumeros;

// @author Horacio

import java.util.Scanner;

public class EscaleraNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la altura de la escalera: ");
        int altura = sc.nextInt();
        sc.close();

        // Bucle para imprimir cada línea de la escalera
        for (int i = 1; i <= altura; i++) {
            // Bucle para imprimir los números en cada línea
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
/*
Este programa en Java dibuja una escalera de números según la altura ingresada por el usuario.
Primero, se importa la clase Scanner para poder leer la entrada del usuario.
Luego se solicita al usuario que ingrese la altura de la escalera y se guarda en una variable "altura".
Se cierra el objeto Scanner para liberar recursos.
Luego, se utiliza un bucle "for" para imprimir cada línea de la escalera.
El bucle comienza en 1 y se repite hasta que la variable "i" sea igual a la altura ingresada por el usuario.
En cada iteración del bucle exterior, se utiliza otro bucle "for" para imprimir los números en cada línea.
Este segundo bucle comienza en 1 y se repite hasta que la variable "j" sea igual a la 
variable "i" (número de la línea actual).
Dentro de este segundo bucle, se imprime el valor de la variable "j". 
Después de imprimir todos los números de la línea actual, se imprime una nueva línea 
para comenzar la siguiente línea de la escalera.
*/