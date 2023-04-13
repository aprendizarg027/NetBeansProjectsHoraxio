/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lotteryprediction;

// @author Horacio

 import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class LotteryPrediction {

    public static void main(String[] args) {
        // Obtener los datos
        Map<Integer, Integer> numberFrequencies = new HashMap<>();
        Random random = new Random();
        for (int i = 0; i < 1000; i++) { // Generar 1000 números aleatorios para simular los datos
            int randomNumber = random.nextInt(45) + 0; // Generar un número aleatorio del 1 al 50
            if (numberFrequencies.containsKey(randomNumber)) {
                numberFrequencies.put(randomNumber, numberFrequencies.get(randomNumber) + 1); // Actualizar la frecuencia del número
            } else {
                numberFrequencies.put(randomNumber, 1); // Agregar el número con frecuencia 1 si es la primera aparición
            }
        }

        // Analizar los datos
        System.out.println("Frecuencia de aparición de los números:");
        for (Map.Entry<Integer, Integer> entry : numberFrequencies.entrySet()) {
            System.out.println("Número: " + entry.getKey() + ", Frecuencia: " + entry.getValue());
        }

        // Desarrollar un modelo de predicción (en este ejemplo, solo se muestra el número con mayor frecuencia)
        int mostFrequentNumber = 0;
        int maxFrequency = 0;
        for (Map.Entry<Integer, Integer> entry : numberFrequencies.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                mostFrequentNumber = entry.getKey();
                maxFrequency = entry.getValue();
            }
        }
        System.out.println("Número con mayor frecuencia: " + mostFrequentNumber);

        // Evaluar y refinar el modelo (no se implementa en este ejemplo)

        // Implementar y probar el algoritmo (no se implementa en este ejemplo)
    }
}
