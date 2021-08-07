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
public class CicloWhile5 {
 
    public static void main(String[] args) {
        
        //ejercicio 4
/*imprimir los números del 1 al 10, sin 
imprimir números 2, 5 y 9, uno abajo 
del otro. Requisito: se necesita tener 
conocimiento del operador AND (&&) 
y del operador NOT (!=) 
*/


int i=1;

while(i<=10) {

    if(i!=9 && i!=5 && i!=2){
    
     System.out.println(i);  
    }
i++;       
    
}
    

        
    }
    
}
