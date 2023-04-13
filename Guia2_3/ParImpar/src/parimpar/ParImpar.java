/*
 * 1. Crear un programa que dado un número determine si es par o impar.
 */

package parimpar;

// @author Horacio

 import java.util.Scanner; //importamos la clase Scanner para poder leer la entrada del usuario

public class ParImpar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //creamos un objeto Scanner para leer la entrada del usuario
        System.out.print("Ingrese un número: ");
        int num = input.nextInt(); //leemos el número ingresado por el usuario
        if (num % 2 == 0) {
            System.out.println(num + " es un número par."); //si el número es divisible entre 2, es par
        } else {
            System.out.println(num + " es un número impar."); //si el número no es divisible entre 2, es impar
        }
    }
}
/*
*Este programa en Java le pide al usuario que ingrese un número y determina si es par o impar utilizando el operador módulo (%), 
*que devuelve el resto de la división. Si el resto es 0, el número es par; de lo contrario, el número es impar.
*Para leer la entrada del usuario, utilizamos la clase Scanner de Java, que nos permite leer diferentes tipos de datos desde la entrada 
*estándar del sistema (en este caso, el teclado).
*Creamos un objeto Scanner llamado "input" y lo usamos para leer un número entero ingresado por el usuario con el método nextInt().
*Luego, utilizamos un condicional if-else para verificar si el número es par o impar. 
*Si el número es divisible entre 2 (es decir, si num % 2 == 0 es verdadero), imprimimos un mensaje que indica que es un número par.
*De lo contrario, imprimimos un mensaje que indica que es un número impar.
*/
