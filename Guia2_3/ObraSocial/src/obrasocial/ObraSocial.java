/*
 * 5-Una obra social tiene tres clases de socios:
○*Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en todos los tipos de tratamientos.
○*Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para los mismos tratamientos que los socios del tipo A.
○*Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos tratamientos.
○*Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real que represente el costo del tratamiento (previo al descuento) y determine el importe en efectivo a pagar por dicho socio.

 */

package obrasocial; // Declaración del paquete obrasocial

import java.util.Scanner; // Importación de la clase Scanner

public class ObraSocial{ // Declaración de la clase ObraSocial

    public static void main(String[] args) { // Declaración del método principal

        Scanner sc = new Scanner(System.in); // Creación del objeto Scanner

        // Solicitar al usuario la clase del socio
        System.out.print("Ingrese la clase del socio (A, B o C): ");
        char claseSocio = sc.next().charAt(0); // Lectura del carácter ingresado por el usuario

        // Solicitar al usuario el costo del tratamiento
        System.out.print("Ingrese el costo del tratamiento: ");
        double costoTratamiento = sc.nextDouble(); // Lectura del número decimal ingresado por el usuario

        // Calcular el importe a pagar por el socio
        double importeAPagar; // Declaración de la variable importeAPagar

        if (claseSocio == ('A') || (claseSocio == 'a')) { // Condicional if para la clase A. Comparamos con un condicional caracter 'a'
            importeAPagar = costoTratamiento * 0.5;
        } else if (claseSocio == ('B') || (claseSocio == 'b')) { // Condicional if para la clase B. Comparamos con un condicional caracter 'b'.
            importeAPagar = costoTratamiento * 0.65;
        } else { // Para cualquier otra clase
            importeAPagar = costoTratamiento;
        }

        // Mostrar el importe a pagar por el socio
        System.out.println("El importe a pagar es: " + importeAPagar); // Impresión del mensaje y del valor de la variable importeAPagar

        sc.close(); // Cierre del objeto Scanner
    }
} // Cierre de la clase ObraSocial
/*
Para reemplazar Condicional if por switch el código es:
switch (claseSocio) {
    case 'A':
        importeAPagar = costoTratamiento * 0.5;
        break;
    case 'B':
        importeAPagar = costoTratamiento * 0.65;
        break;
    default:
        importeAPagar = costoTratamiento;
        break;
}
*/