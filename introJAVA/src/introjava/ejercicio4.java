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
public class ejercicio4 {

    /**
     * 4. Dada una cantidad de grados centígrados se debe mostrar su
     * equivalente
     * en grados Fahrenheit. La fórmula correspondiente es:
     * F = 32 + (9 * C /
     * 5).
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("ingresa una temperatura en centigrados");
        int temp = leer.nextInt();
       
        int F = 32 + (9 * temp /5);
        System.out.println("la temp en grados Fahrenheit " + F );
        
    }
    
}
