/*
 */

package Guia5.PracticoExtra;
import java.util.Scanner;
/**
 *
 * @author Daniel
 */
public class Guia5PracticoExtra {

    /**
     * @param args the command line arguments
     * Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño N, 
     * con los valores ingresados por el usuario.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del vector: ");
        int n = sc.nextInt();

        int[] vector = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el valor del elemento " + (i+1) + ": ");
            vector[i] = sc.nextInt();
        }

        int suma = 0;
        for (int i = 0; i < n; i++) {
            suma += vector[i];
        }

        System.out.println("La suma de los elementos del vector es: " + suma);
    }
}