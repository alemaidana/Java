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
public class CicloWhile7 {
 
    public static void main(String[] args) {
        
        //Ejercicio 8
//Imprimir la multiplicación de los números 
//impares que se encuentran entre -10 y 10.



double i = -10;
double suma=1;

while(i<=10){

    if(i%2!=0){
    suma = suma * i;
       
   }
    i++;
    
}
    System.out.println(suma);
    

        
    }
    
    
    
}
