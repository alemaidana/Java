/*
      Given an integer, n , 
      print its first 10 multiples. 
      Each multiple  (where ) should be printed 
      on a new line in the form: N x i = result.
 */
package Java.exercises.begginer;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class DiezMultiplos {
    
    public static void main(String[] args) {
      
      System.out.println("Ingrese un numero");
      Scanner teclado = new Scanner(System.in);
      
      int n = teclado.nextInt();
      
        for (int i = 1; i <=10 ; i++) {
           int resultado = n * i;
            System.out.println( n + " x " + i + " = " + resultado); 
        }
        
    }
    
}
