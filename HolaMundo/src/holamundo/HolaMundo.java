/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package holamundo;

/**
 *
 * @author alejandra raudales
 */
public class HolaMundo {
    
    // Comentario de una sola linea
    
    /* Bloque de comentario */

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Sensible a mayusculas y minusculas
        /* 
        Objetivo
        1. Imprimir en la pantalla.
        a. Diferentes formas para poder imprimir en pantalla 
        b. Caracteres de escape
        2. Captura de Datos por parte del usuario.
        */
        
      System.out.println("HolaMundo...Como estas!!");
      System.out.println("Este es mi primer programa");
      System.out.println("Yuujuuu...estoy con Java");
      
      System.out.print("Alejandra Raudales");
      System.out.print("Soy estudiante de progra");
      System.out.print("Mucho gusto");
      
      System.out.println("");
      System.out.printf("Esto es la clase de %S \n", "Programacion");
      //System.out.println("");
      System.out.printf("Esto %S la clase de\n", "Programacion");
      //System.out.println("");
      System.out.printf("%Sto es la clase de\n", "Programacion");
      //System.out.println("");
      System.out.printf("Hola \n Como \n estas\n en la clase %s\n", "Programacion");
      System.out.printf("Hola \t Como \t estas\t en la clase %s\t", "Programacion");
      
      //Variables
      int tiempo; //tipo entero
      double promedio; //tipo decimal
      char inicial; //tipo caracter
      boolean estado; //tipo boleano
      String nombre; //tipo cadena
      
      tiempo = 3;
      nombre = "Alejandra";
      inicial = 'A';
      
      System.out.printf("Tu nombre es: %s \n",nombre);
      System.out.printf("%d veces a la semana recibes la clase\n",tiempo);
      System.out.printf("Te llamare %c inicial",inicial);
      
     
    }//Fin de la clase MAIN
    
}//Fin de la clase HolaMundo
