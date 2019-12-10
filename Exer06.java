/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CyberXamanCode;

import java.util.Scanner;

/**
 *
 * @author Cleversoneo
 */
public class Exer06 {
    
    public static void main (String [] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com o raio do circulo: ");
        double raio = scan.nextDouble();
        
        double area = Math.PI * Math.pow(raio, 2);
        
        System.out.println("A área do circulo é: " + area);
        
    }
    
}
