/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java.exercises.begginer;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ArreglosVenta {
    
    public static void main(String[] args) {
        
         Scanner sc = new Scanner (System.in);
    System.out.println("ingrese cantidad de ventas al mes");    
    int cantidadVentas = sc.nextInt();
    int cont = 0;        
    int ventas[]= new int [cantidadVentas]; 
   
    
        for (int i = 0; i < ventas.length; i++) {
            System.out.println("Ingrese la " + (i+1) + " venta");    
            ventas[i] = sc.nextInt(); 
            
        }
     
               
        for (int i = 0; i < ventas.length; i++) {
        
            if(ventas[i] > 2000){
            System.out.println("LAS VENTAS MAYORES SON: " + ventas[i]);
            cont++;
            }
               
        
        }
  System.out.println("y fueron: " + cont); 
        
        
    }
    
    
}
