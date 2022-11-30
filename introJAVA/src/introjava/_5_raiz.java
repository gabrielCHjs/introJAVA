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
public class _5_raiz {

    /**
     * 5. Escribir un programa que lea un número entero por teclado y muestre
     * por pantalla el doble, el triple y la raíz cuadrada de ese número. Nota:
     * investigar la función Math.sqrt().
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("ingresa un numero entero");
        int num = leer.nextInt();
        
        double resul = Math.sqrt(num);
        System.out.println("la raiz cuadrada es " + resul);
        
        double cuadrado = Math.pow(num, 2);
        System.out.println("elevado al cuadrado es " + cuadrado);
        
        double cubo = Math.pow(num, 3);
        System.out.println("elevado triple es " + cubo);
       
        
    }
    
}
