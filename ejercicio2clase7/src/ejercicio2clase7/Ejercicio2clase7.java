/*Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de las personas 
ingresadas por teclado e indique si son mayores o menores de edad. Después de cada persona, el programa 
debe preguntarle al usuario si quiere seguir mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
 */

package ejercicio2clase7;

// @author Horacio

 import java.util.Scanner;

public class Ejercicio2clase7 {

    Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); 
        String condition;
        do {
            System.out.println("Ingresar el nombre de la persona" );
            String nombre = leer.nextLine();
            System.out.println("Ingresar la edad de la persona" ); 
            int edad = leer.nextInt();
            leer.nextLine(); // Se añade esta línea para limpiar el buffer de entrada
            System.out.println("La persona " + nombre + " tiene " + edad + " años" );
            validar(edad); 
            System.out.println("Desea seguir ingresando personas?" );
            String val = leer.nextLine();
            if(val.equalsIgnoreCase("no")){ // Se utiliza el método equalsIgnoreCase para comparar cadenas
                System.out.println("Gracias vuelvas prontos" );   
            }
            condition = val;

        } while (!condition.equalsIgnoreCase("no")); // Se utiliza el método equalsIgnoreCase para comparar cadenas
    }

    public static void validar(int num1) {
        if(num1 < 18){
            System.out.println("Es menor de edad" );
        }else{
            System.out.println("Es mayor de edad" );
        }
    }
}

