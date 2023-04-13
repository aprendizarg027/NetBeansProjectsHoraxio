/*
 * 9-Simular la división usando solamente restas. 
Dados dos números enteros mayores que uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. 
Método: Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este resultado es el residuo,
y el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37     una resta realizada
37 – 13 = 24     dos restas realizadas
24 – 13 = 11     tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.
 */

package divisionrestassucesivas;

// @author Horacio

 import java.util.Scanner;

public class DivisionRestasSucesivas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el dividendo: ");
        int dividendo = sc.nextInt();
        System.out.print("Ingrese el divisor: ");
        int divisor = sc.nextInt();
        int cociente = 0;
        while (dividendo >= divisor) { // mientras el dividendo sea mayor o igual al divisor
            dividendo -= divisor; // restar el divisor del dividendo
            cociente++; // aumentar el contador de cociente
        }
        System.out.println("El cociente es: " + cociente);
        System.out.println("El residuo es: " + dividendo);
    }
}
/*
==========================================================================================
*El código anterior toma dos números enteros, el dividendo y el divisor, y usa un bucle while 
*para restar el divisor del dividendo hasta que el dividendo sea menor que el divisor. 
*El número de veces que se realiza la resta se almacena en una variable contador de cociente,
* y el resultado final es el cociente y el residuo.
*/
