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
public class Exer05 {
    
    public static void main (String [] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com a quantidade de metros: ");
        double metros = scan.nextDouble();
        
        // 1m = 100cm
        double cm = metros * 100;
        
        System.out.println(metros + " m é igual a " + cm + " cm");
        
    }
    
}
