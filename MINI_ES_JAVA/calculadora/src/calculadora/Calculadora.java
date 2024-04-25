/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir dos n�meros para las operaciones b�sicas
        System.out.println("Calculadora");
        System.out.print("Introduce el primer n�mero: ");
        double num1 = scanner.nextDouble();

        System.out.print("Introduce el segundo n�mero: ");
        double num2 = scanner.nextDouble();

        // Realizar las operaciones b�sicas
        double suma = num1 + num2;
        double resta = num1 - num2;
        double multiplicacion = num1 * num2;
        double division = num2 != 0 ? num1 / num2 : Double.NaN; // Control para evitar divisi�n por cero
        double modulo = num2 != 0 ? num1 % num2 : Double.NaN;
        double potencia = Math.pow(num1, num2);

        // Mostrar resultados
        System.out.println("Suma: " + num1 + " + " + num2 + " = " + suma);
        System.out.println("Resta: " + num1 + " - " + num2 + " = " + resta);
        System.out.println("Multiplicaci�n: " + num1 + " * " + num2 + " = " + multiplicacion);
        System.out.println("Divisi�n: " + num1 + " / " + num2 + " = " + (Double.isNaN(division) ? "indefinido" : division));
        System.out.println("M�dulo: " + num1 + " % " + num2 + " = " + (Double.isNaN(modulo) ? "indefinido" : modulo));
        System.out.println("Potencia: " + num1 + " ^ " + num2 + " = " + potencia);

        // Calcular el promedio de cinco n�meros
        double[] numeros = new double[5];
        System.out.println("\nC�lculo del promedio de cinco n�meros");
        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce el n�mero " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
        }

        // Calcular el promedio
        double sumaTotal = 0;
        for (double n : numeros) {
            sumaTotal += n;
        }
        double promedio = sumaTotal / 5;

        // Mostrar el promedio
        System.out.println("El promedio de los cinco n�meros es: " + promedio);

        // Cerrar el esc�ner
        scanner.close();
    }
}

