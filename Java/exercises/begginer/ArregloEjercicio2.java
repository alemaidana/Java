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
public class ArregloEjercicio2 {

    public static void main(String[] args) {
        
                
 /*
   Dado el vector inflación {0.8, 0.1, 0.3, 0.4, 0.3, 0.6, 0.5, 
0.3, 0.7, 0.3, 0.2, 0.9}
Cada ítem del vector representa la inflación de un mes, 
de tal manera que el primer ítem del vector, que es 0.8, 
representa la inflación de Enero y el último ítem del 
vector, que es 0.9, representa la inflación de diciembre.
Se pide:
1. Informar la inflación anual
2. Informar la inflación más baja, junto con el número 
de mes. Por ejemplo: Mes 2 = 0.1
3. Informar la inflación más alta, junto con el número 
de mes. Por ejemplo: Mes 12 = 0.9
4. Informar el promedio de inflación (inflación total / 2)
   */
   
   double [] inflacion = {0.8, 0.1, 0.3, 0.4, 0.3, 0.6, 0.5, 
0.3, 0.7, 0.3, 0.2, 0.9};
   
   String [] Meses = {"Enero", "Febrero", "Marzo", "Abril","Mayo", "Junio",
   "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
   
   double inflacionAnual= 0;
   double inflacionMasBaja = inflacion[0];
   double inflacionMasAlta = inflacion[0];
   double promedioInflacion;
   int mes = 0;
   
   
//1-inflacion anual

        for (int i = 0; i < inflacion.length; i++) {
            inflacionAnual += inflacion[i];
            
        }
   
        System.out.println("La inflacion anual fue de: " + inflacionAnual + " %");
   
//2-inflacion mas baja   
   
        for (int i = 0; i < inflacion.length; i++) {
                        
            if (inflacion[i] < inflacionMasBaja){
            inflacionMasBaja = inflacion[i];
            mes = i+1;
            }       
   
        }
   
      System.out.println("Inflacion mas baja en el mes: " + mes + " y fue de: " + inflacionMasBaja);
      
  //3- inflacion mas alta    
      
        for (int i = 0; i < inflacion.length; i++) {
            
            if(inflacion[i] > inflacionMasAlta ) {
            inflacionMasAlta = inflacion[i];
            mes = i+1;         
            }
            
        }
      
      System.out.println("Inflacion mas alta en el mes: " + mes + " y fue de: " + inflacionMasAlta);
   
     //4- promedio inflacionario 
     
        promedioInflacion = inflacionAnual / 12;
      
        System.out.println("La el promedio de inflacion fue de: " + promedioInflacion);
      
      
        
        
    }

    
}
