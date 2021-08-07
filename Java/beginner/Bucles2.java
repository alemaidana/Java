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
public class Bucles2 {
 
    public static void main(String[] args) {
        
        
     
     int aleatorio = (int)(Math.random()*100);
     
     Scanner teclado = new Scanner(System.in);
     
     int numero= 0;
     int intentos =0;
     
     while(numero != aleatorio){
         intentos++;
         System.out.println("Introduce un numero por favor");
         
         numero = teclado.nextInt();
     
     if(aleatorio < numero ){
         System.out.println("mas bajo");
     }else if(aleatorio > numero){
         System.out.println("mas alto");
     }
         
      }
     
     System.out.println("CORRECTO, usted lo logro en " + intentos + " intentos");
    
        
        
    }
    
}
