/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estadodelaclase;

import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class EstadodelaClase {

    /**
     * @param args the command line arguments
     */
    // Objetivos
    /* 1.- Conocer las estructuras de selección
           a. Toma de Decisión Simple
           b. Toma de Decisión Doble
           c. Decisiones numericas y caracteres/cadenas
    */
    
    /*
    Se necesita desarrollar un algoritmo que determine si un bote
    de agua de 500mL:
          a. Está arriba de la mitad. (Dato númerico)
          b. Contiene agua o no. (Dato de caracter)
          c. Es amigable con el ambiente. (Dato de cadena)
    */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        // Conociendo la estructura 
        /*
        1.- Palabra clave "if" y/o "else"
        2.- El grupo de instrucciones se encierra entre {}
        3.- No se usa ";" para los bloques
        4.- La condición es una comparación bajo cualquiera de los siguientes elementos:
            a. < menor
            b. > mayor
            c. <= menor o igual
            d. >= mayor o igual 
            e. == igual (uso de 2 signos iguales)
            i. != distinto (signos pegados)
        */
        int cantidadAgua = 0;
        char respuesta = '@';
        String respuestaAmbiente = "John Doe";
        
        System.out.println("El bote es de 500 mL");
        System.out.print("Cuanto liquido dices que contiene?");
        cantidadAgua = input.nextInt();
        
        if(cantidadAgua >= 250){
            // Condición es verdadero
            System.out.println("Si, tiene mas de la mitad");
            System.out.println("Te lo puedes beber!!!");
            System.out.println("No nos quedamos sin nada... hay suficiente");
        }
        
        input.nextLine(); // Limpieza de Buffer
        System.out.println("");
        System.out.println("El liquido que contiene es H2O? (a=Si, b=no)");
        respuesta = input.nextLine().charAt(0);
        
        if(respuesta == 'a'){
            // Condicion verdadera
            System.out.println("""
                               Si es agua lo que contienen
                               No es otra cosa... nada embriagante!!
                               """);
        }
        else{
            // Condicion falsa
            System.out.println("""
                               Uy uy UY
                               Qué sera?...
                               """);
        }
        
        
        System.out.printf("\nEse bote que contiene %d mL",cantidadAgua);
        System.out.println("\nEs amigable con el ambiente?");
        respuestaAmbiente = input.nextLine();
        /*
        System.out.printf("Dato de Variable: %s",respuestaAmbiente);
        
        System.out.println("Seguro?");
        respuestaAmbiente = input.nextLine().toUpperCase();
        System.out.printf("Dato de Variable: %s",respuestaAmbiente);
        
        System.out.println("100% seguro?");
        respuestaAmbiente = input.next().toLowerCase();
        System.out.printf("Dato de Variable: %s",respuestaAmbiente);
        */
        if(respuestaAmbiente.equals("Si")){
            System.out.println("Es amigable");
        }
        
        else{
            System.out.println("No es nada amigable");
        }
    } // Fin de Main
    
} // Fin de clase
