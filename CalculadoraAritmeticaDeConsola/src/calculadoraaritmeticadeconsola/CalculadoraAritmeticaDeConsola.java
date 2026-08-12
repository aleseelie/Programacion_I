/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadoraaritmeticadeconsola;

import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class CalculadoraAritmeticaDeConsola {

    /**
     * @param args the command line arguments
     * 
     * Crear un programa que actúe como una calculadora básica. Debe solicitar al usuario dos números
     * enteros y un carácter (char) que represente la operación a realizar:
     * Suma
     * Resta
     * División
     * Multiplicación
     * Módulo ‘%.
     * 
     * Dependiendo del carácter ingresado, el programa debe usar una estructura de selección para
     * realizar la operación aritmética correspondiente y mostrar el resultado en formato decimal
     * (cuidar las divisiones entre cero). Si el usuario ingresa un carácter no válido, se debe mostrar 
     * "Operador no reconocido".
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        // Declaracion de Variables
        
        int numUno = 0;
        int numDos = 0;
        char operacion = '@';
        double resultado = 0;
        boolean caracterValido = true;
        
        System.out.println("Ingrese su primer numero entero: ");
        numUno = input.nextInt();
        
        System.out.println("Ingrese su segundo numero entero: ");
        numDos = input.nextInt();
        
        input.nextLine();
        System.out.println("Ingrese el caracter de la operacion que desea realizar (+,-,*,/,%): ");
        operacion = input.nextLine().charAt(0);
        
        switch (operacion){
            case '+':
                resultado = numUno + numDos;
                break;
                
            case '-':
                resultado = numUno - numDos;
                break;
                
            case '*':
                resultado = numUno * numDos;
                
            case '/':
                if(numDos != 0){  // aqui usé ayuda para poder aplicar la restricción del 0
                    resultado = (double) numUno / numDos; // aqui igualmente para que el resultado sea decimal
                } else{
                    System.out.println("No se puede dividir entre cero");
                    caracterValido = false;
                }
                break;
                
            case '%':
                if(numDos != 0){
                    resultado = numUno % numDos;
                } else {
                    System.out.println("No es posible realizar la operacion");
                    caracterValido = false;
                }
                break;
                
            default:
                System.out.println("Operador no reconocido");
                caracterValido = false;
                break;
        }
        
        if(caracterValido){
            System.out.printf("El resultado es: %.2f",resultado);
        }
    } // Fin de Main
    
} // Fin de clase
