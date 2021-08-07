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
public class CicloWhile6 {
    
    public static void main(String[] args) {
        
        
        //ejercicio 5
//Imprimir los números del 1 al 30 sin 
//imprimir números entre el 10 y el 20 
//uno abajo del otro.
//Requisito: se necesita tener conocimientos del operador OR (||)


int i = 1;
int acumulador=0;

while(i<=30){
        
    if(i<11 || i>19){
        System.out.println(i);
    }    
    
    i++;
}


    }
    
}
