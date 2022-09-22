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
public class Extra_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("--VAMOS A CONVERTIR LOS MINUTOS EN HORAS Y DIAS--");
        System.out.println("INGRESE LOS MINUTOS A CONVERTIR");
        double minutos=leer.nextDouble();
        double horas=(minutos/60);
        int dias=(int) (horas/24);
        
        if (horas<24){
            System.out.println("Son "+horas);
        }
        if (horas>=24){
            
            System.out.println("Son "+ dias+" dia/s y "+horas%24+" horas" );
        }    
        
    }
    
}
