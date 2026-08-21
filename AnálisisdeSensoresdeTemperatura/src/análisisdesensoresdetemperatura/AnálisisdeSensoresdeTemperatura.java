/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package análisisdesensoresdetemperatura;

import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class AnálisisdeSensoresdeTemperatura {

    /**
     * @param args the command line arguments
     * 
     * Desarrolla un programa que lea repetidamente las temperaturas (en grados centígrados)
     * registradas por un sensor industrial. El programa debe detenerse cuando el usuario 
     * ingrese el valor centinela −999.
     * 
     * Validación: La temperatura absoluta más baja posible es el cero absoluto (−273.15 °𝐶). Si 
     * el usuario ingresa un valor menor a este (que no sea el centinela), el programa debe
     * mostrar un error usando una estructura if-else y no tomarlo en cuenta para los cálculos.
     * Operación: Al finalizar, el programa debe imprimir el promedio de las temperaturas válidas
     * ingresadas y la diferencia térmica entre la temperatura más alta y la más baja leída.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        // Declaracion de variables
        
        double temp = 0;
        double tempMax = -273.15;
        double tempMin = Double.MAX_VALUE; // Entendí que una constante de Java, un número gigante.
        int contador = 0;
        double suma = 0;
        double promedio = 0;
        double difTerm = 0;
        
        System.out.println("Ingrese su temperatura en °C: ");
        temp = input.nextDouble();
        
        while(temp != -999){
            if(temp < -273.15){
                System.out.println("Valor incorrecto! Su temperatura no puede ser menor al cero absoluto");
            }else{
                suma += temp;
                contador++;
            
            if (temp > tempMax){
                tempMax = temp;
            } // Fin de if tempMax almacenador
            if (temp < tempMin){
                tempMin = temp;
            } // Fin de if tempMin almacenador
            } // Fin de if y else de temperatura invalida y valida
            
            System.out.println("Ingrese su temperatura en °C: ");
            System.out.println("\n Si desea salir ingrese -999");
            temp = input.nextDouble();
        }//Fin de while
        
        if(contador > 0){
            promedio = suma / contador;
            difTerm = tempMax - tempMin;
            System.out.println("Resultados:");
            System.out.printf("\nPromedio de las temperaturas validas ingresadas: %.2f",promedio);
            System.out.printf("\nLa diferencia termica entre la temperatura mas alta y baja es: %.2f",difTerm);
        } else{
            System.out.println("No se ingresaron temperaturas validas");
        } // Fin de if y else contador y resultados finales
    } // Fin de Main
    
} // Fin de clase
