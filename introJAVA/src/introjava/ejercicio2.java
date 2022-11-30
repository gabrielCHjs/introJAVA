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
public class ejercicio2 {

    /**2. Escribir un programa que pida 
     * tu nombre, lo guarde en una variable 
     * y lo muestre por pantalla.

     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("ingresa tu nombre");
        String nombre = leer.next();
        System.out.println("bienvenido " + nombre + " estas alcqanzando tus metas");
    }
    
}
