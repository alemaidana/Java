/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java.exercises.begginer;

import javax.swing.*;

/**
 *
 * @author Usuario
 */
public class MostrarLaRaiz {
    
     public static void main(String[] args) {

    //entrada ejemplo 2      
         
    String num1 = JOptionPane.showInputDialog("Introduce tu numero");
    
    double num2 = Double.parseDouble(num1);
    
    System.out.print("la raiz de " + num2 + " es ");
    
    System.out.printf("%1.2f",Math.sqrt(num2));
    
    
    
    
     }
     
}
