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
public class CicloFor {
 
    public static void main(String[] args) {

        long pares = 0;
        long impares = 0;

        System.out.println("Ingrese N");
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();

        for (int i = 0; i < n; i++) {

            boolean esPar = i % 2 == 0;
            if (esPar) {
                pares = pares + i;
            } else {
                impares = impares + i;
            }

        }

        System.out.println("La suma de los pares es " + pares);
        System.out.println("La suma de los pares es " + impares);

        
    }
    
}
