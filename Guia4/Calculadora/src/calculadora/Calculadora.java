/*
 1. Crea una aplicación que le pida dos números al usuario y este pueda elegir entre 
     sumar, restar, multiplicar y dividir. 
 La aplicación debe tener una función para cada operación matemática y deben devolver sus resultados para imprimirlos en el main. 
 */

package calculadora;

// @author Horacio

 import java.util.Scanner; // Importación de la clase Scanner para leer entrada del usuario

public class Calculadora {
    // Función para sumar dos números
    public static int sumar(int num1, int num2) {
        return num1 + num2;
    }

    // Función para restar dos números
    public static int restar(int num1, int num2) {
        return num1 - num2;
    }

    // Función para multiplicar dos números
    public static int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    // Función para dividir dos números
    public static int dividir(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("No se puede dividir por cero");
            return 0;
        } else {
            return num1 / num2;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Creación de un objeto Scanner para leer entrada del usuario

        // Lectura de los dos números ingresados por el usuario
        System.out.println("Ingrese el primer número: ");
        int num1 = sc.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int num2 = sc.nextInt();

        // Menú de opciones para el usuario
        System.out.println("Seleccione una operación:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        int opcion = sc.nextInt();

        int resultado = 0; // Variable para almacenar el resultado

        // Switch para ejecutar la función correspondiente según la opción seleccionada
        switch (opcion) {
            case 1:
                resultado = sumar(num1, num2);
                break;
            case 2:
                resultado = restar(num1, num2);
                break;
            case 3:
                resultado = multiplicar(num1, num2);
                break;
            case 4:
                resultado = dividir(num1, num2);
                break;
            default:
                System.out.println("Opción inválida");
                break;
        }

        System.out.println("Resultado: " + resultado); // Impresión del resultado en el main
    }
}
/*
En este programa, se definen cuatro funciones sumar, restar, multiplicar y dividir que realizan las operaciones matemáticas correspondientes. 
Luego, en el método main, se crea un objeto Scanner para leer los dos números ingresados por el usuario y se muestra un menú de opciones.
Se utiliza un switch para ejecutar la función correspondiente según la opción seleccionada por el usuario. 
Finalmente, se imprime el resultado en el main del programa.
*/





