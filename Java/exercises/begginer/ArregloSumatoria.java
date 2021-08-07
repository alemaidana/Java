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
public class ArregloSumatoria {
    
    public static void main(String[] args) {
        
        System.out.println(" sumatoria arrays \n");
        
        int [] nums = {1,2,3,4,5,6,7,8,9,10};
        int total = 0;
        
        for (int t = 0; t < nums.length; t++) {
            total += nums[t];
            
        }
        System.out.println("La sumatoria es: "+ total);
        
    }
    
}
