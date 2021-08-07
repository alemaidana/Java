/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java.beginner;

/**
 *
 * @author Usuario
 */
public class ArregloDosDimensiones2 {
 
    public static void main(String[] args) {
        
        //recorrer un array bidimensional con foreach---

   int [][] matrix = {
       {10,15,18,19,21},
       {5,25,37,41,15},
       {7,19,32,14,90},
       {85,2,7,40,27},
};

        for (int[] fila : matrix) {
            System.out.println();
            for (int i : fila) {
                System.out.print(i + " ");
            }
        }



        
        
    }
    
    
}
