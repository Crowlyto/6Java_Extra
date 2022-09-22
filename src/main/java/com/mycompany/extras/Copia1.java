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
public class Copia1 {

    /**
     * Dado un tiempo en minutos, calcular su equivalente en días y horas. Por
     * ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su
     * equivalente: 1 día, 2 horas.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de minutos a convertir");
        int minutos =(int) leer.nextInt();
        
        int horas =(int) minutos / 60;
        int dias =(int) horas / 24;
        if (horas<24) {
            System.out.println("Son "+horas+" y "+minutos%60+" minutos");
        } else {
            System.out.println("Son "+dias+" dias "+horas%24+" horas y "+minutos%60+" minutos");
            
        }

    }

}
    

    