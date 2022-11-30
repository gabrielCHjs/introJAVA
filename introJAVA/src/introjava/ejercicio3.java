/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner;

import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author Administrador
 */
public class ejercicio3 {

    /**
     * 3. Escribir un programa que pida una frase y la muestre toda en
     * mayúsculas y después toda en minúsculas. Nota: investigar la función
     * convierte todo en mayuscula toUpperCase() y minuscula= toLowerCase() en Java.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("ingresa una frase perro");
        String frase = leer.nextLine();
        System.out.println("la frase ingresada fue " + toUpperCase( frase));
    }
    
}
