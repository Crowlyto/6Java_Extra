package com.mycompany.extras;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
de n números (n>0). El valor de n se solicitará al principio del programa y los números
serán introducidos por el usuario. Realice dos versiones del programa, una usando el
bucle “while” y otra con el bucle “do - while”.
 */
public class Extra_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
        System.out.println("INGRESE LA CANTIDAD DE NUMEROS A CALCULAR");
        double num=leer.nextDouble();
        int num1, max=0, min=0,cont=0, cont1;cont1=0;
        double prom=0;
        while (cont1<num){
            System.out.println("Ingrese un Número");
            num1=leer.nextInt();
            cont++;
            cont1++;
            prom=prom+num1;
            if (min==0){
                min=num1;
            }else if (num1<min){
                min=num1;
            }
            if (num1>max){
                max=num1;
            }
        }
        System.out.println("El minimo ingresado es: "+min);
        System.out.println("El maximo ingresado es: "+max);
        System.out.println("El promedio de los numero ingresados es: "+(prom/num));
    }
    
}
