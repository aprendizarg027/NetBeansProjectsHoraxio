/*
 *14.-Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de hijos.
 *      Escriba un programa que pida la cantidad de familias y para cada familia la cantidad de hijos 
 *      para averiguar la media de edad de los hijos de todas las familias.
 */

package mediaedadhijos;

// @author Horacio

 import java.util.Scanner;

public class MediaEdadHijos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); //Se crea un objeto Scanner para obtener datos de la consola
        int nFamilias, nHijos = 0, sumaEdades = 0; //Se declaran las variables para el número de familias, hijos y la suma de edades
        double media; //Se declara la variable para la media de edad de los hijos

        System.out.print("Ingrese la cantidad de familias: ");
        nFamilias = entrada.nextInt(); //Se obtiene la cantidad de familias

        for(int i = 1; i <= nFamilias; i++) { //Se inicia un ciclo para cada familia
            System.out.print("Ingrese la cantidad de hijos de la familia " + i + ": ");
            nHijos = entrada.nextInt(); //Se obtiene la cantidad de hijos de la familia actual
            for(int j = 1; j <= nHijos; j++) { //Se inicia un ciclo para cada hijo de la familia actual
                System.out.print("Ingrese la edad del hijo " + j + " de la familia " + i + ": ");
                sumaEdades += entrada.nextInt(); //Se va sumando la edad de cada hijo a la variable sumaEdades
            }
        }

        media = (double) sumaEdades / (nFamilias * nHijos); //Se calcula la media de edad de los hijos de todas las familias
        System.out.println("La media de edad de los hijos de todas las familias es: " + media);
    }
}
/*
El programa comienza importando la clase Scanner que se utilizará para leer los datos de entrada proporcionados por el usuario.
Luego, se declaran las variables necesarias para almacenar la cantidad de familias, la cantidad de hijos y la suma de edades de los hijos.
También se declara la variable para la media de edad de los hijos.
El programa solicita al usuario que ingrese la cantidad de familias que se van a calcular, utilizando el método nextInt() de la clase Scanner. 
A continuación, comienza un ciclo for que se ejecuta una vez para cada familia.
Dentro de este ciclo, se solicita al usuario que ingrese la cantidad de hijos de la familia

*/