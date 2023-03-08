package Clase2y3;

import java.util.*;

public class Ej3 {
    
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        String frase;
        
        System.out.print("Ingrese una frase: ");
        frase = entrada.nextLine();
        
        System.out.print("Su frase en mayusculas es: " + frase.toUpperCase());
        System.out.println("");
        System.out.println("Su frase en minusculas es: " + frase.toLowerCase());
    }
    
}
