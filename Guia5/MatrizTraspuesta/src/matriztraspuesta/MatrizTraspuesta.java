/*
 *4.-Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la traspuesta de la matriz. 
La matriz traspuesta de una matriz A se denota por B y se obtiene cambiando sus filas por columnas (o viceversa).
                 [1] [0] [4]                                                                 [1] [0] [6]
 Matriz A= [0] [5] [0]  ->                                           Matriz B= [0] [5] [0]
                 [6] [0] [-9]                                                               [4] [0] [-9]

 */

package matriztraspuesta;

// @author Horacio

 import java.util.Random;

public class MatrizTraspuesta {

    public static void main(String[] args) {
        // Declaración y creación de una matriz de 4x4
        int[][] matriz = new int[4][4];
        
        // Llenado de la matriz con valores aleatorios
        llenarMatriz(matriz);
        
        // Impresión de la matriz original
        System.out.println("Matriz original:");
        imprimirMatriz(matriz);
        
        // Cálculo y obtención de la matriz traspuesta
        int[][] matrizTraspuesta = obtenerMatrizTraspuesta(matriz);
        
        // Impresión de la matriz traspuesta
        System.out.println("\nMatriz traspuesta:");
        imprimirMatriz(matrizTraspuesta);
    }

    // Método para llenar la matriz con valores aleatorios
    public static void llenarMatriz(int[][] matriz) {
        Random random = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = random.nextInt(10); // Genera un número aleatorio entre 0 y 9
            }
        }
    }

    // Método para obtener la matriz traspuesta
    public static int[][] obtenerMatrizTraspuesta(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int[][] matrizTraspuesta = new int[columnas][filas]; // Se intercambian filas por columnas
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizTraspuesta[j][i] = matriz[i][j]; // Se asigna el valor de la matriz original a la traspuesta
            }
        }
        return matrizTraspuesta;
    }

    // Método para imprimir una matriz
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " "); // Se imprime cada elemento de la matriz
            }
            System.out.println(); // Salto de línea después de cada fila
        }
    }

}
/*
Se importa la clase Random del paquete java.util para generar números aleatorios.
Se declara y crea una matriz de 4x4 llamada matriz que almacenará los valores aleatorios.
Se utiliza el método llenarMatriz() para llenar la matriz con valores aleatorios utilizando un ciclo for anidado.
Se imprime la matriz original utilizando el método imprimirMatriz() para mostrar su contenido en la consola.
Se utiliza el método obtenerMatrizTraspuesta() para obtener la matriz traspuesta de matriz.
Se crea una nueva matriz matrizTraspuesta con el tamaño intercambiado de filas por columnas, 
es decir, con un tamaño de columnas x filas. 
Luego, se utiliza otro par de ciclos for anidados para intercambiar las filas por las columnas de la matriz original
y asignar los valores correspondientes a la matriz traspuesta.
Se retorna la matriz traspuesta obtenida.

Se imprime la matriz traspuesta utilizando el método imprimirMatriz() para mostrar su contenido en la consola.
Los métodos llenarMatriz(), obtenerMatrizTraspuesta() y imprimirMatriz() son métodos auxiliares creados para modularizar el código
y realizar las tareas específicas de llenado de la matriz, obtención de la matriz traspuesta y la impresión de la matriz en la consola, 
respectivamente.
El programa finaliza su ejecución.
*/