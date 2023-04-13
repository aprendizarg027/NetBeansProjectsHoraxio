/*
 Aquí te presento un programa en Java que permite al usuario elegir 6 números entre el 00 y el 45 para participar en un sorteo 
dividido en cuatro modalidades: "Tradicional", "La segunda", "Revancha" y "Siempre Sale". 
El programa también muestra los datos estadísticos proporcionados en los tres grupos mencionados en la descripción.
 */

package sorteo;

// @author Horacio

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Sorteo {

    // Datos estadísticos en tres grupos
    private static Map<Integer, Integer> numerosSalidas = new HashMap<>();
    private static Map<Integer, String> diaUltimaSalida = new HashMap<>();

    // Lista para almacenar los números seleccionados por el usuario
    private static List<Integer> numerosSeleccionados = new ArrayList<>();

    // Formato de fecha para parsear las fechas de las salidas
    private static DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public static void main(String[] args) {
        // Llenar datos estadísticos
        llenarDatosEstadisticos();

        // Mostrar menú y obtener modalidad del sorteo
        String modalidad = mostrarMenu();

        // Obtener números seleccionados por el usuario
        obtenerNumerosSeleccionados();

        // Realizar el sorteo en la modalidad seleccionada
        switch (modalidad) {
            case "1":
                sorteoTradicional();
                break;
            case "2":
                sorteoLaSegunda();
                break;
            case "3":
                sorteoRevancha();
                break;
            case "4":
                sorteoSiempreSale();
                break;
            default:
                System.out.println("Opción inválida. Saliendo del programa...");
                break;
        }
    }

    // Llenar datos estadísticos
    private static void llenarDatosEstadisticos() {
        numerosSalidas.put(0, 830);
        diaUltimaSalida.put(0, "09/04/2023");
        numerosSalidas.put(1, 887);
        diaUltimaSalida.put(1, "05/04/2023");
        // ... Llenar el resto de datos estadísticos aquí
    }

    // Mostrar menú y obtener modalidad del sorteo
    private static String mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al Sorteo");
        System.out.println("-----------------------");
        System.out.println("Modalidades disponibles:");
        System.out.println("1. Tradicional");
        System.out.println("2. La Segunda");
        System.out.println("3. Revancha");
        System.out.println("4. Siempre Sale");
        System.out.println("-----------------------");
        System.out.print("Ingrese el número de la modalidad deseada (1/2/3/4): ");
        String modalidad = scanner.nextLine();
        return modalidad;
    }

    // Obtener números seleccionados por el usuario
    private static void obtenerNumerosSeleccionados() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese 6 números entre 00 y 45:");
        int contador = 0;
        while (contador < 6) {
            System.out.print("Número " + (contador + 1) + ": ");
            int numero = scanner.nextInt();
            if (numero < 0 || numero > 45) {
                System.out.println("Número inválido. Ingrese un número entre 00 y 45.");
                continue;
            }
            if (numerosSeleccionados.contains(numero)) {
                System.out.println("El número ya ha sido seleccionado. Ingrese otro número.");
                continue;
            }
            numerosSeleccionados.add(numero);
            contador++;
        }
    }

  // Realizar sorteo en la modalidad Tradicional
    private static void sorteoTradicional() {
        System.out.println("\nRealizando sorteo en modalidad Tradicional...");
        System.out.println("Números seleccionados por el usuario: " + numerosSeleccionados);

        // Generar números aleatorios
        List<Integer> numerosSorteo = generarNumerosSorteo();

        // Mostrar números sorteados
        System.out.println("Números sorteados: " + numerosSorteo);

        // Calcular cantidad de aciertos
        int aciertos = calcularAciertos(numerosSeleccionados, numerosSorteo);

        // Mostrar resultados
        System.out.println("Cantidad de aciertos: " + aciertos);
    }

    // Realizar sorteo en la modalidad La Segunda
    private static void sorteoLaSegunda() {
        System.out.println("\nRealizando sorteo en modalidad La Segunda...");
        System.out.println("Números seleccionados por el usuario: " + numerosSeleccionados);

        // Generar números aleatorios
        List<Integer> numerosSorteo = generarNumerosSorteo();

        // Mostrar números sorteados
        System.out.println("Números sorteados: " + numerosSorteo);

        // Calcular cantidad de aciertos
        int aciertos = calcularAciertos(numerosSeleccionados, numerosSorteo);

        // Mostrar resultados
        System.out.println("Cantidad de aciertos: " + aciertos);
    }

    // Realizar sorteo en la modalidad Revancha
    private static void sorteoRevancha() {
        System.out.println("\nRealizando sorteo en modalidad Revancha...");
        System.out.println("Números seleccionados por el usuario: " + numerosSeleccionados);

        // Generar números aleatorios
        List<Integer> numerosSorteo = generarNumerosSorteo();

        // Mostrar números sorteados
        System.out.println("Números sorteados: " + numerosSorteo);

        // Calcular cantidad de aciertos
        int aciertos = calcularAciertos(numerosSeleccionados, numerosSorteo);

        // Mostrar resultados
        System.out.println("Cantidad de aciertos: " + aciertos);
    }

    // Realizar sorteo en la modalidad Siempre Sale
    private static void sorteoSiempreSale() {
        System.out.println("\nRealizando sorteo en modalidad Siempre Sale...");
        System.out.println("Números seleccionados por el usuario: " + numerosSeleccionados);

        // Obtener número siempre sale
        int numeroSiempreSale = obtenerNumeroSiempreSale();

        // Mostrar número siempre sale
        System.out.println("Número siempre sale: " + numeroSiempreSale);

        // Calcular cantidad de aciertos
        int aciertos = calcularAciertos(numerosSeleccionados, Arrays.asList(numeroSiempreSale));

        // Mostrar resultados
        System.out.println("Cantidad de aciertos: " + aciertos);
    }

    // Generar números aleatorios para el sorteo
    private static List<Integer> generarNumerosSorteo() {
        List<Integer> numerosSorteo = new ArrayList<>();
        Random random = new Random();
        while (numerosSorteo.size() < 6) {
            int numero = random.nextInt(46);
            if (!numerosSorteo.contains(numero)) {
                numerosSorteo

    private static int calcularAciertos(List<Integer> numerosSeleccionados, List<Integer> numerosSorteo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static int obtenerNumeroSiempreSale() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
