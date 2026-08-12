/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemadeaprobaciondemateria;

import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class SistemaDeAprobacionDeMateria {

    /**
     * @param args the command line arguments
     * 
     * Se tiene que escribir un programa que solicite al usuario el nombre del estudiante (tipo string)
     * y las calificaciones obtenidas en dos exámenes parciales (tipo double). El programa debe calcular el
     * promedio final. Si el promedio es mayor o igual a 65.0, debe mostrar un mensaje indicando que el
     * estudiante está "Aprobado". De lo contrario, debe mostrar "Reprobado".
     * Requisito estricto: Solo puedes usar una estructura if/else simple.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        
        // Declaracion de variables
        
        String nombre = "0";
        double calificacionUno = 0;
        double calificacionDos = 0;
        double promedio = 0;
        
        System.out.println("Por favor, ingrese su nombre: ");
        nombre = teclado.nextLine();
        System.out.printf("Hola %S como esta, ingrese su calificacion del primer parcial: ",nombre);
        calificacionUno = teclado.nextDouble();
        System.out.println("Muy bien, ahora ingrese su calificacion del segundo parcial: ");
        calificacionDos = teclado.nextDouble();
        
        promedio = (calificacionUno + calificacionDos)/2;
        
        if(promedio >= 65.0){
            System.out.printf("Tu promedio es %.2f. Estas aprobado/a!!!",promedio);
        } // Fin de if promedio
        
        else{
            System.out.printf("Tu promedio es %.2f. Estas reprobado/a :(",promedio);
        } // Fin else promedio
    } // Fin de main
    
} // Fin de clase
