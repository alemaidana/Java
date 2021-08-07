/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java.exercises.begginer;

/**
 *
 * @author Usuario
 */
public class RevertirArreglo2 {
 
    public static void main(String[] args) {
        
        System.out.println(" Arrays 101\n");
        
        System.out.println(" explorando el array\n ");
  
        int [] scores = {0,1,2,3,4,5,6,7,8,9};    
        int mayor;
        
        for (int i = 0; i < scores.length; i++) {
               System.out.print(scores[i] + " ");
           
            
        }
    
        System.out.println("arrays de reversa mami\n ");
            
        for (int r = scores.length-1; r >= 0; r--) {
         
            System.out.print(scores[r] + " ");
        }
        
    }
    
}
