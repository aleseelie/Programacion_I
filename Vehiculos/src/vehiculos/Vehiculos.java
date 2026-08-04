/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vehiculos;

import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class Vehiculos {

    /**
     * Desarrollar un algoritmo que permita seleccionar una marca de vehiculo
     * que mejor se situe a nuestros gustos. Siendo entonces, cumplir
     * el gusto de escoger un modelo particular.
     * Mostrar en pantalla un mensaje alusivo.
     * @param args the command line arguments
     * 
     * Objetivos:
     * 1.- Selección Multiples
     *      a. Estructura
     *      b. Tipos de Condicion
     * 2.- Formateo de Cadenas (printf)
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        
        int seleccionMenu = 0;
        char seleccionSubMenu = '@';
        
        System.out.println("Catalogo de Vehiculos Importados");
        System.out.printf("%15s\n", "Eriz Shop!!");
        System.out.println("----------------");
        System.out.println("1. Toyota");
        System.out.println("2. Honda");
        System.out.println("3. Mitsubishi");
        System.out.println("4. Ferrari");
        System.out.println("5. Volkswagen");
        System.out.print("Respuesta: ");
        seleccionMenu = sc.nextInt();
        
        // if else -> Rango de valores
        // switch -> Al mismo nivel  - un solo valor puntual
        switch(seleccionMenu){
            case 1:
                System.out.println("Catalogo de Toyota");
                System.out.println("A. Yaris");
                System.out.println("B. 22R");
                System.out.println("C. Tacoma");
                System.out.print("Respuesta");
                sc.nextLine(); // Limpieza de buffer
                seleccionSubMenu = sc.nextLine().toUpperCase().charAt(0);
                switch(seleccionSubMenu){
                    case 'A':
                        break;
                    
                    case 'B':
                        break;
                        
                    case 'C':
                        break;
                        
                    default:
                        break;
                } // Fin de switch sub menu
                break;
                
            case 2:
                System.out.println("Catalogo de Honda");
                System.out.println("1. CRV");
                System.out.println("2. Civic");
                System.out.println("3. Accord");
                System.out.print("Respuesta:");
                sc.nextLine();
                seleccionSubMenu = sc.nextLine().charAt(0);
                switch(seleccionSubMenu){
                    case '1':
                        break;
                    
                    case '2':
                        break;
                        
                    case '3':
                        break;
                        
                    default:
                        break;
                } // Fin de switch sub menu
                break;
                
            case 3:
                System.out.println("Catalogo de Mitsubishi");
                System.out.println("A. L200");
                System.out.println("B. OutLander");
                System.out.println("C. Lancer");
                System.out.println("Respuesta:");
                sc.nextLine(); // Limpieza de buffer
                seleccionSubMenu = sc.nextLine().toUpperCase().charAt(0);
                if(seleccionSubMenu == 'A'){
                    System.out.printf("%s Carro de Trabajo%s\n","\u001B[31m","\u001B[0m");
                }else if(seleccionSubMenu == 'B'){
                    System.out.printf("%s Carro de Lujo%s\n","\u001B[32m","\u001B[0m");
                }else if(seleccionSubMenu == 'C'){
                    System.out.printf("%s Carro Deportivo%s\n","\u001B[34m","\u001B[0m");
                }else{
                    System.out.println("Esa opcion no tenemos");
                }
                break;
                
            case 4:
                System.out.println("Catalogo de Ferrari");
                break;
                
            case 5:
                System.out.println("Catalogo de Volkswagen");
                break;
                
            default:
                System.out.println("Lea compa... solo del 1 al 5");
                break;
        } // Fin del switch
    } // Fin de Main
    
} // Fin de class
