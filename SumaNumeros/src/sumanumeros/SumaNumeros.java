/*
 * 5. Escriba un programa en el cual se ingrese un valor límite positivo, 
 *     y a continuación solicite números al usuario hasta que la suma de los números introducidos supere el límite inicial.
 */

package sumanumeros;

// @author Horacio

 import java.util.Scanner; // Importamos la clase Scanner

public class SumaNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Creamos un objeto Scanner para leer la entrada del usuario
        System.out.print("Ingrese el límite: ");
        int limite = sc.nextInt(); // Leemos el límite

        int suma = 0; // Inicializamos la variable suma en cero
        int numero; // Declaramos la variable numero

        do {
            System.out.print("Ingrese un número: ");
            numero = sc.nextInt(); // Leemos el número ingresado por el usuario
            suma += numero; // Sumamos el número a la variable suma
        } while (suma <= limite); // Mientras la suma sea menor o igual al límite, continuamos pidiendo números al usuario

        System.out.println("La suma de los números ingresados es: " + suma);
    }
}
/*
*Primero importamos la clase Scanner, que nos permitirá leer la entrada del usuario. 
*Luego, creamos un objeto Scanner y pedimos al usuario que ingrese el límite.
*A continuación, inicializamos la variable suma en cero y declaramos la variable numero.
*Luego, usamos un bucle do-while para pedir números al usuario y sumarlos a la variable suma. 
*El bucle continuará ejecutándose mientras la suma sea menor o igual al límite ingresado por el usuario.

*Finalmente, mostramos en pantalla la suma de los números ingresados por el usuario.
*/
