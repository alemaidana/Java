/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java.beginner;
import javax.swing.*;
/**
 *
 * @author Usuario
 */
public class Arrays5 {
    
    public static void main (String[] args ){


int [] matriz_aleatoria = new int [150];

        for (int i = 0; i < matriz_aleatoria.length; i++) {
            matriz_aleatoria[i]=(int)Math.round(Math.random()*100);
            
        }

        for (int num : matriz_aleatoria) {
            System.out.print(num + " ");
        }

  }
}
