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
public class ArregloEjercicio3 {
    
    public static void main(String[] args) {
       /*
Ejercicio 4:
  
Uso de vector con ingreso de datos por 
teclado.
Ingrese por teclado la facturación de los 
últimos 6 meses. Solo se pueden ingresar 
números. Informar:
1. la facturación total 
2. el promedio de facturación
3. la máxima facturación
4. la máxima facturación
*/

Scanner teclado = new Scanner (System.in);

        System.out.println("Ingrese la facturacion de los ultimos seis meses");
        int [] facturacion = new int [6];
        int mes = 0;
        int total = 0;
        double promedio = 0;
        int max = 0;
        int minimo = facturacion[0];
        
        
        for (int i = 0; i < facturacion.length; i++) {
            facturacion[i]= teclado.nextInt();
            total = total + facturacion[i];      
            promedio =total / 6;
        }    
         
        for (int i = 1; i < facturacion.length; i++) {
           
        
        if (facturacion[i] > max) {
                max=facturacion[i];
            }
            
            if (facturacion[i] < minimo){
                minimo = facturacion[i];
                
            }
           
            
        }
         
        
        System.out.println("La facturacion total fue de " + total );
        System.out.println("El promedio de facturacion semestral fue: " + promedio);
        System.out.println("La minima facturacion fue: " + minimo);
        System.out.println("La maxima facturacion fue: " + max);



   
    }
    
    
}
