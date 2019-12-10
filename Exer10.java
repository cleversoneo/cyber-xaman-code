/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CyberXamanCode;

import java.util.Scanner;

/**
 *
 * @author Cleverson
 */
public class Exer10 {
    
        
        public static void main (String [] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Informe temperatura em Celsius: ");
        double c = scan.nextDouble();
        //c = celsius
        
        double f = (c * 1.8) + 32;
     
        
        System.out.println("Temperatura convertida para farenheit: " + f);
        
    }
        
    }
    

