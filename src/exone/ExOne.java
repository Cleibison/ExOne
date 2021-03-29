/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exone;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class ExOne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 1.	Faça um programa que receba o valor de um depósito e o valor da taxa de juros. 
        //Ccalcule e imprima o valor do rendimento e o valor total depois do rendimento.
        float deposito;
        double juros;
        double rendimento1;
        double rendtotal;
         Scanner leia = new Scanner(System.in);
         System.out.println("Digite o valor do deposito");
         deposito = Float.parseFloat(leia.nextLine());
        System.out.println("Digite o valor da taxa de juros");
         juros = Float.parseFloat(leia.nextLine());
        
        rendimento1=(juros*deposito);
        rendtotal = (rendimento1+deposito);
        
        System.out.println("Valor do deposito é R$ "+ deposito);
        System.out.println("Valor do rendimento é R$ "+ rendimento1);
        System.out.println("Valor total depois do rendimento é R$ "+  rendtotal);
    }
    
}
