/*
 * Escriba un programa que lea 20 números. 
* Si el número leído es igual a cero se debe salir del bucle y mostrar el mensaje "Se capturó el número cero".  
* El programa deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse.
 */

package leernumero;

// @author Horacio

import java.util.Scanner;

public class LeerNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        for (int i = 1; i <= 20; i++) {
            System.out.println("Ingrese un número:");
            int num = sc.nextInt();
            if (num == 0) {
                System.out.println("Se capturó el número cero");
                break;
            } else if (num > 0) {
                suma += num;
            }
        }
        System.out.println("La suma de los números ingresados es: " + suma);
    }
}
/*
*Este programa en Java utiliza un bucle forpara leer 20 números ingresados ​​por el usuario usando la clase Scanner.
*Si el número ingresado es cero, el bucle se detiene y se muestra el mensaje "Se capturó el número cero". 
*Si el número es positivo, se suma a la variable suma. Si el número es negativo, simplemente se omite.
*Finalmente, el programa muestra el resultado de la suma de los números ingresados ​​(sin contar los negativos).
*/