/*
 *
 */

package main;

// @author Horacio

import java.util.Arrays;
import java.util.Random;

public class Main {
  public static void main(String[] args) {

    int[] numeros = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45};
    int[] frecuencias = {830, 887, 913, 813, 848, 840, 891, 806, 854, 964, 912, 823, 804, 799, 789, 928, 881, 807, 804, 1031, 932, 828, 949, 826, 1002, 806, 805, 796, 938, 868, 841, 918, 804, 799, 910, 909, 954, 1021, 801, 791, 885, 902, 825, 1140, 896, 827};

    int[] numerosElegidos = new int[6];
    Random rand = new Random();

    for (int i = 0; i < 6; i++) {
      int numAleatorio = rand.nextInt(numeros.length);
      numerosElegidos[i] = numeros[numAleatorio];
      numeros[numAleatorio] = numeros[numeros.length - 1];
      frecuencias[numAleatorio] = frecuencias[frecuencias.length - 1];
      numeros = Arrays.copyOf(numeros, numeros.length - 1);
      frecuencias = Arrays.copyOf(frecuencias, frecuencias.length - 1);
    }

    System.out.println("Los números elegidos son: ");
    for (int i = 0; i < 6; i++) {
      System.out.print(numerosElegidos[i] + " ");
    }
  }
}

/*
Este código utiliza la clase Random de Java para generar números aleatorios y elige los 6 números basándose en las frecuencias proporcionadas. 
En cada iteración del bucle for, se elige un número aleatorio entre los que quedan por elegir, se añade al array numerosElegidos
y se elimina de los arrays numeros y frecuencias. 
Finalmente, se muestran los números elegidos por pantalla. 

*/