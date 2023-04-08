/*
 * 7. Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de dispositivo lee cadenas enviadas por el usuario. 
 *     Las cadenas deben llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, 
 *     el primer carácter tiene que ser X y el último tiene que ser una O.
 *     Las secuencias leídas que respeten el formato se consideran correctas, la secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE),
 *     y toda secuencia distinta de FDE, que no respete el formato se considera incorrecta.
 *     Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e incorrectas recibidas. 
 *     Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java Substring(), Length(), equals().

 */

package dispositivors232;

// @author HoraXio

 import java.util.Scanner; //Importamos la clase Scanner

public class DispositivoRS232 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Creamos un objeto Scanner para leer los datos ingresados por el usuario
        int correctas = 0, incorrectas = 0; //Inicializamos el contador de secuencias correctas e incorrectas en 0
        String cadena; //Declaramos la variable para almacenar la cadena ingresada por el usuario

        while (true) { //Bucle infinito hasta recibir la secuencia especial "&&&&&"
            System.out.print("Ingrese una cadena: ");
            cadena = input.nextLine(); //Leemos la cadena ingresada por el usuario

            if (cadena.equals("&&&&&")) { //Si se ingresó la secuencia especial "&&&&&", salimos del bucle
                break;
            }

            if (cadena.length() == 5 && cadena.charAt(0) == 'X' && cadena.charAt(4) == 'O') { //Verificamos si la cadena ingresada cumple con el formato requerido
                correctas++; //Si la cadena es correcta, aumentamos el contador de secuencias correctas
            } else {
                incorrectas++; //Si la cadena es incorrecta, aumentamos el contador de secuencias incorrectas
                continue; //Continuamos con la siguiente iteración del bucle
            }
        }

        //Imprimimos el informe con la cantidad de secuencias correctas e incorrectas recibidas
        System.out.println("Informe:");
        System.out.println(" **************************************** "); // Ingresamos [*] para mejorar la visual al ejecutar el código.
        System.out.println("Secuencias correctas: " + correctas);
        System.out.println(" **************************************** ");
        System.out.println("Secuencias incorrectas: " + incorrectas);
    }

}
