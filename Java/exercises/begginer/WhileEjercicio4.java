/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java.exercises.begginer;
import java.util.*;
/**
 *
 * @author Usuario
 */
public class WhileEjercicio4 {
    
    public static void main (String[] args ){
/*  
ejercicio4 

Una persona desea invertir $1000 en un banco, 
el cual le otorga un 2% de interés mensual. 
¿Cuál será la cantidad de dinero que esta 
persona tendrá al cabo de un año? En el primer 
mes tendrá acumulado 1000 $ más 20 $ de 
interés ( 2% de 1000 ). En el segundo mes se le 
sumará un 2% a la base de 1020 $ del mes 
anterior y así sucesivamente. 
*/




int i=1;
double inversion=1000;
double interes= (2 * inversion)/100 ;
double total;
double total2;

while(i<=12){

total = inversion + (interes * i);


System.out.println("la inversion es : " + inversion + " en el mes: " + i + " con interes aumenta a: " + total );



i++;
}


int a=0;
System.out.println(++a);










    }   
    
}

