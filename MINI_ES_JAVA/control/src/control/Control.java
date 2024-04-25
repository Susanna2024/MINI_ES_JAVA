/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package control;

import java.util.Scanner;

public class Control {
    
    public static void main(String[] args) {
   Scanner scanner = new Scanner (System.in);   
   
   System.out.print("insert the first number:");
   int num1 = scanner.nextInt();
   
    System.out.print("insert the second number:");
   int num2 = scanner.nextInt();
    
    if (num1>num2){
        System.out.println(num1 + " bigger than "+num2);}
        else if (num1<num2){
            System.out.println(num1+" smaller than "+num2);}
        else {
        System.out.println(num1+" igual than "+num2);}
    }
    
    }
 
    

