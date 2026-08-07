/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cálculocondosvariables;

import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class CálculoConDosVariables {

    /**
     * @param args the command line arguments
     * Ejercicio 1
     * Escribir un programa que solicite al usuario la base y la altura de un rectángulo.
     * Utilice estas dos variables para calcular el área del rectángulo (BaseXAltura) y
     * el perímetro (suma de todos sus lados). Imprimir ambos resultados en pantalla.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        // Declaracion de variables
        
        double base = 0; // Elegí el double porque puede darse el caso de medidas en decimales :)
        double altura = 0;
        double area = 0;
        double perimetro = 0;
        
        System.out.println("Ingrese la base de su rectangulo: ");
        base = teclado.nextDouble();
        
        System.out.println("Ingrese la altura de su rectangulo: ");
        altura = teclado.nextDouble();
        
        area = base * altura;
        perimetro = 2 * base + 2 * altura;
        
        System.out.printf("El area de su rectangulo es %.2f",area);
        System.out.printf("\nEl perimetro de su rectangulo es %.2f",perimetro);
        
    } // Fin de Main
    
} // Fin de clase
