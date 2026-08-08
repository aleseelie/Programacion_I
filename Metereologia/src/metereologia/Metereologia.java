/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metereologia;

import java.util.Scanner;

/**
 *
 * Objetivo
 * 1. Conocer los diferentes tipos de repetición
 * 2.- Analizar los componentes de todo ciclo de repetición
 * 3.- Construir un algoritmo con un ciclo de repetición
 */
public class Metereologia {

    /**
     * Desarrollar un algoritmo que me permita simular una estación
     * metereologica, que va registrando las temperaturas a lo largo de una semana:
     * 1. Registrar el día en general
     * 2. Registrar en dos jornadas (noche y dia)
     * 
     * Mostrando el promedio general y un mensaje de caliente o frio
     * para cada jornada.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int temperatura = 0;
        int dia = 1; // Variable de control
        int tempAcum = 0;
        double promedioTemp = 0;
        
        // Condición
        while(dia <= 7){
        // Instrucciones que se repiten
            System.out.print("Ingrese la Temperatura: ");
            temperatura = sc.nextInt();
            
            tempAcum += temperatura; // tempAcum = tempAcum + temperatura
            System.out.printf("Dia %d: \tTemperatura: %d\t TempAcumulado %d",
                    dia,
                    temperatura,
                    tempAcum);
             
            System.out.println("");
            // Modificacion 
            // Opción #1
            // dia +=1; // dia = dia + 1;
        
            // Opcion #2
            dia++; // Aumento de 1 en 1 -> POST Incremento
        } // Fin de while
        
        //promedioTemp = tempAcum / 7; // hardcoding
        dia--;
        System.out.printf("Dia final: %d",dia);
        promedioTemp = tempAcum / dia;
        
        System.out.printf("\nPromedio: %.2f",promedioTemp);
    } // Fin de Main
    
} // Fin de class
