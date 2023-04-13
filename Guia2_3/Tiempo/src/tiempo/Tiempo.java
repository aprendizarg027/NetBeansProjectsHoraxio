/*
 
1. Dado un tiempo en minutos, calcular su equivalente en días y horas.
 * Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.

 */

package tiempo;

// @author Horacio

 import java.util.Scanner; //Importar la clase Scanner del paquete java.util

public class Tiempo { //Clase principal Tiempo

    public static void main(String[] args) { //Método main

        Scanner input = new Scanner(System.in); //Crear un objeto Scanner para leer la entrada del usuario
        System.out.print("Ingrese el tiempo en minutos: "); //Mostrar mensaje al usuario
        int minutos = input.nextInt(); //Leer el tiempo en minutos ingresado por el usuario

        int dias = minutos / 1440; //Calcular el número de días a partir de los minutos ingresados. 1440´ equivalen a 1 día.
        int horas = (minutos % 1440) / 60; //Calcular el número de horas a partir de los minutos ingresados

        System.out.println(minutos + " minutos equivalen a " + dias + " día(s) y " + horas + " hora(s)."); //Mostrar el resultado al usuario
    }
}

/*
Este programa en Java recibe un tiempo en minutos ingresado por el usuario y calcula su equivalente en días y horas. 
Primero se importa la clase Scanner del paquete java.util para leer la entrada del usuario. 
Luego se crea un objeto Scanner y se muestra un mensaje pidiendo al usuario que ingrese el tiempo en minutos. 

Después de leer el tiempo en minutos ingresado por el usuario, se realizan los cálculos necesarios para obtener el número de días y horas.
Para calcular el número de días, se divide el tiempo en minutos entre el número de minutos en un día (1440). 
Para calcular el número de horas, se utiliza el operador módulo (%) para obtener el resto de la división entre 
los minutos ingresados y el número de minutos en un día, y luego se divide el resultado entre el número de minutos en una hora (60).

Finalmente, se muestra el resultado al usuario utilizando System.out.println(), donde se concatena el tiempo en minutos ingresado, 
el número de días y el número de horas calculados.
*/