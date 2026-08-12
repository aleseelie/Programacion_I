/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clasificaciondedescuentos;

import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class ClasificacionDeDescuentos {

    /**
     * @param args the command line arguments
     * 
     * Una tienda de software ofrece descuentos basados en la edad del cliente y si tiene una membresía
     * premium. Se tiene que solicitar la edad y si tiene membresía ('S' para sí, 'N' para no).
     * * Primero, se tiene que verificar si el cliente es mayor de edad (Arriba o igual a 18 años).
     *   Si es mayor de edad: Se verifica si tiene más de 65 años o si tiene membresía. Si cumple alguna 
     * de las condiciones, recibe un 20% de descuento. Si no, recibe un 10%.
     * Si es menor de edad: Verificar si tiene membresía 'S' y tiene más de 12 años. Si es así, recibe un
     * 15% de descuento. De lo contrario, no tiene descuento (0%).
     * El programa debe calcular y mostrar el descuento final aplicado y también el precio de venta 
     * original y el nuevo total que se tiene que pagar por el juego.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        
        // Declaracion de variables
        
        int edad = 0;
        boolean membresia = true;
        char respuestaMem = '@';
        double descuento = 0;
        double precioOriginal = 0;
        double montoDescuento = 0;
        double totalFinal = 0;
        
        
        System.out.println("Buenas tardes, querido usuario, necesitamos saber su edad: ");
        edad = sc.nextInt();
        
        System.out.println("Cual es el precio de su producto?: ");
        precioOriginal = sc.nextDouble();
        
        sc.nextLine();
        System.out.println("Necesitamos saber si posee una membresia premium: Si= S o No= N: ");
        respuestaMem = sc.nextLine().toUpperCase().charAt(0); 
        
        if(edad >= 18){
            // Mayor de edad
            if(edad >= 65 || respuestaMem == 'S'){
                descuento = 0.20;
                membresia = true;
            } else{
                descuento = 0.10;
                membresia = false;
            }
        } else {
            // Menor de edad
            if(edad >= 12 && respuestaMem == 'S'){
                descuento = 0.15;
                membresia = true;
            } else {
                descuento = 0;
                membresia = false;
            }
        }
       
        montoDescuento = precioOriginal * descuento;
        totalFinal = precioOriginal - montoDescuento;
        
        System.out.println("Su compra final seria: ");
        System.out.printf("\nPrecio original del producto %.2f",precioOriginal);
        System.out.printf("\nSu descuento es de: %.2f",montoDescuento);
        System.out.printf("\nSu total a pagar es: %.2f",totalFinal);
        System.out.println("\nGracias por su compra!!!");
    } // Fin de main
    
} // Fin de clase
