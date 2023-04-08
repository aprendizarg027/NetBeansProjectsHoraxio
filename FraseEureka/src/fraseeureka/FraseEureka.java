/*
 * 2. Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa pondrá un mensaje de Correcto,
 *    sino mostrará un mensaje de Incorrecto. Nota: investigar la función equals() en Java.
 */

package fraseeureka;

// @author Horacio

import java.util.Scanner;

public class FraseEureka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase: ");
        String frase = sc.nextLine();
        sc.close();

        if (frase.equals("eureka")) { //compara si la frase es igual a "eureka"
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
    }
}
/*
* La función equals() en Java es una función que compara si dos objetos son iguales o no. 
 * Esta función es heredada de la clase Object y se puede sobrescribir en otras clases para que tenga un comportamiento específico.
*/