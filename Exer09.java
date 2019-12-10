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
public class Exer09 {
    
    public static void main (String [] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Informe temperatura em Farenheit: ");
        double farenheit = scan.nextDouble();
        //farenheit = f
        
        double celsius = (5 *(farenheit - 32) / 9);
        //(5* (f - 32) / 9);
        
        System.out.println("Temperatura convertida para celsius: " + celsius);
        
    }
    
}
