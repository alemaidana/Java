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
public class CondicionIf {

    public static void main(String[] args) {
    
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese una edad");
        int edad = teclado.nextInt();

        if (edad > 18) {
            System.out.println("Es mayor");

            if (edad > 20 && edad < 30) {
                System.out.println("Esta entre 20 y 30");
            } else {
                System.out.println("Esta entre 18 y es mayor a 30");
            }

        } else if (edad == 15) {
            System.out.println("Tiene 15");
        } else {
            System.out.println("Esta entre -inf y 18 sin ser 15");
        }

        
        
    }

    
}
