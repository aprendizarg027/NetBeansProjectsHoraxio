/*
 * 8. Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. 
 *     Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:

* * * *
*        *
*        *
 * * * *

 */

package cuadrado;

// @author HoraXio

 import java.util.Scanner;

public class Cuadrado {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la longitud del lado del cuadrado: ");
        int n = sc.nextInt();

        // Dibuja la primera línea del cuadrado
        for (int i = 1; i <= n; i++) {
            System.out.print("* ");
        }
        System.out.println();

        // Dibuja las líneas intermedias del cuadrado
        for (int i = 2; i <= n - 1; i++) {
            System.out.print("* ");
            for (int j = 2; j <= n - 1; j++) {
                System.out.print("  ");
            }
            System.out.println("*");
        }

        // Dibuja la última línea del cuadrado
        for (int i = 1; i <= n; i++) {
            System.out.print("* ");
        }
    }
}
/*
El programa pide al usuario que ingrese la longitud del lado del cuadrado y luego utiliza tres bucles for para dibujar el cuadrado. 
El primer bucle dibuja la primera línea del cuadrado, el segundo bucle dibuja las líneas intermedias (dejando un espacio en blanco en el medio) 
y el tercer bucle dibuja la última línea del cuadrado. El resultado final es un cuadrado de "*".
*/