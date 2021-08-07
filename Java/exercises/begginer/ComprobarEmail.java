/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java.exercises.begginer;
import javax.swing.*;
import java.util.*;
/**
 *
 * @author Usuario
 */
public class ComprobarEmail {
    
    
   public static void main(String[] args ){
       
     //Comprobar email!
    
    boolean punto =false; 
    int arroba =0;
    String email = JOptionPane.showInputDialog("Introduce tu email");
    String hella; 
    for(int i=0; i<email.length();i++){
        
    if(email.charAt(i)=='@'){    
     arroba++;   
    }
    
    if(email.charAt(i)=='.'){
        punto=true;
    }
              
}

if(arroba == 1 && punto==true ){
    System.out.println("El correo es correcto");
}else{
    System.out.println("El correo no es correcto");
}
   
   
 
 
 
 
}


}