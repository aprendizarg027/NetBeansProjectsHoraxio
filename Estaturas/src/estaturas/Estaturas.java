/*
 6-Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por debajo de 1.60 mts. 
 y el promedio de estaturas en general.
 */

package estaturas;

// @author Horacio

 import java.util.Scanner; // Importamos la clase Scanner para poder leer datos del usuario

public class Estaturas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Creamos un objeto Scanner para leer datos del usuario
        double sumaEstaturas = 0; // Inicializamos la variable que almacenará la suma de todas las estaturas ingresadas por el usuario
        int contadorEstaturas = 0; // Inicializamos el contador de estaturas ingresadas por el usuario
        double sumaEstaturasBajo160 = 0; // Inicializamos la variable que almacenará la suma de todas las estaturas por debajo de 1.60 metros
        int contadorEstaturasBajo160 = 0; // Inicializamos el contador de estaturas por debajo de 1.60 metros

        System.out.print("Ingresa el número de personas: "); // Pedimos al usuario que ingrese el número de personas
        int numeroPersonas = sc.nextInt(); // Leemos el número de personas ingresado por el usuario

        for (int i = 1; i <= numeroPersonas; i++) { // Iteramos desde 1 hasta el número de personas ingresado por el usuario
            System.out.print("Ingresa la estatura de la persona " + i + " en metros: "); // Pedimos al usuario que ingrese la estatura de la persona
            double estatura = sc.nextDouble(); // Leemos la estatura ingresada por el usuario
            sumaEstaturas += estatura; // Sumamos la estatura ingresada a la suma total de estaturas
            contadorEstaturas++; // Incrementamos el contador de estaturas

            if (estatura < 1.6) { // Comprobamos si la estatura ingresada es menor a 1.60 metros
                sumaEstaturasBajo160 += estatura; // Sumamos la estatura ingresada a la suma total de estaturas por debajo de 1.60 metros
                contadorEstaturasBajo160++; // Incrementamos el contador de estaturas por debajo de 1.60 metros
            }
        }

        double promedioEstaturas = sumaEstaturas / contadorEstaturas; // Calculamos el promedio de todas las estaturas ingresadas
        double promedioEstaturasBajo160 = sumaEstaturasBajo160 / contadorEstaturasBajo160; // Calculamos el promedio de las estaturas por debajo de 1.60 metros

        System.out.println("El promedio de estaturas es: " + promedioEstaturas); // Mostramos el promedio general de estaturas
        System.out.println("El promedio de estaturas por debajo de 1.60 metros es: " + promedioEstaturasBajo160); // Mostramos el promedio de estaturas por debajo de 1.60 metros

        sc.close(); // Cerramos el objeto Scanner para liberar recursos
    }
}
/*
==========================================================================
*Este programa en Java lee la altura de N personas y calcula el promedio de *estaturas que se encuentran por debajo de 1.60 metros y el promedio de las *estaturas en general. 
*Primero, se importa la clase Scanner para poder leer los datos del usuario. Luego, *se inicializan las variables que se usarán para almacenar la suma y el contador de *todas las estaturas ingresadas y de las estaturas por debajo de 1.60 metros *ingresadas. 
*Se solicita al usuario que ingrese el número de personas y se lee con el objeto *Scanner. Luego, se itera desde 1 hasta el número de personas ingresado por el *usuario y se solicita al usuario que ingrese la estatura de cada persona. 
*La estatura ingresada se suma a la suma total de estaturas y se incrementa el *contador de estaturas. Si la estatura es menor a 1.60 metros, se suma a la suma *total de estaturas por debajo de 1.60 metros y se incrementa el contador de *estaturas por debajo de 1.60 metros. 
*Finalmente, se calcula el promedio de todas las estaturas y el promedio de las *estaturas por debajo de 1.60 metros y se muestran en la pantalla. Se cierra el objeto *Scanner para liberar recursos.
*/
