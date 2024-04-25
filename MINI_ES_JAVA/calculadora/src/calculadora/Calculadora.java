/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir dos números para las operaciones básicas
        System.out.println("Calculadora");
        System.out.print("Introduce el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Introduce el segundo número: ");
        double num2 = scanner.nextDouble();

        // Realizar las operaciones básicas
        double suma = num1 + num2;
        double resta = num1 - num2;
        double multiplicacion = num1 * num2;
        double division = num2 != 0 ? num1 / num2 : Double.NaN; // Control para evitar división por cero
        double modulo = num2 != 0 ? num1 % num2 : Double.NaN;
        double potencia = Math.pow(num1, num2);

        // Mostrar resultados
        System.out.println("Suma: " + num1 + " + " + num2 + " = " + suma);
        System.out.println("Resta: " + num1 + " - " + num2 + " = " + resta);
        System.out.println("Multiplicación: " + num1 + " * " + num2 + " = " + multiplicacion);
        System.out.println("División: " + num1 + " / " + num2 + " = " + (Double.isNaN(division) ? "indefinido" : division));
        System.out.println("Módulo: " + num1 + " % " + num2 + " = " + (Double.isNaN(modulo) ? "indefinido" : modulo));
        System.out.println("Potencia: " + num1 + " ^ " + num2 + " = " + potencia);

        // Calcular el promedio de cinco números
        double[] numeros = new double[5];
        System.out.println("\nCálculo del promedio de cinco números");
        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
        }

        // Calcular el promedio
        double sumaTotal = 0;
        for (double n : numeros) {
            sumaTotal += n;
        }
        double promedio = sumaTotal / 5;

        // Mostrar el promedio
        System.out.println("El promedio de los cinco números es: " + promedio);

        // Cerrar el escáner
        scanner.close();
    }
}

