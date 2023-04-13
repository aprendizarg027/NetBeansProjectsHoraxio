/*
 2-Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada una.
    A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C tome el valor de A, A tome el valor de D y 
    D tome el valor de B. Mostrar los valores iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
 */

package cambiovariables;

// @author Horacio

public class CambioVariables {
  public static void main(String[] args) {
    int A = 5; // Declaración y asignación de la variable A
    int B = 10; // Declaración y asignación de la variable B
    int C = 15; // Declaración y asignación de la variable C
    int D = 20; // Declaración y asignación de la variable D

    int auxiliar = B; // Se guarda el valor de B en la variable auxiliar
    B = C; // Se asigna el valor de C a la variable B
    C = A; // Se asigna el valor de A a la variable C
    A = D; // Se asigna el valor de D a la variable A
    D = auxiliar; // Se asigna el valor de la variable auxiliar a la variable D

    // Se muestran los valores iniciales y finales de cada variable
    System.out.println("Valores iniciales:");
    System.out.println("A: " + 5);
    System.out.println("B: " + 10);
    System.out.println("C: " + 15);
    System.out.println("D: " + 20);

    System.out.println("Valores finales:");
    System.out.println("A: " + A);
    System.out.println("B: " + B);
    System.out.println("C: " + C);
    System.out.println("D: " + D);
  }
}
/*
*Este programa en Java declara cuatro variables de tipo entero y les asigna un valor 
*diferente a cada una. Luego, se utiliza una variable auxiliar para intercambiar los 
*valores de las variables de la siguiente manera: B toma el valor de C, C toma el valor 
*de A, A toma el valor de D y D toma el valor de B. Finalmente, se muestran los 
*valores iniciales y finales de cada variable.
*/