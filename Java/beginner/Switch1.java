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
public class Switch1 {
    
    public static void main(String[] args) {
        System.out.println("ingrese una opcion");
        System.out.println("1 alta");
        System.out.println("2 baja");
        System.out.println("3 modif");
        System.out.println("4 eliminar");

        Scanner teclado = new Scanner(System.in);
        Integer opcion = teclado.nextInt();

        switch (opcion) {

            case 1:
                System.out.println("Ingrese el valor");
                double valor = teclado.nextDouble();
                System.out.println("Precio ingresado es: " + valor);
                break;

            case 2:
            case 3:
                System.out.println("Ingrese el codigo a eliminar");
                Long codigo = teclado.nextLong();
                if (codigo > 0) {
                    System.out.println("Se ha eliminado el codigo " + codigo);
                } else {
                    System.out.println("Debe ingresar un codigo mayor a 0");
                }
                break;

            default:
                System.out.println("Opcion ingresada es baja");
                break;

        }

        System.out.println("Fin");

    }
    
    
}
