/*
 * 6.- Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la suma de sus filas,
sus columnas y sus diagonales son idénticas. 
Crear un programa que permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no. 
El programa deberá comprobar que los números introducidos son correctos, es decir, están entre el 1 y el 9.
 */

package cuadradomagico;

// @author Horacio

import java.util.Scanner;

public class CuadradoMagico {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[][] cuadrado = new int[3][3]; // Matriz para almacenar el cuadrado mágico

    // Pedir al usuario que introduzca los números del cuadrado mágico
    System.out.println("Introduzca los números del cuadrado mágico (1-9):");
    for (int i = 0; i < 3; i++) { // Iterar por cada fila del cuadrado mágico
      for (int j = 0; j < 3; j++) { // Iterar por cada columna del cuadrado mágico
        cuadrado[i][j] = sc.nextInt(); // Leer el número introducido por el usuario
      }
    }

    // Comprobar que los números introducidos son correctos
    boolean numerosCorrectos = true;
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        if (cuadrado[i][j] < 1 || cuadrado[i][j] > 9) { // Si un número está fuera del rango válido
          numerosCorrectos = false; // Los números introducidos no son correctos
          break;
        }
      }
    }

    // Si los números son correctos, comprobar si es un cuadrado mágico
    if (numerosCorrectos) {
      int sumaFila1 = cuadrado[0][0] + cuadrado[0][1] + cuadrado[0][2];
      int sumaFila2 = cuadrado[1][0] + cuadrado[1][1] + cuadrado[1][2];
      int sumaFila3 = cuadrado[2][0] + cuadrado[2][1] + cuadrado[2][2];
      int sumaColumna1 = cuadrado[0][0] + cuadrado[1][0] + cuadrado[2][0];
      int sumaColumna2 = cuadrado[0][1] + cuadrado[1][1] + cuadrado[2][1];
      int sumaColumna3 = cuadrado[0][2] + cuadrado[1][2] + cuadrado[2][2];
      int sumaDiagonal1 = cuadrado[0][0] + cuadrado[1][1] + cuadrado[2][2];
      int sumaDiagonal2 = cuadrado[0][2] + cuadrado[1][1] + cuadrado[2][0];

      // Comprobar si las sumas son iguales
      if (sumaFila1 == sumaFila2 && sumaFila1 == sumaFila3 && sumaFila1 == sumaColumna1 && sumaFila1 == sumaColumna2 && sumaFila1 == sumaColumna3 && sumaFila1 == sumaDiagonal1 && sumaFila1 == sumaDiagonal2) {
        System.out.println("¡El cuadrado es mágico!");
      } else {
        System.out.println("El cuadrado no es mágico.");
      }
    } else {
      System.out.println("Los números introducidos no son correctos.");
    }
  }
}
/*
La primera línea importa la clase Scanner, que permite leer la entrada del usuario desde la consola.
En el método main, se crea un nuevo objeto Scanner y una matriz para almacenar el cuadrado mágico.

Luego se pide al usuario que introduzca los números del cuadrado mágico, y se utiliza un par de bucles for anidados para iterar por cada fila
y columna del cuadrado y leer los números introducidos por el usuario.

Después se comprueba que los números introducidos estén dentro del rango válido (1-9).
Si un número está fuera de este rango, se establece la variable booleana numerosCorrectos en false.

Si los números son correctos, se calculan las sumas de las filas, las columnas y las diagonales del cuadrado mágico y se comprueba
si son iguales. Si las sumas son iguales, el cuadrado es mágico. De lo contrario, no lo es.

Finalmente, se imprime un mensaje indicando si el cuadrado es mágico o no, o si los números introducidos no son correctos.
*/