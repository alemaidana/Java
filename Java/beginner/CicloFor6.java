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
public class CicloFor6 {
    
    public static void main(String[] args) {
        
/*            
Ejercicio 5

Mostrar la resta de la multiplicación de los números 
del 1 al 5 con la suma de los números del 1 al 5. Por 
ejemplo, sería (1*2*3*4*5) - (1+2+3+4+5)
*/

int mul = 1;
int suma= 0;


        for (int i = 1; i <= 5; i++) {
            mul = mul * i;
 
 
        }
                  for (int j = 1; j <= 5; j++) {
                suma = suma + j;
                    

    }
      
        System.out.println("la multiplicacion es: " + mul);
        System.out.println("la suma es: " + suma);
        System.out.println("el resultado es: " + (mul - suma) );


        
    }
    
    
}
