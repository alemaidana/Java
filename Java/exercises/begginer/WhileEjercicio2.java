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
public class WhileEjercicio2 {
    
    public static void main(String[] args) {
        
/*        
        ejercicio 2:
Implementar un código que imprima el 
mayor y el menor de una serie de cinco 
números que vamos introduciendo por 
teclado.
*/



Scanner teclado = new Scanner(System.in);

int a= 1;
int mayor = 0;
int menor = 0;
int num1 = 0;

while (a<=5){

    System.out.println("ingrese un numero");
    num1 = teclado.nextInt();
     
    if (num1>mayor) mayor=num1;
    if (num1<menor) menor=num1;

    

a++;


}

        System.out.println("mayor es " + mayor );
        System.out.println("el menor es: " + menor);



    }
    
}
