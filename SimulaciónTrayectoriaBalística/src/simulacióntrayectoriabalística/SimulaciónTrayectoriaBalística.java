/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simulacióntrayectoriabalística;

import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class SimulaciónTrayectoriaBalística {

    /**
     * @param args the command line arguments
     * 
     * Escribe un programa que simule el lanzamiento de un proyectil. El usuario debe ingresar la 
     * velocidad inicial (en m/s) y el ángulo de lanzamiento (en grados). Se tiene que buscar la fórmula 
     * correspondiente a la trayectoria.
     * 
     * Validación: La velocidad inicial debe ser mayor a 0 y el ángulo debe estar estrictamente entre 1 y 89 grados.
     * Operación: Utilizando un ciclo for, el programa debe calcular y mostrar la altura del proyectil (en metros) 
     * para cada segundo transcurrido, desde el segundo 𝑡 = 1 hasta el segundo 𝑡 = 10.
     * Selección: Dentro del ciclo, utiliza una estructura if-else para indicar en qué segundo el 
     * proyectil alcanza su altura máxima estimada y en qué momento su altura empieza a ser negativa (lo que significa
     * que ya impactó el suelo, momento en el cual el ciclo debe romperse mediante break). Nota: Utiliza la fórmula de posición vertical de la cinemática
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        
        //Declaracion de variables
        
        double velInicial = 0;
        double angulo = 0;
        double anguloRad = 0;
        double g = 9.81;
        double y = 0;
        int t = 0;
        double altMax = -1.0;
        int segundoMax = -1;
        
        System.out.println("Ingrese su velocidad inicial: ");
        velInicial = teclado.nextDouble();
        System.out.println("\nIngrese su angulo de lanzamiento (1 a 89 grados): ");
        angulo = teclado.nextDouble();
        
        if(velInicial <= 0 || angulo < 1 || angulo > 89){
            System.out.println("Error! Velocidad o angulo incorrectos");
        }else{
            angulo = Math.toRadians(angulo);
            
            System.out.println("--Trayectoria del proyectil--");
            for (t = 1; t <= 10; t++){
                // Ecuacion para la posicion vertical
                y = (velInicial * Math.sin(angulo)* t) - (0.5 * g * Math.pow(t, 2));
                
                if(y < 0){
                    System.out.printf("Segundo %s: El proyectil impacto en el suelo a %.2f m",t,y);
                    break;
                } // Fin de if proyectil impactado en el suelo
                
                System.out.printf("Segundo %s: Altura = %.2f metros",t,y);
                
                if(y > altMax){
                    altMax = y;
                    segundoMax = t;
                }
            } // Fin de ciclo for
            
            if(segundoMax != -1){
                System.out.printf("\nLa altura maxima estimada alcanzada durante la simulacion fue de %.2f con un total de %s m/s",altMax,segundoMax);
            }
        } // Fin de if/else 
    } // Fin de Main
    
} // Fin de clase
