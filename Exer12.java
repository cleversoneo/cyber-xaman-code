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
 * Cálculo de peso ideal.
 */
public class Exer12 {
    
    public static void main (String [] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Informe sua altura :");
        double altura = scan.nextDouble();
        
        double pesoIdeal = (72.7 * altura) - 58;
        
        System.out.println(" O peso ideal é :" + pesoIdeal);
        
    }
    
}
