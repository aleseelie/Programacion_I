/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package generaciondetoken;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class GeneracionDeToken {

    /**
     * @param args the command line arguments
     * 
     * Objetivos
     * 1. Utilizar el ciclo de repetición DO - WHILE
     * 2. Uso de nuevas librerias
     *      a. Random
     * 3. Uso de otras funciones de string
     * 
     * 
     * Desarrollar un algoritmo que me permita registrar un dispositvo y generar
     * un token para su sesion de validación mientras se esta navegando con dicho
     * dispositivo
     * 
     * Contexto del problema:
     * Un sistema de gestión de red necesita registrar 
      nuevos enrutadores (routers) y asignarles una clave 
        de sesión única generada aleatoriamente. 
     * 
     * Sin embargo, el canal de comunicación tiene "ruido",
       por lo que la generación de la clave no siempre 
       es constante.
     *  
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
            Parte 1: Registro de Nombre de Equipo
            a. Longitud de 8 caracteres
            b. Comenzar con RT o SW
        */
        String Ren = "";
        boolean longitudCorrecta = true;
        boolean prefijoCorrecto = true;
        boolean isValido = true;
        String token = "";
        int tipoCaracter = 0;
        int numeroToken = 0;
        char letraToken = '@';
        
        Random cat = new Random();
        Scanner phantom = new Scanner(System.in); 
        
    do {
        System.out.println("Ingrese el nombre del equipo: ");
        Ren = phantom.nextLine().toUpperCase();
        
        //longitudCorrecta = Ren.length()==8;
        
        if(Ren.length()==8){
            longitudCorrecta = true;
        } // Fin de if
        
        else{
            longitudCorrecta = false;
        } // Fin de else
        
        prefijoCorrecto = (Ren.startsWith("RT")) || Ren.startsWith("SW");
        //System.out.println(longitudCorrecta);
        //System.out.println(prefijoCorrecto);
        
        isValido = longitudCorrecta && prefijoCorrecto;
        
    }while(!isValido);
    
        System.out.println("Registro correcto!!!");
        
        while(token.length()<12){
            tipoCaracter = cat.nextInt(2);
        
        
        if(tipoCaracter == 0){
            numeroToken = cat.nextInt(10);
            token = token + numeroToken;
        } // Fin de if
        
        else{
            letraToken = (char)(cat.nextInt(26)+65);
            token = token + letraToken;
        } // Fin de else
        } // Fin de While Generador de Token
        
        System.out.printf("Token: %s",token);
        
    } // Fin de main
    
} // Fin de clase
