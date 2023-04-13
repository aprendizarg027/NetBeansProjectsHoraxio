/*
 *Ejercicio 13
Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo y define su tipo de dato de tal manera 
que te permita alojar sus nombres más adelante.
 */

package equipoprogram;

// @author Horacio

 import java.util.Scanner;  // Importamos la clase Scanner para leer entrada del usuario

public class EquipoProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // Creamos un objeto Scanner para leer entrada del usuario
        
        System.out.print("Ingrese la cantidad de compañeros de equipo: ");
        int cantidadCompaneros = input.nextInt();  // Leemos la cantidad de compañeros de equipo ingresada por el usuario
        
        String[] equipo = new String[cantidadCompaneros];  // Creamos un vector de tipo String con el tamaño especificado por el usuario
        
        // Solicitamos al usuario que ingrese los nombres de los compañeros de equipo y los almacenamos en el vector
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
En este programa, utilizamos un vector de tipo String llamado 'equipo' para almacenar los nombres de los compañeros de equipo. 
La dimensión del vector se define mediante la cantidad de compañeros de equipo ingresada por el usuario. 
Utilizamos un objeto Scanner para leer la entrada del usuario, y luego utilizamos un bucle for para solicitar los nombres de los compañeros de equipo y almacenarlos en el vector.
Finalmente, utilizamos otro bucle for para mostrar los nombres de los compañeros de equipo almacenados en el vector.
*/