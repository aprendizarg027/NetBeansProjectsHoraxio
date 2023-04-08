/*
 *12-Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-0 al 9-9-9, 
       con la particularidad que cada vez que aparezca un 3 lo sustituya por una E. Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String.
 */

package contador;

// @author Horacio

public class Contador {

    public static void main(String[] args) {
        // Iteramos sobre los números del 0 al 999
        for (int i = 0; i < 1000; i++) {
            // Convertimos el número a una cadena de tres dígitos
            String numero = String.format("%03d", i);
            // Reemplazamos los 3 por E
            numero = numero.replace("3", "E");
            // Mostramos el número en el formato X-X-X
            System.out.println(numero.charAt(0) + "-" + numero.charAt(1) + "-" + numero.charAt(2));
        }
    }

    // Función equals optimizada para comparar dos números en formato String
    public static boolean equals(String numero1, String numero2) {
        if (numero1.length() != numero2.length()) {
            return false;
        }
        for (int i = 0; i < numero1.length(); i++) {
            if (numero1.charAt(i) != numero2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    // Función para convertir un número entero a una cadena de n dígitos rellenando con ceros a la izquierda
    public static String convertirNumero(int numero, int n) {
        return String.format("%0" + n + "d", numero);
    }
}
/*
En primer lugar, se define una clase Contador. Dentro de esta clase se define un método main que es el punto de entrada del programa.
Dentro del método main, se utiliza un bucle for para iterar sobre los números del 0 al 999.
En cada iteración, se convierte el número a una cadena de tres dígitos utilizando String.format("%03d", i). 
La cadena resultante tiene siempre tres dígitos y rellena con ceros a la izquierda si es necesario.
A continuación, se utiliza el método replace de la clase String para reemplazar todos los caracteres "3" por la letra "E". 
Finalmente, se muestra el número en el formato X-X-X utilizando System.out.println.
Además, se han definido dos funciones adicionales. 
La primera es una función equals optimizada para comparar dos números en formato String. 
La función compara los dos números carácter por carácter y devuelve true si son iguales y false en caso contrario.
La segunda función es convertirNumero, que se utiliza para convertir un número entero a una cadena de n dígitos 
rellenando con ceros a la izquierda. Esta función es útil cuando se quiere generar números con un formato específico.

*/