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
public class RevertirArreglo {

    public static void main(String[] args) {
        
         //reverse !
        
        int [] valores = {10,15,95,100,85};
        
        int aux;
        
        int max = valores.length /2;
        
        for (int i = 0; i <= max; i++) {
            aux = valores[i];
            valores[i]= valores[valores.length - (i+1)];
        valores[valores.length - (i+1)] = aux;
              
        }
        
        
        for (int valor : valores) {
            System.out.println(valor);
        }
       
        
        
        
        
    }
    
}
