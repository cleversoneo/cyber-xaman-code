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
 * Cálculo de salário
 */
public class Exer08 {
    
    public static void main (String [] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println ("Quanto você ganha por hora: ");
        double valorHora = scan.nextDouble();
        
        System.out.println ("Numero de horas trabalhas no mes: ");
        double horasMes = scan.nextDouble();
        
        double salario = valorHora * horasMes;
        
        System.out.println ("SALARIO: " + salario);
        
        
        
        
        
        
    }
    
}
