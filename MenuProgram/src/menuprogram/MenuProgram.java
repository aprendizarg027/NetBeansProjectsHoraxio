/*
 6. Realizar un programa que pida dos números enteros positivos por teclado y muestre por pantalla el siguiente menú:
 *  El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla y luego volver al menú.
 *  El programa deberá ejecutarse hasta que se elija la opción 5. 
 *  Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa directamente, 
 *  se debe mostrar el siguiente mensaje de confirmación: 
*  ¿Está seguro que desea salir del programa (S/N)? 
*  Si el usuario selecciona el carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.
 */

package menuprogram;

// @author Horacio

import java.util.Scanner;

public class MenuProgram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Pedimos los numeros enteros positivos
        System.out.print("Introduce el primer número entero positivo: ");
        int num1 = sc.nextInt();
        System.out.print("Introduce el segundo número entero positivo: ");
        int num2 = sc.nextInt();

        //Variable para la opcion del menu
        int opcion;

        //Bucle que se ejecuta hasta que se seleccione la opcion 5
        do {
            System.out.println("========================================="); //  Se separa y mejora la visual del Menú.
            //Mostramos el menu
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            
            System.out.println("==========================================");
            
            //Pedimos la opcion al usuario
            System.out.print("Selecciona una opción: ");
            opcion = sc.nextInt();

            //Realizamos la operacion correspondiente segun la opcion elegida
            switch(opcion) {
                case 1:
                    System.out.println("La suma de " + num1 + " y " + num2 + " es: " + (num1+num2));
                    break;
                case 2:
                    System.out.println("La resta de " + num1 + " y " + num2 + " es: " + (num1-num2));
                    break;
                case 3:
                    System.out.println("El producto de " + num1 + " y " + num2 + " es: " + (num1*num2));
                    break;
                case 4:
                    if(num2 == 0) {
                        System.out.println("No se puede dividir entre 0");
                    } else {
                        System.out.println("La division de " + num1 + " y " + num2 + " es: " + (num1/num2));
                    }
                    break;
                case 5:
                    //Pedimos confirmacion para salir del programa
                    System.out.print("¿Está seguro que desea salir del programa (S/N)? ");
                    char respuesta = sc.next().charAt(0);
                    if(respuesta == 'S' || respuesta == 's') {
                        System.out.println("Saliendo del programa...");
                        break;
                    } else {
                        //Si la respuesta es 'N' o cualquier otra letra, volvemos al menu
                        continue;
                    }
                default:
                    System.out.println("Opción [[NO]] válida");
            }
        } while(opcion != 5);

        sc.close();
    }

}

/*
* Este código en Java pide al usuario dos números enteros positivos por teclado y muestra un menú con diferentes operaciones 
* matemáticas para realizar con dichos números. El programa se ejecuta hasta que el usuario selecciona la opción 5, 
* momento en el que se le pedirá confirmación para salir del programa. Si el usuario confirma la salida, el programa finaliza. 
* Si el usuario no confirma la salida, el programa volverá a mostrar el menú para que el usuario seleccione otra opción.
* Se utiliza un bucle do-while para que el menú se muestre al menos una vez y se lleve a cabo alguna operación 
* antes de que el usuario pueda salir del programa. Dentro del bucle, se utiliza un switch para realizar la operación correspondiente
* según la opción seleccionada por el usuario. En el caso de la opción 5, se utiliza un condicional para pedir confirmación antes de salir del programa. 
* Si la respuesta es afirmativa, se sale del bucle y se finaliza el programa. 
* Si la respuesta es negativa, se utiliza la sentencia continue para volver al inicio del bucle y mostrar de nuevo el menú.
*/