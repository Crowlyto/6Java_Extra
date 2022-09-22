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
public class Extra_5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String socio;
        do {
            System.out.println("Ingrese su tipo de socio A/B/C");
            System.out.println("------------------------------");
            socio = leer.next();
            socio = socio.toUpperCase();
            switch (socio) {
                case "A":
                    System.out.println("Ingrese el  valor del tratamiento");
                    double trata = leer.nextDouble();
                    double total = trata * 0.5;
                    System.out.println("Ha obtenido un 50% de Decuento");
                    System.out.println("Usted debe abonar $ " + total);
                    break;
                case "B":
                    System.out.println("Ingrese el  valor del tratamiento");
                    trata = leer.nextDouble();
                    total = trata * 0.65;
                    System.out.println("Ha obtenido un 35% de Decuento");
                    System.out.println("Usted debe abonar $ " + total);
                    break;
                case "C":
                    System.out.println("Ingrese el  valor del tratamiento");
                    trata = leer.nextDouble();
                    System.out.println("Usted no ha obtenido descuento");
                    break;
                default:
                    System.out.println("El tipo de socio no es valido");

            }
        } while (socio != "A" || socio != "B" || socio != "C");
    }

}
