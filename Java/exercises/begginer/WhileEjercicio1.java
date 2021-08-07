/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java.exercises.begginer;

/**
 *
 * @author Usuario
 */
public class WhileEjercicio1 {
    
    
    public static void main(String[] args) {
        
        //ejercicio1:

//Mostrar la suma de los números pares 
//mayores a 9 y menores a 20.


int a = 0;
int suma=0;

while (a < 30){

    if(a>9 && a<20){
        if(a%2==0){
        suma = suma + a;
            //System.out.println(suma);
    }
    }
    
    a++;
    //90
}

System.out.println(suma);

        
        
    }
}
