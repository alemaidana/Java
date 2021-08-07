/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java.beginner;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class CicloWhile {

    public static void main(String[] args) {
        
        long pares = 0;
        long impares = 0;

        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese un valor");
        int valor = teclado.nextInt();

        while (valor > 0) {

            if (valor % 2 == 0) {
                pares += valor;
            } else {
                impares += valor;
            }

            System.out.println("ingrese valor: ");
            valor = teclado.nextInt();

        }

        System.out.println("la suma de los pares es : " + pares);
        System.out.println("la suma de los pares es : " + impares);


        
        
        
        
    }

    
}
