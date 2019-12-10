/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CyberXamanCode;

import java.util.Scanner;

/**
 *
 * @author Cleverneo / Exercicios Java do canal do Youtube: https://www.youtube.com/user/Loianeg
 * 
 */
public class Exer11 {
    
    public static void main (String [] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Informe um numero inteiro: ");
        int number1 = scan.nextInt();
        System.out.println("Informe outro numero inteiro: ");
        int number2 = scan.nextInt();
        
        System.out.println("Informe um numero real: ");
        double number3 = scan.nextDouble();
        
        int resultado1 = (number1 * 2) * (number2 /2);
        double resultado2 = (number1 * 3) + (number3);
        double resultado3 = Math.pow(number3, 3);
        
        System.out.println("Resultado 1: " + resultado1);
        System.out.println("Resultado 2: " + resultado2);
        System.out.println("Resultado 3: " + resultado3);
        
        
    }
    
}
