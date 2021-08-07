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
public class ArregloAlAzar {
 
    public static void main(String[] args) {
        
        
        System.out.println("arrays al azar \n");
        
        int[] randoms = new int[10];    
         
        for (int p = 0; p < randoms.length; p++) {
            randoms[p] = (int) (Math.random()*10);
            System.out.print(randoms[p] + " ");
        }
        
        
    }
    
    
}
