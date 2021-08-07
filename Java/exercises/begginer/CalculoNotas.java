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
public class CalculoNotas {
 
     public static void main(String[] args ){
  

System.out.println("Ingrese cantidad de notas");

Scanner teclado = new Scanner(System.in);
int cantidadnotas = teclado.nextInt();

int mayor = 0;
int menor = 0;
float promedio;
int total=0;
for(int i=0; i<cantidadnotas; i++){
         
System.out.println("Ingrese la " + (i+1) + " nota");
         
    int nota = teclado.nextInt();     
    
    total = total + nota;
    
    if(i==0){
        menor=nota;
        mayor=nota;
    }
    
    
    if(nota > mayor){
    mayor = nota;
    }
    if(nota < menor){
    menor = nota;
    }        
    
}

promedio = (float) total / cantidadnotas;
System.out.println("Cantidad de notas: " + cantidadnotas);
System.out.println("Mayor: " + mayor);
System.out.println("Menor: " + menor);
System.out.println("Promedio: " + promedio);


}














     }

