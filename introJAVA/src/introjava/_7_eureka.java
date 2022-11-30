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
public class _7_eureka {

    /**
     * 7. Crear un programa que pida una frase y si esa frase es igual a
     * “eureka” el programa pondrá un mensaje de Correcto, sino mostrará un
     * mensaje de Incorrecto. Nota: investigar la función equals() en Java.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("ingresa una frase");
        String fra= leer.next();
        if ("eureka".equals(fra)) { System.out.println("la palabra es correcta");
            
        }else{System.out.println("no es correcta");}
    }
    
}
