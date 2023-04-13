/*
 *Este programa crea una matriz con los datos proporcionados, luego itera sobre cada columna para contabilizar los números más comunes 
en un HashMap. Luego, ordena los números más comunes y finalmente imprime los 6 números más comunes.
 */

package programaaciertos;

// @author Horacio

 import java.util.*;

public class ProgramaAciertos {
    public static void main(String[] args) {
        // Crear matriz con los datos proporcionados
        int[][] datos = {{0, 830, 9}, {1, 887, 5}, {2, 913, 5}, {3, 813, 5}, {4, 848, 9}, {5, 840, 15}, {6, 891, 5}, {7, 806, 2}, {8, 854, 2}, {9, 964, 9}, {10, 912, 9}, {11, 823, 5}, {12, 804, 2}, {13, 799, 2}, {14, 789, 9}, {15, 928, 9}, {16, 881, 9}, {17, 807, 9}, {18, 804, 26}, {19, 1031, 26}, {20, 932, 19}, {21, 828, 9}, {22, 949, 9}, {23, 826, 5}, {24, 1002, 5}, {25, 806, 29}, {26, 805, 9}, {27, 796, 9}, {28, 938, 5}, {29, 868, 9}, {30, 841, 9}, {31, 918, 9}, {32, 804, 9}, {33, 799, 26}, {34, 910, 9}, {35, 909, 9}, {36, 954, 5}, {37, 1021, 29}, {38, 801, 29}, {39, 791, 19}, {40, 885, 29}, {41, 902, 9}, {42, 825, 9}, {43, 1140, 29}, {44, 896, 29}, {45, 827, 29}};

        // Crear HashMap para contabilizar los números más comunes
        HashMap<Integer, Integer> numeros = new HashMap<Integer, Integer>();
        for (int i = 0; i < datos.length; i++) {
            // Contabilizar cantidad de salidas
            int cantidadSalidas = datos[i][1];
            if (numeros.containsKey(cantidadSalidas)) {
                numeros.put(cantidadSalidas, numeros.get(cantidadSalidas) + 1);
            } else {
                numeros.put(cantidadSalidas, 1);
            }

            // Contabilizar día última salida
            int diaUltimaSalida = datos[i][2];
            if (numeros.containsKey(diaUltimaSalida)) {
                numeros.put(diaUltimaSalida, numeros.get(diaUltimaSalida) + 1);
            } else {
                numeros.put(diaUltimaSalida, 1);
            }
        }

        // Ordenar los números más comunes
        List<Integer> numerosOrdenados = new ArrayList<>(numeros.keySet());
        Collections.sort(numerosOrdenados, (a, b) -> numeros.get(b).compareTo(numeros.get(a)));

        // Imprimir los 6 números más comunes
        System.out.println("Los 6 números más comunes son:");
        for (int i = 0; i < 6; i++) {
            System.out.println(numerosOrdenados.get(i));
        }
    }
}