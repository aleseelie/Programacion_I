/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversiones;

import java.util.Scanner;

/**
 *
 * @author Hogar
 * 
 * Desarrollar un algoritmo que me permita convertir valores de longitud
 * de acuerdo a la base que se tenga.
 * Pulgadas - Centimetros
 * Kilometros - Millas
 * Grados Celsius a Grados Fareheit 
 */
public class Conversiones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        // Declara variables
        int pulgada = 0; //Asignando un valor por el signo =
        double resultadoCM = 0;
        double kilometros = 100;
        double millas = 0;
        double gcelsius;
        double gfareheit;
        
        System.out.println("Tenemos 5 pulgadas");
        System.out.println("Cuanto es eso en CM?");
        
        pulgada = 5;
        resultadoCM = pulgada * 2.54;
        
        System.out.printf("%d pulgadas es equivalente a %.2f cm",pulgada,resultadoCM);
        
        pulgada = 12;
        resultadoCM = pulgada * 2.54;
        System.out.printf("\n%.2f cm es equivalente a %d pulgadas",resultadoCM,pulgada);
        
        System.out.println("\nDime cuantos kilometros son?");
        kilometros = teclado.nextDouble();
        
        millas = kilometros / 1.6;
        System.out.printf("%.2f km es = a %.3f millas",kilometros,millas);
        
        System.out.println("\nDime cuantos grados son1?");
        gcelsius = teclado.nextDouble();
        
        gfareheit = (gcelsius * 1.8)+32;
        System.out.printf("%.2f celsius es = a %.3f fareheit",gcelsius,gfareheit);
    } // Fin de Main
    
} //Fin de Class
