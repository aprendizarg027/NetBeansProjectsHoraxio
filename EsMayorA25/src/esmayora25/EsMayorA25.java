/*
* Ejercicio 6
* Implementar un programa que le pida dos números enteros al usuario y determine si ambos o alguno de ellos es mayor a 25.

 */

package esmayora25;

import java.util.Scanner;

public class EsMayorA25 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2;
        System.out.println("Ingrese el primer número entero:");
        num1 = leer.nextInt();
        System.out.println("Ingrese el segundo número entero:");
        num2 = leer.nextInt();

        if (num1 > 25 && num2 > 25) {
            System.out.println("Ambos números son mayores a 25.");
        } else if (num1 > 25 || num2 > 25) {
            System.out.println("Al menos uno de los números es mayor a 25.");
        } else {
            System.out.println("Ninguno de los números es mayor a 25.");
        }
    }
}
/*

*/