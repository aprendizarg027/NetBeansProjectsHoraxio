/*
 *Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, 
   validando que el primer número múltiplo del segundo e imprima si el primer número es múltiplo del segundo, 
   sino informe que no lo son.
 */

package multiplo;

// @author HoraXio

 import java.util.Scanner; // Importación de la clase Scanner para leer entrada del usuario

public class Multiplo {
    public static void EsMultiplo(int num1, int num2) { // Declaración del procedimiento EsMultiplo
        if (num1 % num2 == 0) { // Verificación si num1 es múltiplo de num2
            System.out.println(num1 + " es múltiplo de " + num2); // Impresión del resultado si num1 es múltiplo de num2
        } else {
            System.out.println(num1 + " no es múltiplo de " + num2); // Impresión del resultado si num1 no es múltiplo de num2
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Creación de un objeto Scanner para leer entrada del usuario

        // Lectura de los dos números ingresados por el usuario
        System.out.println("Ingrese el primer número: ");
        int num1 = sc.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int num2 = sc.nextInt();

        EsMultiplo(num1, num2); // Llamada al procedimiento EsMultiplo con los dos números ingresados por el usuario
    }
}
/*
En este programa, se define un procedimiento llamado EsMultiplo que recibe dos números enteros num1 y num2. 
Dentro del procedimiento, se utiliza la condición num1 % num2 == 0 para verificar si num1 es múltiplo de num2. 
Si es cierto, se imprime un mensaje indicando que num1 es múltiplo de num2, de lo contrario se imprime un mensaje 
indicando que num1 no es múltiplo de num2. En el método main, 
se crea un objeto Scanner para leer los dos números ingresados por el usuario, 
y luego se llama al procedimiento EsMultiplo con los dos números ingresados.
*/