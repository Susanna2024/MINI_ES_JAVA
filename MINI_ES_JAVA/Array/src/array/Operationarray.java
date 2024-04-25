
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Susanna
 */
    
package array;

import java.util.Arrays;

public class Operationarray {
    public static void main(String[] args) {
        // 1. Crear un array y sumar todos sus valores
        int[] numeros = {1, 2, 3, 4, 5}; 
        int suma = 0;

        // Sumar todos los valores del array
        for (int num : numeros) {
            suma += num;
        }
        System.out.println("La suma de todos los valores del array es: " + suma);

        // 2. Imprimir todos los valores del array al revés
        System.out.println("\nArray al reves:");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }

        // 3. Encontrar el mayor número en el array usando un bucle for-each
        int mayor = numeros[0];
        for (int num : numeros) {
            if (num > mayor) {
                mayor = num;
            }
        }
        System.out.println("\nEl mayor numero en el array es: " + mayor);

        // 4. Comparar dos arrays de enteros para ver si son idénticos
        int[] array1 = {1, 2, 3, 4, 6};
        int[] array2 = {1, 2, 3, 4, 5}; // Mismo contenido
        boolean sonIdenticos = Arrays.equals(array1, array2);
        System.out.println("\n¿Los arrays son identicos? " + (sonIdenticos ? "Sí" : "No"));

        // 5. Encontrar el número más pequeño y el más grande en el array
        int minimo = numeros[0];
        int maximo = numeros[0];
        for (int num : numeros) {
            if (num < minimo) {
                minimo = num;
            }
            if (num > maximo) {
                maximo = num;
            }
        }
        System.out.println("\nEl numero mas pequeno en el array es: " + minimo);
        System.out.println("El numero mas grande en el array es: " + maximo);
    }
}
