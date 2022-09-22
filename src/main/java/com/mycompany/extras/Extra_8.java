/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.extras;

import java.util.Scanner;

/**
 *
 * Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y
la cantidad de números impares. Al igual que en el ejercicio anterior los números
negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
 */
public class Extra_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int cont = 0, cont1 = 0, num = 0;
        do {
            System.out.println("Ingrese un valor");
            num = leer.nextInt();
            if (num % 5 == 0) {
                break;
            } else if (num % 2 == 0) {
                cont++;
            } else {
                cont1++;
            }
        } while (num % 5 != 0);
        System.out.println("Pares " + cont);
        System.out.println("Inpares " + cont1);
    }

}
