/*
 *  En ésta clase se aprende a ver cómo es una estructura básica de una función en java.
 */

package ejemplovideos;

// @author Horacio

import java.util.Scanner;


public class EjemploVideos { //2º Este método [metodo main] está contenido en una clase.

    public static void main(String[] args) { //1º Metodo main, 1er método que se va a ejecutar cuando ejecutemos nuestra aplicación. 
// 10° llamar a las funciones desde nuestro método "main". Capturamos el valor generando variable de tipo entero "int" llamado "resultado"
 int resultado = suma(10, 10);  // 11° le asignamos el producto de la función.
        System.out.println(resultado);// 12° Mostramos el resultado por pantalla. 
        saludoPersonalizado("Chiquito"); //13° llamamos al otro m{etodo o función "saludo personalizado", e imprimimos por pantalla.  
        Scanner leer = new Scanner(System.in); //14° Si quisiéramos intruducir por teclado algo, creamos una variable de tipo Scanner y la importamos.
        String nombre = leer.next (); // 15° Creamos una variable de tipo String y mandamos a la función.
        saludoPersonalizado(nombre); //16° De esta manera se pasa el "nombre" a la función.
        saludoPersonalizado(leer.next()); //17° Otra forma de llamar a la funci{on es crear.
    }             //4º [int] lo alberga el valor. 5º suma(recibe dos variables de tipo entero)
public static int suma(int a, int b) {  
//3º [static] hace que no este instanciado mediante un objeto, sin no que se encuentra instanciado de forma estatica en la memoria. 
//6º lógica (creamos una variable de tipo entero "resultado" y guardamos la suma de a + b.
int resultado = a + b;
return resultado;// 7º para retornar "resultado".
}
// las funciones sirven para reutilizar códigos
public static void saludoPersonalizado(String nombre){ // 8º creamos un metodo y agregamod (String con la variable nombre)
    System.out.println("Hola " + nombre + " ¿cómo estas?.");// 9º llamamos al System out.println y concatenamos el saludo.
}
}

