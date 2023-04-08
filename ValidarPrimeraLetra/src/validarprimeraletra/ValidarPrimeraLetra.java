/*
* 4. Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase es una ‘A’. 
* Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, 
* en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función Substring y equals() de Java.
 */

package validarprimeraletra;

// @author Horacio

 import java.util.Scanner; // Importamos la clase Scanner para poder leer la entrada del usuario

public class ValidarPrimeraLetra {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Creamos un objeto Scanner para leer la entrada del usuario
        System.out.print("Ingrese una palabra o frase: ");
        String palabra = scanner.nextLine(); // Leemos la entrada del usuario y la almacenamos en la variable palabra

        if (palabra.substring(0, 1).equals("A")) { // Usamos el método substring para obtener la primera letra de la palabra y comparamos si es igual a "A"
            System.out.println("CORRECTO"); // Si la primera letra es "A", imprimimos "CORRECTO"
        } else {
            System.out.println("INCORRECTO"); // Si la primera letra no es "A", imprimimos "INCORRECTO"
        }
    }
}
/*
Comentarios:

Primero importamos la clase Scanner para poder leer la entrada del usuario.

Creamos una clase llamada "ValidarPrimeraLetra" que contiene el método "main", que es el punto de entrada de cualquier programa en Java.

Creamos un objeto Scanner llamado "scanner" para leer la entrada del usuario.

Pedimos al usuario que ingrese una palabra o frase y almacenamos su entrada en la variable "palabra".

Usamos el método "substring" de la clase String para obtener la primera letra de la palabra ingresada por el usuario. 
El método substring toma dos argumentos: el índice inicial y el índice final del substring que deseamos obtener. 
En este caso, usamos el índice inicial 0 (que es el primer carácter) y el índice final 1 (que es el segundo carácter, pero no se incluye en el substring). 
Esto nos da la primera letra de la palabra ingresada por el usuario.
*/