/*
 *4-Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su equivalente en romano.
 */

package numeroaromano;

// @author Horacio

import java.util.Scanner; //importamos la clase Scanner para poder leer la entrada del usuario

public class NumeroARomano {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //creamos una instancia de la clase Scanner

        System.out.println("Ingrese un número entre 1 y 10: "); //solicitamos al usuario que ingrese un número

        int numero = scanner.nextInt(); //leemos el número ingresado por el usuario

        String numeroRomano = ""; //inicializamos la variable que contendrá el número romano

        switch (numero) { //evaluamos el número ingresado por el usuario
            case 1:
                numeroRomano = "I";
                break;
            case 2:
                numeroRomano = "II";
                break;
            case 3:
                numeroRomano = "III";
                break;
            case 4:
                numeroRomano = "IV";
                break;
            case 5:
                numeroRomano = "V";
                break;
            case 6:
                numeroRomano = "VI";
                break;
            case 7:
                numeroRomano = "VII";
                break;
            case 8:
                numeroRomano = "VIII";
                break;
            case 9:
                numeroRomano = "IX";
                break;
            case 10:
                numeroRomano = "X";
                break;
            default:
                System.out.println("El número ingresado no está dentro del rango permitido."); //si el número ingresado no está dentro del rango permitido, mostramos un mensaje
               break;
        }
        
        System.out.println("El número [" + numero + "] en números romanos es: " + numeroRomano); //mostramos el resultado
     
    }
    
}

/*
*Este algoritmo utiliza una estructura switch para evaluar el número ingresado por el 
*usuario y asignarle su equivalente en números romanos a la variable 
*numeroRomano. Luego, se muestra el resultado al usuario en la última línea. Si el 
*número ingresado por el usuario no está dentro del rango permitido (1-10), se muestra 
*un mensaje de error.
*/