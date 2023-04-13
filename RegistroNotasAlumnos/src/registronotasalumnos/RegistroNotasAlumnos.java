/*
 4.-Los profesores del curso de programación de Egg necesitan llevar un registro de las notas adquiridas
por sus 10 alumnos para luego obtener una cantidad de aprobados y desaprobados. 
Durante el período de cursado cada alumno obtiene 4 notas, 2 por trabajos prácticos evaluativos y 2 por parciales. 
Las ponderaciones de cada nota son:

Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo.
Al final del programa los profesores necesitan obtener por pantalla la cantidad de aprobados y desaprobados, 
teniendo en cuenta que solo aprueban los alumnos con promedio mayor o igual al 7 de sus notas del curso.

 */

package registronotasalumnos;

// @author Horacio

 import java.util.Scanner; // Importar la clase Scanner para leer entrada del usuario

public class RegistroNotasAlumnos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Crear una instancia de la clase Scanner para leer entrada del usuario

        int cantidadAlumnos = 10; // Cantidad de alumnos
        double[][] notas = new double[cantidadAlumnos][4]; // Crear un arreglo bidimensional para almacenar las notas de los alumnos
        double[] promedios = new double[cantidadAlumnos]; // Crear un arreglo para almacenar los promedios de los alumnos
        int aprobados = 0; // Inicializar contador de aprobados en 0

        // Ciclo para ingresar las notas de los alumnos
        for (int i = 0; i < cantidadAlumnos; i++) {
            System.out.println("Ingrese las notas del alumno " + (i + 1) + ":");
            for (int j = 0; j < 4; j++) {
                System.out.print("Nota " + (j + 1) + ": ");
                notas[i][j] = sc.nextDouble(); // Leer la nota del usuario y guardarla en el arreglo de notas
            }
            promedios[i] = calcularPromedio(notas[i]); // Calcular el promedio de las notas del alumno y guardarlo en el arreglo de promedios
            if (promedios[i] >= 7) { // Verificar si el alumno aprobó
                aprobados++; // Incrementar el contador de aprobados
            }
        }

        int desaprobados = cantidadAlumnos - aprobados; // Calcular la cantidad de desaprobados

        // Mostrar resultados
        System.out.println("Cantidad de aprobados: " + aprobados);
        System.out.println("Cantidad de desaprobados: " + desaprobados);
    }

    // Método para calcular el promedio de un arreglo de notas
    public static double calcularPromedio(double[] notas) {
        double sum = 0;
        for (int i = 0; i < notas.length; i++) {
            sum += notas[i]; // Sumar todas las notas del arreglo
        }
        return sum / notas.length; // Calcular el promedio dividiendo la suma de las notas por la cantidad de notas
    }
}
/*
 Se utiliza un arreglo bidimensional notas para almacenar las notas de los 10 alumnos, 
donde cada fila representa las notas de un alumno y cada columna representa una nota específica 
(2 por trabajos prácticos evaluativos y 2 por parciales).
Luego, utiliza un arreglo promedios para almacenar los promedios de notas de cada alumno.

Ademas utiliza un ciclo for anidado para ingresar las notas de los alumnos a través de la entrada del usuario, 
calcular los promedios de notas y contar la cantidad de aprobados.
Luego, calcula la cantidad de desaprobados restando la cantidad de aprobados del total de alumnos.

Al final, muestra por pantalla la cantidad de aprobados y desaprobados obtenidos.
*/