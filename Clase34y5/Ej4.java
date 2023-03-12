package Clase34y5;

import java.util.*;

public class Ej4 {

    static Scanner entrada = new Scanner(System.in);
    
    public static void main(String[] args) {
        String frase;
        
        System.out.print("Ingrese una frase que ingrese con A:");
        frase = entrada.nextLine();
        
        // FORMA MANUAL
        if(frase.charAt(0) == 'a' ||frase.charAt(0) == 'A' ){
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
        
        System.out.println("----------------------------");
        //STARS WITH
        if(frase.startsWith("a") || frase.startsWith("A")){
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
    }
    
}
