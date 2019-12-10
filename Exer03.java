/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CyberXamanCode;

import java.util.Scanner;

/**
 *
 * @author Portaria
 */
public class Exer03 {
    public static void main (String [] args){
        
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Informe primeiro numero: ");
    int number1 = scan.nextInt();
    
    System.out.println("Informe segundo numero: ");
    int number2 = scan.nextInt();
    
    int sum = number1 + number2;
    
    System.out.println("A soma dos numeros: " + sum);

    
    }
}
