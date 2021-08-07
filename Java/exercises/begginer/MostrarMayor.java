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
public class MostrarMayor {
    
    public static void main(String[] args) {
        
    //dado 3 numeros mostrar el mayor 
       
    int v1;
    int v2;
    int v3;
    
    System.out.println("Ingrese los valores");
    Scanner sc = new Scanner(System.in);
  
    v1= sc.nextInt();
    v2= sc.nextInt();
    v3= sc.nextInt();    
    
    if (v1 > v2 && v1 >v3){
        System.out.println(v1 + " es mayor");
    }else if (v2 > v1 && v2 >v3){
        System.out.println(v2 + " es mayor");
    }else if (v3 > v2 && v3 >v1){
        System.out.println(v3 + " es mayor");
    }else {
        System.out.println("son iguales");
    }
     
        
    }
    
}
