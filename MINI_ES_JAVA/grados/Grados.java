/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package grados;


import java.util.Scanner;

public class Grados{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an options:");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");

        int choose = scanner.nextInt();

        if (choose == 1) {
            System.out.println("Insert temperature in Fahrenheit:");
            double fahrenheit = scanner.nextDouble();
            double celsius = (fahrenheit - 32) * 5 / 9;
            System.out.println("Temperature in Celsius is: " + celsius);
        } else if (choose == 2) {
            System.out.println("Insert temperature in Celsius:");
            double celsius = scanner.nextDouble();
            double fahrenheit = (celsius * 9 / 5) + 32;
            System.out.println("Temperature in Celsius Fahrenheit is: " + fahrenheit);
        } else {
            System.out.println("not avaible options.");
        }

        scanner.close();
    }
}

    

