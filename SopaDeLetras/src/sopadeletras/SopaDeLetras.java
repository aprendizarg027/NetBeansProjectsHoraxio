/*
 *6.-Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida que el usuario las va ingresando,
construya una “sopa de letras para niños” de tamaño de 20 x 20 caracteres. 
Las palabras se ubicarán todas en orden horizontal en una fila que será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras, rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java substring(), Length() y Math.random().

 */

package sopadeletras;

import java.util.Scanner;

public class SopaDeLetras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] matriz = new String[20][20];
        int cont = 0;

        for (int i = 0; i < 5; i++) {
            cont = 0;
            System.out.println("Ingrese 5 palabras para la sopa de letras:");
            String palabra = sc.nextLine();

            // Validar que la palabra tenga entre 3 y 5 caracteres
            while (palabra.length() < 3 || palabra.length() > 5) {
                System.out.println("Palabra incorrecta. Ingrese una palabra de 3 a 5 caracteres:");
                palabra = sc.nextLine();
            }

            // Generar una fila aleatoria para colocar la palabra en la matriz
            int fila = (int) (Math.random() * matriz.length);
            while (matriz[fila][0] != null) {
                fila = (int) (Math.random() * 20);
            }

            // Generar una columna aleatoria para colocar la palabra en la matriz
            int columna = (int) (Math.random() * 14);

            // Colocar cada letra de la palabra en la matriz consecutivamente
            for (int j = columna; j < (columna + palabra.length()); j++) {
                matriz[fila][j] = palabra.toUpperCase().substring(cont, cont + 1);
                cont++;
            }

            cont = 0;
            // Llenar los espacios vacíos en la fila con números aleatorios del 1 al 9
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[fila][j] == null) {
                    matriz[fila][j] = String.valueOf((int) (Math.random() * 9 + 1));
                }
            }
        }

        // Llenar cualquier espacio vacío restante en la matriz con números aleatorios del 1 al 9
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] == null) {
                    matriz[i][j] = String.valueOf((int) (Math.random() * 9 + 1));
                }
            }
        }

        // Mostrar la matriz resultante en la consola
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println("");
        }
    }
}
/*
Se importa la clase Scanner para leer la entrada del usuario.
Se crea un arreglo de Strings llamado "palabras" para almacenar las palabras ingresadas por el usuario.
Se crea un arreglo bidimensional de caracteres llamado "sopaDeLetras" para representar la sopa de letras.
Se solicita al usuario que ingrese 5 palabras de mínimo 3 y máximo 5 caracteres.
Se lee cada palabra ingresada por el usuario y se guarda en el arreglo de palabras.
Se selecciona aleatoriamente una fila donde se ubicarán las palabras en la sopa de letras.
Se itera a través de las palabras ingresadas y se coloca cada letra de la palabra en la fila seleccionada de la sopa de letras.
Se verifica si alguna celda de la sopa de letras está vacía y se llena con un número aleatorio del 0 al 9.
Se imprime la sopa de letras por pantalla.
El programa finaliza.
*/