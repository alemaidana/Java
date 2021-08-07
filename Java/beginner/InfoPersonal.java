/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java.beginner;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class InfoPersonal {
    
public static void main(String[] args) {
    

int edad;
float altura, peso;    
String sexo;
String genero;

Scanner keyboard = new Scanner(System.in);
System.out.println("Ingrese edad: ");
edad = keyboard.nextInt();
System.out.println("Ingrese altura: ");
altura = keyboard.nextFloat();
System.out.println("Ingrese peso: ");
peso = keyboard.nextFloat();
System.out.println("Ingrese sexo: ");
sexo = keyboard.next();
System.out.println("Ingrese genero: ");
genero = keyboard.next();

System.out.println( " " + edad + " , " + altura + " , " + peso + " , " + sexo + " , " + genero );

}     
    
}
