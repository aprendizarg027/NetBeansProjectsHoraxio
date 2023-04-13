/*
 *2.-Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de las personas ingresadas por teclado e indique
       si son mayores o menores de edad. Después de cada persona, el programa debe preguntarle al usuario si quiere seguir mostrando personas 
       y frenar cuando el usuario ingrese la palabra “No”.
 */

package registropersonas;

// @author Horacio

 import java.util.Scanner; // Importación de la clase Scanner para leer entrada del usuario

public class RegistroPersonas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Creación de un objeto Scanner para leer entrada del usuario
        String opcion = "Si"; // Variable para almacenar la opción del usuario (Si/No)

        // Ciclo while para continuar solicitando datos mientras el usuario ingrese "Si"
        while (opcion.equalsIgnoreCase("Si")) {
            System.out.println("Ingrese el nombre de la persona: ");
            String nombre = sc.nextLine(); // Lectura del nombre ingresado por el usuario
            System.out.println("Ingrese la edad de la persona: ");
            int edad = sc.nextInt(); // Lectura de la edad ingresada por el usuario

            // Limpieza del buffer del Scanner
            sc.nextLine();

            // Impresión de los datos de la persona ingresada por el usuario
            System.out.println("Nombre: " + nombre);
            System.out.println("Edad: " + edad);

            // Verificación si la persona es mayor o menor de edad
            if (edad >= 18) {
                System.out.println("Es mayor de edad");
            } else {
                System.out.println("Es menor de edad");
            }

            System.out.println("¿Desea ingresar otra persona? (Si/No): ");
            opcion = sc.nextLine(); // Lectura de la opción del usuario (Si/No)
        }

        System.out.println("Programa finalizado."); // Mensaje de finalización del programa
    }
}
/*
En este programa, se utiliza un ciclo while para solicitar los datos de N personas al usuario. 
En cada iteración del ciclo, se solicita el nombre y la edad de la persona, se imprime su nombre, edad y si es mayor o menor de edad,
y luego se le pregunta al usuario si desea ingresar otra persona. 
Si el usuario ingresa "Si", se reinicia el ciclo y se solicitan los datos de la siguiente persona.
Si el usuario ingresa "No", se finaliza el ciclo y se muestra un mensaje de finalización del programa. 
Se utilizan comentarios para explicar cada línea del código en detalle.

*/