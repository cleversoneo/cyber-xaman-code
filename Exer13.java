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
 */
public class Exer13 {
    
    public static void main (String [] args){
        
    Scanner scan = new Scanner(System.in);
    
    
    System.out.println ("Quanto você ganha por hora: ");
    double valorHora = scan.nextDouble();
        
    System.out.println ("Numero de horas trabalhas no mes: ");
    double horasMes = scan.nextDouble();
        
    double salarioBruto = valorHora * horasMes;
    
    double descontoINSS = (salarioBruto / 100) * 8;
    double descontoSindicato = (salarioBruto / 100) * 5;
    double descontoIR = (salarioBruto / 100) * 11;
    
    double totalDescontos = descontoINSS + descontoSindicato + descontoIR;
    
    double salarioLiquido = salarioBruto - totalDescontos;
    
    System.out.println ("O Salario bruto é: " + salarioBruto);
    System.out.println ("INSS: " + descontoINSS);
    System.out.println ("SINDICATO: " + descontoSindicato);
    System.out.println ("IR: " + descontoIR);
    System.out.println ("O total de descontos é: " + totalDescontos);
    System.out.println ("O SALÁRIO LIQUIDO É: " + salarioLiquido);
    
        }
    
}
