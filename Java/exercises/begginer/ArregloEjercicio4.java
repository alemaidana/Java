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
public class ArregloEjercicio4 {
    
    public static void main(String[] args) {
        
          //Ejercicio 3
   
        /*Agregar los cambios que resulten 
necesarios al ejercicio anterior para 
que en los puntos b y c se informe la 
inflación junto con el nombre del mes. 
Por ejemplo: Mes FEBRERO = 0.1
        */
    
      
double [] inflacion = {0.8, 0.1, 0.3, 0.4, 0.3, 0.6, 0.5, 
0.3, 0.7, 0.3, 0.2, 0.9};
   
   String [] mese = {"Enero", "Febrero", "Marzo", "Abril","Mayo", "Junio",
   "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
   
   double inflacionAnual= 0;
   double inflacionMasBaja = inflacion[0];
   double inflacionMasAlta = inflacion[0];
   double promedioInflacion;
   int mes = 0;
   String mesmax = null;
   String mesmin = null;
   
//1-inflacion anual

        for (int i = 0; i < inflacion.length; i++) {
            inflacionAnual += inflacion[i];
            
        }
   
        System.out.println("La inflacion anual fue de: " + inflacionAnual + " %");
   
//2-inflacion mas baja   
   
        for (int i = 0; i < inflacion.length; i++) {
                        
            if (inflacion[i] < inflacionMasBaja){
            inflacionMasBaja = inflacion[i];
            mesmin = mese[i];
            }       
   
        }
   
      System.out.println("Inflacion mas baja en el mes: " + mesmin + " y fue de: " + inflacionMasBaja);
      
  //3- inflacion mas alta    
      
        for (int i = 0; i < inflacion.length; i++) {
            
            if(inflacion[i] > inflacionMasAlta ) {
            inflacionMasAlta = inflacion[i];
            mesmax = mese[i];
               
                      
            }
            
        }      
        
        
        
      System.out.println("Inflacion mas alta en el mes: " + mesmax + " y fue de: " + inflacionMasAlta);
   
     //4- promedio inflacionario 
     
        promedioInflacion = inflacionAnual / 12;
      
        System.out.println("El promedio de inflacion fue de: " + promedioInflacion);
 
        
    }
    
}
