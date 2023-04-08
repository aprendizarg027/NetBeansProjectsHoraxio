/*
 "Ejercicio 10"
*Realizar un programa que lea 4 números (comprendidos entre 1 y 20) 
 *e imprima el número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
a. 5 *****
b. 3 ***
c. 11 ***********
d. 20 **
 */

package leercuatronum;

// @author Horacio

 import java.util.Scanner;

public class LeerCuatroNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[4];

        // Leer los 4 números
        for (int i = 0; i < 4; i++) {
            System.out.print("Ingrese un número entre 1 y 20: ");
            int num = scanner.nextInt();

            // Verificar que el número esté entre 1 y 20
            while (num < 1 || num > 20) {
                System.out.print("El número debe estar entre 1 y 20. Ingrese otro número: ");
                num = scanner.nextInt();
            }

            numbers[i] = num;
        }

        // Imprimir los números con asteriscos
        for (int i = 0; i < 4; i++) {
            System.out.print(numbers[i] + " ");
            for (int j = 0; j < numbers[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*
*Este programa en Java le pide al usuario que ingrese 4 números entre 1 y 20,
*verifica que cada número esté dentro de ese rango, y luego imprime cada número seguido de tantos asteriscos como indique su valor.
*Utiliza un ciclo for para leer los números y otro ciclo for para imprimir los números con asteriscos.
*/