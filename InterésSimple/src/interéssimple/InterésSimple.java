/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interéssimple;

import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class InterésSimple {

    /**
     * @param args the command line arguments
     * 
     * Escriba un programa que calcule el interés simple de un préstamo. 
     * El sistema debe solicitar el capital inicial, la tasa de interés anual
     * (en formato de número entero) y el tiempo
        en años. Aplique la fórmula (Capital * Tasa * Tiempo) / 100 y muestre el interés generado.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        
        // Declaración de variables
        
        double capital = 0;
        int tasaAnual = 0;
        int tiempoAños = 0;
        double interes = 0;
        
        
        System.out.println("Ingresa tu capital inicial: ");
        capital = teclado.nextDouble();
        
        System.out.println("Ingresa la tasa de interes anual en formato entero: ");
        tasaAnual = teclado.nextInt();
        
        System.out.println("Ingresa el tiempo que tienes en años: ");
        tiempoAños = teclado.nextInt();
        
        interes = (capital * tasaAnual * tiempoAños)/100;
        System.out.printf("Su interes simple para el prestamo es %.2f",interes);
    } // Fin de main
    
} // Fin de clase
