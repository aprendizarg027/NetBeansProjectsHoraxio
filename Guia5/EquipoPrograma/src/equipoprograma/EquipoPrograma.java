/*
 * Ejercicio 14
Utilizando un Bucle for, aloja en el vector Equipo, los nombres de tus compañeros de equipo
 */

package equipoprograma;

// @author Horacio

 import java.util.Scanner;  // Importamos la clase Scanner para leer entrada del usuario

public class EquipoPrograma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // Creamos un objeto Scanner para leer entrada del usuario
        
        System.out.print("Ingrese la cantidad de compañeros de equipo: ");
        int cantidadCompaneros = input.nextInt();  // Leemos la cantidad de compañeros de equipo ingresada por el usuario
        
        String[] equipo = new String[cantidadCompaneros];  // Creamos un vector de tipo String con el tamaño especificado por el usuario
        
        // Utilizamos un bucle for para alojar los nombres de los compañeros de equipo en el vector
        for (int i = 0; i < cantidadCompaneros; i++) {
            System.out.print("Ingrese el nombre del compañero " + (i + 1) + ": ");
            equipo[i] = input.next();  // Leemos el nombre del compañero ingresado por el usuario y lo almacenamos en el vector
        }
        
        // Mostramos los nombres de los compañeros de equipo almacenados en el vector
        System.out.println("\nNombres de los compañeros de equipo:");
        for (int i = 0; i < cantidadCompaneros; i++) {
            System.out.println("Compañero " + (i + 1) + ": " + equipo[i]);  // Mostramos el nombre del compañero en la posición i del vector
        }
        
        input.close();  // Cerramos el objeto Scanner para liberar recursos
    }
}
/*
En este programa, utilizamos un bucle for para alojar los nombres de los compañeros de equipo en el vector 'equipo'. 
El bucle for se ejecuta 'cantidadCompaneros' veces, y en cada iteración se solicita al usuario que ingrese el nombre del compañero de equipo 
en la posición correspondiente del vector. 
Luego, utilizamos otro bucle for para mostrar los nombres de los compañeros de equipo almacenados en el vector.
*/