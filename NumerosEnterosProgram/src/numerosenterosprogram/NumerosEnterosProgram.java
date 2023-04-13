/*
 1.- Realizar un algoritmo que llene un vector con los 100 primeros números enteros y los muestre por pantalla en orden descendente.
 */

package numerosenterosprogram;

// @author Horacio

 public class NumerosEnterosProgram {
    public static void main(String[] args) {
        int[] numeros = new int[100];  // Creamos un vector de tipo entero con tamaño 100
        
        // Llenamos el vector con los 100 primeros números enteros en orden ascendente
        for (int i = 0; i < 100; i++) {
            numeros[i] = i + 1;  // Asignamos el valor i + 1 a la posición i del vector
        }
        
        // Mostramos los números enteros en orden descendente
        System.out.println("Números enteros en orden descendente:");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);  // Mostramos el número entero en la posición i del vector
        }
    }
}
/*
En este algoritmo, creamos un vector de tipo entero llamado 'numeros' con tamaño 100.
Luego, utilizamos un bucle for para llenar el vector con los 100 primeros números enteros en orden ascendente, 
asignando el valor de 'i + 1' a la posición 'i' del vector en cada iteración. 
Finalmente, utilizamos otro bucle for para mostrar los números enteros en orden descendente, 
comenzando desde la última posición del vector ('numeros.length - 1') y retrocediendo hasta la primera posición ('0').
En cada iteración, mostramos el número entero en la posición 'i' del vector por pantalla.
*/