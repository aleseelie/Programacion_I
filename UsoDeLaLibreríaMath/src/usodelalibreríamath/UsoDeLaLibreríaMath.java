/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package usodelalibreríamath;

import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class UsoDeLaLibreríaMath {

    /**
     * @param args the command line arguments
     * 
     * Desarrolle un programa que pida al usuario el radio de un círculo.
       Utilizando la constante Math.PI y la función Math.pow() de la librería matemática 
     * de Java, calcule el área y circunferencia de dicho círculo y muestre el resultado al usuario.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
    
       // Declaracion de variables
    
        double radio = 0;
        double area = 0;
        double circunferencia = 0;
    
        System.out.println("Ingrese el radio de su circulo: ");
        radio = input.nextDouble();
        
        area = Math.PI * Math.pow(radio,2);
        circunferencia = 2 * Math.PI * radio;
        
        System.out.printf("El area de su circulo es %.2f",area);
        System.out.printf("\nLa circunferencia de su circulo es %.2f",circunferencia);
        
        
    } // Fin de Main
    
   
} // Fin de Clase
