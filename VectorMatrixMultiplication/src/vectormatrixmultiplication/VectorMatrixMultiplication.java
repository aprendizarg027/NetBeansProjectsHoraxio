/*
 *Este ejercicio es un ejemplo de la Guia5 y el enlace lo podes ver en: https://youtu.be/CKSW8ws8fAU
 * Realizar la multiplicación de un vector por una matriz.
 *Dado un vector 1xN y una matriz NxM, el resultado del producto es 1xM
 [Recuerda que los vectores se representan por 1fila y N columnas]
Ej vector 1x2 * matriz 2x3 = producto 1x3
v=|3,5| * |4,8,6| = |3*4*5*2,3*8*5*1*7| = |22,29,53|
              |2,1,7|
 */

package vectormatrixmultiplication;

// @author Horacio

 import java.util.Scanner;

public class VectorMatrixMultiplication {

    //Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
//declaración y creación de una vector
//tipo[] nombreVector = new tipo [Tamaño];

//declarar un arreglo de una dimensión
int [] vector;
//Crear en memoria (construir/dimensionar) con el valor por defecto (cero para los enteros)
vector = new int[2];
//los dos pasos en una linea
int [] producto = new int [3];

//Declaración y creación de una matriz.
//tipo [] [] nombreMatriz = new tipo[filas] [columnas]

//Declaración e inicialización con valores determinados
int [] [] matriz = {{4, 8, 6}, {2, 1, 7}};

//Declaración y creación de arreglos genéricos 
//tipo [] []......[] nombreArreglo = new tipo[cardinalidad1] [cardinalidad2] [cardinalidad N];

        System.out.println("Ingrese los valores del vector de tamaño " +vector.length+":");//función length devuelve el largo o la cardinalidad que posee el vector. En el caso de la matriz la cardinalidad decada una de las dimensiones. 
        Scanner leer = new Scanner(System.in);
        //int = 0, porque los subíndices de los arreglos en Java inician en cero.
        for (int i = 0; i< vector.length; i++) {
            System.out.println("v["+i+"]=");
            //acceder al valor i del vector
            vector [i] = leer.nextInt();
        }
           //Multiplica vector por matriz
           int sum;
           //....para cada columna de la matriz...
           for (int j = 0; j < matriz [0].length; j++) {
                    sum = 0;
                    //..recorro el vector y multiplico
                    for (int i = 0; i < vector.length; i++) {
                          sum += vector [i] * matriz [i] [j];
                 
                    }
                
                    producto[j] = sum;
           }  
           String aux = "";
           
           //Mostrar vector
           System.out.println("* Vector:");
           //bucle for "mejorado" (enhanced)
           //for (tipo elemento : arreglo)
           for (int elemento: vector) {
                 aux = aux + "  " + elemento;
           }
           System.out.println(aux);
           
           //mostramos matriz
           System.out.println("\n* Matriz:");
           //para cada fila de la matriz
           for (int [] fila : matriz) {
               aux = "";
               //para cada elemento de la fila
               for (int elemento: fila) {
                         aux += "  " + elemento;
               }
               System.out.println(aux);
           }
           //Mostrar resultado
           aux = "";
           System.out.println("\n* Vector x Matriz:");
           for (int elemento: producto) {
               aux += "  " + elemento;
           }
           System.out.println(aux);
}    
    }     