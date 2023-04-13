/*
Este ejercicio es un ejemplo de la Guia5 y el enlace lo podes ver en: https://youtu.be/CKSW8ws8fAU
 * Realizar la multiplicación de un vector por una matriz.
Dado un vector 1xN y una matriz NxM, el resultado del producto es 1xM
[Recuerda que los vectores se representan por 1fila y N columnas]
Ej vector 1x2 * matriz 2x3 = producto 1x3
v=|3,5| * |4,8,6| = |3*4*5*2,3*8*5*1*7| = |22,29,53|
              |2,1,7|
*/

package productovectormatriz;

// @author Horacio


public class ProductoVectorMatriz {
    
    public static void main(String[] args) {
        // Definimos el vector 1xN y la matriz NxM
        int[] vector = {3, 5}; // Vector 1x2
        int[][] matriz = {{4, 8, 6}, {2, 1, 7}}; // Matriz 2x3
        
        // Comprobamos si las dimensiones del vector y la matriz son compatibles para la multiplicación
        if (vector.length != matriz.length) {
            System.out.println("Las dimensiones del vector y la matriz no son compatibles para la multiplicación.");
            return;
        }
        
        // Obtenemos las dimensiones del vector y la matriz
        int vectorLength = vector.length;
        int matrizLength = matriz[0].length;
        
        // Creamos un arreglo para almacenar el resultado de la multiplicación
        int[] resultado = new int[matrizLength];
        
        // Realizamos la multiplicación del vector por la matriz
        for (int i = 0; i < matrizLength; i++) {
            int sum = 0;
            for (int j = 0; j < vectorLength; j++) {
                sum += vector[j] * matriz[j][i];
            }
            resultado[i] = sum;
        }
        
        // Mostramos el resultado
        System.out.println("Resultado de la multiplicación del vector por la matriz:");
        for (int i = 0; i < resultado.length; i++) {
            System.out.print(resultado[i] + " ");
        }
    }
}
