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
public class Extra_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("INGRESE UNA LETRA A COMPARAR");
        String vocal=leer.nextLine();
        vocal=vocal.toLowerCase();
        switch (vocal){
            case "a":
                break;
            case "e":
                break;
            case "i":
                break;
            case "o":
                break;
            case "u":
                break;
            default:
                System.out.println("La letra ingresada no es vocal");
                break;
                
                    
        } 
        
                
            
        
        
    }
    
}
