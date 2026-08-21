/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversorunidadesfísicas;

import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class ConversorUnidadesFísicas {

    /**
     * @param args the command line arguments
     * 
     * Crea un menú interactivo que permita al usuario convertir medidas de longitud y peso. El menú 
     * debe mostrar las opciones: 1) Metros a Pies, 2) Kilogramos a Libras, 3) Centímetros a Pulgadas, y 4) Salir.
     * 
     * Validación: Se debe pedir la magnitud a convertir. Una longitud o un peso nunca pueden ser negativos. 
     * Si el usuario ingresa un valor menor a cero, debe mostrarse un mensaje de error y volver a pedir el dato.
     * 
     * Operación: Utiliza una estructura switch para procesar la opción elegida y realizar la operación aritmética correspondiente.
     * El menú debe repetirse usando do-while hasta que el usuario elija la opción 4.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        
        // Declaracion de variables
        
        double magnitud = 0;
        int opcion = 0;
        double resultado = 0;
        
        do{
            System.out.println("\nBienvenido al menu de conversiones, estas son las opciones: ");
            System.out.println("\n1) Metros a Pies");
            System.out.println("\n2) Kilogramos a Libras");
            System.out.println("\n3) Centimetros a Pulgadas");
            System.out.println("\n4) Salir");
            System.out.println("\nIngrese su opcion: ");
            opcion = sc.nextInt();
            
            if(opcion >=1 && opcion <=3){
                do{
                    System.out.println("Ingrese su magnitud a convertir: ");
                    magnitud = sc.nextDouble();
                    if(magnitud < 0){
                        System.out.println("Error!! La magnitud no puede ser negativa o cero");
                    }
                }while (magnitud < 0);
                
                switch (opcion){
                    case 1:
                        resultado = magnitud * 3.28084;
                        System.out.printf("%.2f metros equivalen a %.2f pies",magnitud,resultado);
                        break;
                        
                    case 2:
                        resultado = magnitud * 2.20462;
                        System.out.printf("%.2f kilogramos equivalen a %.2f libras",magnitud,resultado);
                        break;
                        
                    case 3:
                        resultado = magnitud * 0.393701;
                        System.out.printf("%.2f centimetros equivalen a %.2f pulgadas",magnitud,resultado);
                        break;
                } // Fin de switch opciones
            } else if (opcion != 4){
                System.out.println("Opcion no valida, intente nuevamente");
            }
        } while (opcion != 4); // Fin del do-while menú
    } // Fin de Main
    
} // Fin de clase
