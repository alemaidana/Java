/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java.exercises.begginer;
import java.util.*;
/**
 *
 * @author Usuario
 */
public class CantidadPalabras {
    
    public static void main(String[] args) {
            
        Scanner teclado = new Scanner (System.in);
        
        System.out.print("Ingrese cuantas palabras quiere: ");
        
        int cantidad = teclado.nextInt();
        String dummy = teclado.nextLine();
                
        String [] palabras = new String [cantidad];
      
        System.out.println("usted quiere usar " + cantidad + " palabras.");
        
        for (int i = 0; i < palabras.length; i++) {
         
                  palabras[i] = teclado.nextLine();
                       
        }
        
         System.out.println("\n las palabras que escribiste son: ");
        
        for (String palabra : palabras) {
            System.out.println(palabra);
        }
        
        
       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
        
}        
        
 
   

