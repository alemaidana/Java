/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java.exercises.begginer;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class WhileAcumular {

    public static void main(String[] args) {

        //ingresar un valor y acumular mientras sean valores entre 10 y 30
        //el proceso termina cuando ingresan 0
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese un valor");
        int valor = teclado.nextInt();

        long acumulador = 0;

        while (valor != 0) {

            if (valor > 10 && valor < 30) {
                acumulador += valor;
            }

            System.out.println("Ingrese un valor");
            valor = teclado.nextInt();
        }

        System.out.println("los valores acumulados son: " + acumulador);

    }

}
