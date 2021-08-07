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
public class WhileEjercicio3 {
    
    public static void main(String[] args) {
        
      /*  Ejercicio 3: 
Mostrar la conversión de 1 hasta 10 euros 
en pesos, euro tras euro, suponiendo que 
el tipo de cambio es 5.80 pesos por euro.
*/

double peso = 5.80;
int i=1;
double cambio = 0;

while(i<=10){

   cambio = i * peso;
    
    System.out.println("valor del euro: " + i + " valor del peso: " + cambio);

i++;
}

        
    }
    
}
