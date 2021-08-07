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
public class ArreglosMaxMin2 {
    
    public static void main(String[] args) {
        
        //tenemos que leer 6 numeros entre 100
        //cual es el minimo
        //el maximo
        //promedio
        //posicion del minimo
        //posicion del maximo
        //vector de numeros 
        int[] numeros;
        numeros = new int[100];

        int[] otroVector = new int[6];
        int contador = 0;
        int minimo = 0;
        int maximo = 0;
        float promedio;
        int pMinimo = 0;
        int pMaximo = 0;
        int i;
        int minimos = 0;
        int maximos = 0;

        while (contador < 6) {

            for (i = 0; i < 6; i++) {
                otroVector[i] = numeros[i];

                if (i == 0) {
                    minimo = i;
                    pMinimo = i;
                    minimos += minimo;

                    maximo = i;
                    pMaximo = i;
                    maximos += maximo;

                } else {
                    if (numeros[i] > maximo) {
                        maximo = numeros[i];
                        pMaximo = i;
                        maximos += maximo;
                    }
                    if (numeros[i] < minimo) {
                        minimo = numeros[i];
                        pMinimo = i;
                        minimos += minimo;
                    }

                }

                contador++;

            }

        }

        promedio = (maximos + minimos) / contador;

        System.out.println("minimo: " + minimo);
        System.out.println("p minimo: " + pMinimo);
        System.out.println("maximo: " + maximo);
        System.out.println("minimo: " + pMaximo);
        System.out.println("promedio: " + promedio);


      
      
            
      
            
            
      
        }
}
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
        
        
        
    
    

