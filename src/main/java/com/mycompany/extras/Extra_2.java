/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.extras;

/**
 *
 * Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
 */
public class Extra_2 {

   
    public static void main(String[] args) {
       int A=3,B=5,C=2,D=10, aux;
        System.out.println("A= "+A);
        System.out.println("B= "+B);
        System.out.println("C= "+C);
        System.out.println("D= "+D);
       
        aux=B;
        B=C;
        C=A;
        A=D;
        D=aux;
        System.out.println("-----");
        System.out.println("A= "+A);
        System.out.println("B= "+B);
        System.out.println("C= "+C);
        System.out.println("D= "+D);
    }
    
}
