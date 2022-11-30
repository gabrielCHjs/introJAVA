/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class _6_parinpar {

    /**6. Crear un programa que dado un numero determine si es par o impar.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("ingresa un numero para saber si es par o impar");
        int num= leer.nextInt();
        if (num%2 != 0) { System.out.println( num + " es impar");
            
        } else {System.out.println(num + " es par");
        }
    }
    
}
