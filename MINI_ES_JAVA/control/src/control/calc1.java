/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.util.Scanner;

public class calc1 {
        public static void main (String []args){
Scanner scanner= new Scanner(System.in);
        System.out.print("insert number");
        int num1=scanner.nextInt();
        
         System.out.print("insert number");
        int num2=scanner.nextInt();
        
        
        System.out.print("insert + or -");
        String operazione= scanner.next();
        
int risultato=0;
boolean operazioneValida = true;

        switch (operazione) {
            case "+":
                risultato = num1 + num2;
                break;
            case "-":
                risultato = num1 - num2;
                break;
            
            default:
                System.out.println("Insert number");
                operazioneValida = false;
                break;
        }

        if (operazioneValida) {
            System.out.println("The results of  " + num1 + " " + operazione + " " + num2 + " is: " + risultato);
        }

        scanner.close();
    }
}

        
       



