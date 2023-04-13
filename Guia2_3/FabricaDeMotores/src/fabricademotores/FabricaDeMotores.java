/*
 Ejercicio 7
Considera que estás desarrollando una web para una empresa que fabrica motores
(suponemos que se trata del tipo de motor de una bomba para mover fluidos). 
Definir una variable tipoMotor y permitir que el usuario ingrese un valor entre 1 y 4. El programa debe mostrar lo siguiente:
o	Si el tipo de motor es 1, mostrar un mensaje indicando “La bomba es una bomba de agua”.
o	Si el tipo de motor es 2, mostrar un mensaje indicando “La bomba es una bomba de gasolina”.
o	Si el tipo de motor es 3, mostrar un mensaje indicando “La bomba es una bomba de hormigón”.
o	Si el tipo de motor es 4, mostrar un mensaje indicando “La bomba es una bomba de pasta alimenticia”.
o	Si no se cumple ninguno de los valores anteriores mostrar el mensaje “No existe un valor válido para tipo de bomba”

 */

package fabricademotores;

// @author Horacio

 import java.util.Scanner;

public class FabricaDeMotores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tipoMotor;

        System.out.println("Ingrese el tipo de motor (1-4): ");
        tipoMotor = scanner.nextInt();

        switch (tipoMotor) {
            case 1:
                System.out.println("La bomba es una bomba de agua.");
                break;
            case 2:
                System.out.println("La bomba es una bomba de gasolina.");
                break;
            case 3:
                System.out.println("La bomba es una bomba de hormigón.");
                break;
            case 4:
                System.out.println("La bomba es una bomba de pasta alimenticia.");
                break;
            default:
                System.out.println("No existe un valor válido para tipo de bomba.");
        }
    }
}
/*
*Este programa utiliza la estructura de control switchpara comparar el valor ingresado por el usuario con los posibles
*valores para el tipo de motor y mostrar el mensaje correspondiente. Si el valor ingresado no coincide con ninguno de los posibles valores, 
*se muestra un mensaje de error.
*/
