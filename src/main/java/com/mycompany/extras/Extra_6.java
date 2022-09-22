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
public class Extra_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("INGRESE LA CANTIDAD DE PERSONAS DE LAS CUALES QUIERE SABER LA EDAD");
        double pers=leer.nextDouble();
        double cont=0,cont1=0;
        for (int i=0;i<pers;i++){
            System.out.println("INGRESE LA ALTURA DE LA PERSONA "+(i+1));
            double alt=leer.nextDouble();
            cont1=cont1+alt;
            if (alt<1.6){
                cont++;
            
            }        
        }   
        System.out.println("EL PROMEDIO DE ALTURAS POR DEBAJO DE 1.6 MTS ES DE: "+(pers/cont));
        System.out.println("EL PROMEDIO GENERAL DE ALTURAS ES DE : "+(cont1/pers));
    }
    
}
