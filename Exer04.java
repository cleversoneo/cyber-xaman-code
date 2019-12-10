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
public class Exer04 {
    
    public static void main (String [] args){
        
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe a primeira nota: ");
        double note1 = scan.nextDouble();
        
        System.out.println("Informe a segunda nota: ");
        double note2 = scan.nextDouble();
        
        System.out.println("Informe a terceira nota: ");
        double note3 = scan.nextDouble();
        
        System.out.println("Informe a quarta nota: ");
        double note4 = scan.nextDouble();
        
        
        double media = note1 + note2 + note3+ note4 / 4;
        
        System.out.println("Media das notas: " + media);
                
                
    }
    
    
}
