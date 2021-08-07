/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java.exercises.begginer;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class CalcularFactorial {
    
    //Calcular FActorial 
    public static void main(String[] args) {
        
    
 int resultado = 1;

 int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
 
 for(int i = numero; i > 0; i--){
     resultado = resultado * i;
 }
 
 System.out.println("El factorial de " + numero + " es: " + resultado);

    
    }

}