/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package donacióndesangre;

import java.util.Scanner;


/**
 *
 * @author Hogar
 * 
 * Objetivos
 * 
 */
public class DonacióndeSangre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    /**
     * Desarrollar un algoritmo que permita determinar si
     * el usuario puede donar sangre o no, basandose en su edad (18 - 65)
     * y peso (Mas de 110 lbs). 
     * Si se llega a cumplir los criterios antes expuestos, solo
     * se podra donar sangre si ha comido.
     * 
     * Otro elemento que se tiene que considerar para poder donar sangre
     * es tener el nivel de hierro/hemoglobina en la sangre en los 
     * niveles adecuados.
     * Para los hombres tiene que ser mas de 14 y las mujeres mas de 12
     * 
     */
    
    // Declaración de variables
    
    Scanner input = new Scanner(System.in);
    
    int edad = 0;
    int peso = 0;
    boolean desayuno = true;
    char respuesta = '0';
    int hierro = 0;
    String genero = "M o F";
    
        System.out.println("Cual es su edad?");
        edad = input.nextInt();
        
        System.out.println("\nCuál es su peso actual en libras?");
        peso = input.nextInt();
        
        if( edad >= 18 && edad <= 65 && peso >= 110){
         input.nextLine();
            System.out.println("Ya ha desayunado? Si o No");
            respuesta = input.nextLine().charAt(0);
            if(respuesta == 'S'|| respuesta == 's'){
                System.out.println("Si puede donar sangre");
                desayuno = true;
            }
            else{
                System.out.println("Es necesario que comas");
                desayuno = false;
            }
        
        }
        
        else{
            System.out.println("No puede donar sangre");    
        }
        
        System.out.println("Ingrese su nivel de hierro en sangre");
        hierro = input.nextInt();
        
        input.nextLine();
        
        System.out.println("Ingrese su  genero");
        genero = input.nextLine().toUpperCase();
        
        if((hierro >= 14 && genero.equals("MASCULINO")) || (hierro >= 12 && genero.equals("FEMENINO"))){
            System.out.println("Si puede donar sangre");
        }
        
        else{
            System.out.println("No, no puede donar");
        }
            
        
    } // Fin de Main
    
} // Fin de Clase
