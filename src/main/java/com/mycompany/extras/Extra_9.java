/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.extras;

import java.util.Scanner;

/**
 *
 * @author crowl
 */
public class Extra_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el Dividendo");
        int num=leer.nextInt();
        System.out.println("Ingrese el Divisor");
        int num1=leer.nextInt();
        int resta=0, coci,rest,cont=0;
        while (num>num1) {
            resta=num-num1;
            cont++;
            if (resta>num1){
                num=resta;
            }else
                break;
        }
        System.out.println("El Residuo es: "+resta);
        System.out.println("El Cociente es: "+cont);
        
    }
    
}
