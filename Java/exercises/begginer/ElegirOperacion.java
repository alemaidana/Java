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
public class ElegirOperacion {
    
    int suma,resta,multi,divi;
    
    public void suma(int a, int b){
        suma = a+b;
        System.out.println("La suma es: " + suma);   
    }
    
    public void resta(int a, int b){
        resta = a-b;
        System.out.println("La resta es: " + resta);   
    }
    
    public void multiplicar(int a, int b){
        multi = a*b;
        System.out.println("La multiplicacion es: " + multi);   
    }
    
    public void divide(int a, int b){
        divi = a/b;
        System.out.println("La division es: " + divi);   
    }
    
    
    
    
}
