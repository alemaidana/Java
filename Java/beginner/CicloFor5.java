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
public class CicloFor5 {
    
    public static void main(String[] args) {
        
        //Ejercicio 4
        //Imprimir la suma de los números impares del 1 al 10.


int totales = 0;
int impares = 0;

        for (int i = 1; i <= 10 ; i++) {
            if(i%2==1){
            impares=i + impares;
           
            }
        }

System.out.println("los impares son " + impares);

        
    }
    
}
