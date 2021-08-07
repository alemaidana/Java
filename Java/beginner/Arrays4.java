/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java.beginner;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Arrays4 {
    
    public static void main(String[] args) {
        
        String [] paises = new String [8];


        for (int i = 0; i < paises.length; i++) {
             paises[i] = JOptionPane.showInputDialog("Introduce el pais " + (i+1));    
            
        }

        for (String elemento : paises) {
            System.out.println("Pais: " + elemento);
        }
        
        
    }
    
}
