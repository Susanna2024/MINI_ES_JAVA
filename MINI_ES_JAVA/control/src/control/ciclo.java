/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;


import java.util.Scanner;

public class ciclo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ciclo for que imprime del 1 al 10
        System.out.println("Ciclo for - Da 1 a 10:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // Ciclo while que cuenta hacia atrás de 10 a 1
        System.out.println("\nCiclo while - Da 10 a 1:");
        int count = 10;
        while (count >= 1) {
            System.out.println(count);
            count--;
        }

        // Ciclo do-while para sumar hasta un número ingresado por el usuario
        System.out.println("\nCiclo do-while para sumar hasta un numero especifico:");
        System.out.print("Ingresa un numero: ");
        int n = scanner.nextInt();

        int suma = 0;
        int i = 1;
        do {
            suma += i;
            i++;
        } while (i <= n);

        System.out.println("La suma de todos los numeros de 1 a " + n + " es: " + suma);

        scanner.close();
    }
}


