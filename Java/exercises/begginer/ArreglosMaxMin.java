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
public class ArreglosMaxMin {
    
    public static void main(String[] args) {
        
         System.out.println("maximo y minimo en array");
        
        int [] numeros = new int [20];
        int max = numeros[0];
        int min = numeros[0];
        
        for (int y = 0; y < numeros.length; y++) {
          
            numeros[y]= (int) (Math.random()* 100);
            
            if(numeros[y]> max){
                max=numeros[y];
            }
            if(numeros[y]<min){
                min=numeros[y];
            }
            
            
            System.out.print(numeros[y]+ " ");
            
        }
        
        System.out.println("\nEl mayor es: " + max);
        System.out.println("El minimo es: " + min);
        
        
        
    }
    
    
}
