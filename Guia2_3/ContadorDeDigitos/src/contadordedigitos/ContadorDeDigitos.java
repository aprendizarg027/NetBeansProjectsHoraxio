/*
 * 11-Escribir un programa que lea un número entero y devuelva el número de dígitos que componen ese número. 
*       Por ejemplo, si introducimos el número 12345, el programa deberá devolver 5. 
*       Calcular la cantidad de dígitos matemáticamente utilizando el operador de división. 
Nota: recordar que las variables de tipo entero truncan los números o resultados.
 */

package contadordedigitos;

// @author Horacio

 import java.util.Scanner; // Importar la clase Scanner para leer la entrada del usuario

public class ContadorDeDigitos {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in); // Crear un objeto Scanner para leer la entrada del usuario
    System.out.print("Ingrese un número entero: "); // Tener en cuenta que al System.out.print[ln] le falta la 'ln'.
    int numero = input.nextInt(); // Leer el número ingresado por el usuario

    int digitos = 0; // Inicializar la variable que cuenta los dígitos en cero

    while (numero != 0) { // Mientras el número no sea cero
      digitos++; // Incrementar la variable de conteo de dígitos
      numero /= 10; // Dividir el número entre 10 para eliminar el último dígito
    }

    System.out.println("El número ingresado tiene " + digitos + " dígitos.");
  }
}
