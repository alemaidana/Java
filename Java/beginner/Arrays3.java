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
public class Arrays3 {
    
    
    public static void main(String[] args) {
        String [] paises = new String [8];

paises [0]="España";
paises [1]="Mexico";
paises [2]="Colombia";
paises [3]="Peru";
paises [4]="Chile";
paises [5]="Argentina";
paises [6]="Ecuador";
paises [7]="Venezuela";


    for(int i = 0; i < paises.length; i++) {
       
        System.out.println("Pais " + (i+1) + " " + paises[i]);
    }

        
        
    }
}
