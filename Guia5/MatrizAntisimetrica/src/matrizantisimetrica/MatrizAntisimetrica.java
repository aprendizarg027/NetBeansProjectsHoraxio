/*
 * 5.-Realice un programa que compruebe si una matriz dada es antisimétrica. 
       Se dice que una matriz A es antisimétrica cuando ésta es igual a su propia traspuesta, pero cambiada de signo. 
       Es decir, A es antisimétrica si A = -AT. 
       La matriz traspuesta de una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
               Matriz                                                             Matriz Transpuesta
              [0] [-2] [4]                                                                 [0]  [2] [-4]
              [2]  [0]  [2]                                                                [-2] [0] [-2]
              [-4] [-2] [0]                                                                [4]  [2] [0]

 */

package matrizantisimetrica;

// @author Horacio
 
public class MatrizAntisimetrica {

    public static void main(String[] args) {
        // Definición de la matriz original
        int[][] matriz = {{0, -2, 4}, {2, 0, 2}, {-4, -2, 0}};

        // Llamada al método para comprobar si la matriz es antisimétrica
        boolean esAntisimetrica = esAntisimetrica(matriz);

        // Impresión del resultado en la consola
        if (esAntisimetrica) {
            System.out.println("La matriz es antisimétrica.");
        } else {
            System.out.println("La matriz NO es antisimétrica.");
        }
    }

    // Método para comprobar si una matriz es antisimétrica
    public static boolean esAntisimetrica(int[][] matriz) {
        // Obtención del número de filas y columnas de la matriz
        int filas = matriz.length;
        int columnas = matriz[0].length;

        // Comprobación de las dimensiones de la matriz (debe ser cuadrada)
        if (filas != columnas) {
            System.out.println("La matriz no es cuadrada, por lo tanto no puede ser antisimétrica.");
            return false;
        }

        // Comparación de la matriz original con su matriz traspuesta cambiada de signo
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matriz[i][j] != -matriz[j][i]) {
                    // Si algún elemento no cumple con la condición, la matriz no es antisimétrica
                    return false;
                }
            }
        }

        // Si no se encontraron discrepancias, la matriz es antisimétrica
        return true;
    }
}
/*
El programa utiliza un método llamado esAntisimetrica() que recibe como parámetro una matriz representada como un arreglo bidimensional
de enteros. A continuación, se realizan los siguientes pasos:
1-Se obtiene el número de filas y columnas de la matriz mediante los métodos length y matriz[0].length, respectivamente.
2-Se verifica si la matriz es cuadrada, es decir, si el número de filas es igual al número de columnas. 
Si no lo es, se imprime un mensaje indicando que la matriz no puede ser antisimétrica y se retorna false.
3-Se comparan los elementos de la matriz original con los elementos de su matriz traspuesta cambiada de signo. 
Esto se hace utilizando dos ciclos for anidados que recorren la matriz y su matriz traspuesta.
4-Si se encuentra al menos un par de elementos que no cumple con la condición de antisimetría 
(es decir, que no son iguales pero con signo cambiado), se retorna false, indicando que la matriz no es antisimétrica.
5-Si no se encontraron discrepancias, es decir, si todos los elementos de la matriz original cumplen con la condición de antisimetría,
se retorna true, indicando que la matriz es antisimétrica.
*/
