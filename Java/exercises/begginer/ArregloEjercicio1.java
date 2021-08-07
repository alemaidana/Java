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
public class ArregloEjercicio1 {
    
    public static void main(String[] args) {
        
        /*
        1. Informar el vector de la forma: "Índice: X, Valor: Y"
        2. Totalizar el vector e informar el total
        3. Informar el contenido de las posiciones impares 
        (por ejemplo, las posiciones 1,3,5,etc)
        4. Informar el mayor número
        5. Informar cuántas veces aparece el número 20
        */
        
        
        
        
        int [] vector = {10,20,5,15,30,20};
        int total = 0;
        int veces20 = 0;
        int impar = 0;
        int mayor = vector[0];
       
        
        //primer parte
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Indice: "+ i + " Valor: " + vector[i]);
            
        }
        
        //segunda parte
        for (int i = 0; i < vector.length; i++) {
            total += vector[i];
            
        }
        
        System.out.println("\nEl total de la suma del vector es: " + total);
        
        //Tercera parte
        for (int i = 0; i < vector.length; i++) {
            if (vector[i]%2 == 1 ){
                impar = vector [i];
                 System.out.println("los impares son: " + i + " " + impar );
            }
        }        
         
       //cuarta parte
        for (int j = 0; j < vector.length ; j++) {
            
            
            if (vector[j] > mayor){
              mayor= vector[j];
            }
             
            
        }
       
               System.out.println("El mayor es: " + mayor);
         
        for (int i = 0; i < vector.length; i++) {
            
            if (vector[i] == 20 ){
              veces20++;        
            }
            
        }
        
         System.out.println("El numero 20 se repite " + veces20 + " veces");
        
 
   
        
    }
    
}
