/*
*10-Realice un programa para que el usuario adivine el resultado de una multiplicación entre dos números generados aleatoriamente 
*     entre 0 y 10. El programa debe indicar al usuario si su respuesta es o no correcta. 
*     En caso que la respuesta sea incorrecta se debe permitir al usuario ingresar su respuesta nuevamente. 
*     Para realizar este ejercicio investigue como utilizar la función Math.random() de Java.
 */

package randommultiplicationgame;

// @author Horacio

 import java.util.Scanner;

public class RandomMultiplicationGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, respuesta, respuestacorrecta;
        boolean correcta = false;

        //generar números aleatorios entre 0 y 10
        num1 = (int) (Math.random() * 11);
        num2 = (int) (Math.random() * 11);

        //calcular la respuesta correcta
        respuestacorrecta = num1 * num2;

         //bucle hasta que el usuario adivine la respuesta correcta
        while(!correcta){
            System.out.print("¿Cuánto es " + num1 + " multiplicado por " + num2 + "? ");
            respuesta = input.nextInt();

            if(respuesta == respuestacorrecta){
                System.out.println("Correcto!");
                correcta = true;
            }
            else{
                System.out.println("Incorrecto. Vuelva a intentarlo.");
            }
        }
    }
}
/*
//Función Math.random() optimizada
public static double optimizedRandom(){
    long a = 25214903917L;
    long c = 11L;
    long m = (long) Math.pow(2, 48);
    long x = System.nanoTime();
    x = (a * x + c) % m;
    return ((double) x / m);
}
*/
/*
El programa comienza importando la clase Scanner para permitir que el usuario ingrese datos desde la consola. 
Luego, se declaran las variables para los dos números aleatorios, la respuesta del usuario, la respuesta correcta y un valor booleano 
para indicar si el usuario ha adivinado correctamente el resultado de la multiplicación.

Se generan los números aleatorios utilizando la función Math.random(), que devuelve un número aleatorio entre 0 y 1.
Para obtener un número aleatorio entre 0 y 10, se multiplica el número generado por 11 y se convierte a un entero.

Luego, se calcula la respuesta correcta multiplicando los dos números generados aleatoriamente.

El programa entra en un bucle while [Mientras que] que se ejecuta hasta que el usuario adivina la respuesta correcta. 
En cada iteración del bucle, se le pide al usuario que ingrese su respuesta y se verifica si es correcta o no.
Si la respuesta es correcta, se establece la variable booleana correcto en true y se imprime un mensaje de confirmación. 
Si la respuesta es incorrecta, se imprime un mensaje de error y el bucle continúa.

La función optimizedRandom() utiliza una implementación optimizada de la función Math.random(). 
En lugar de utilizar la función incorporada, se utiliza una fórmula personalizada que utiliza un generador de números pseudoaleatorios lineal
congruente. Esto se hace para mejorar la calidad y la aleatoriedad de los números generados.
*/