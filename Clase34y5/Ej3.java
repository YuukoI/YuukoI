package Clase34y5;

import java.util.*;

public class Ej3 {

    static Scanner entrada = new Scanner(System.in);
    
    public static void main(String[] args) {
        String frase;
        
        System.out.print("Ingrese una frase:");
        frase = entrada.nextLine();
        
        if(frase.length() == 8){
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
        
        System.out.println("Su frase contiene " + frase.length() + " letras.");
    }
    
}
