/*
 * Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada en punto, 
    y luego codifique la palabra o frase ingresada de la siguiente manera: 
    cada vocal se reemplaza por el carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las vocales acentuadas) 
    se mantienen sin cambios.
a	e	i	o	u
@	#	$	%	*
Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación correspondiente. 
Utilice la estructura “según” para la transformación. 
Por ejemplo, si el usuario ingresa:     Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser:  @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.

 */

package codificadorvocales;

// @author Horacio

import java.util.Scanner;

public class CodificadorVocales {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una secuencia de caracteres terminada en punto: ");
        String entrada = sc.nextLine();
        String salida = codificar(entrada); //llama al subprograma codificar
        System.out.println("La secuencia codificada es: " + salida);
    }

    public static String codificar(String entrada) {
        String salida = "";
        for (int i = 0; i < entrada.length() - 1; i++) { //itera sobre cada caracter de la entrada excepto el punto
            char caracter = entrada.charAt(i);
            switch (caracter) { //utiliza la estructura "switch" para transformar cada caracter según corresponda
                case 'a':
                case 'A':
                    salida += '@';
                    break;
                case 'e':
                case 'E':
                    salida += '#';
                    break;
                case 'i':
                case 'I':
                    salida += '$';
                    break;
                case 'o':
                case 'O':
                    salida += '%';
                    break;
                case 'u':
                case 'U':
                    salida += '*';
                    break;
                default:
                    salida += caracter;
                    break;
            }
        }
        salida += "."; //agrega el punto al final
        return salida;
    }
}