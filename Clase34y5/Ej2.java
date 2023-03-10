package Clase34y5;

import java.util.*;

public class Ej2 {
    
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        String frase;
        
        System.out.print("Ingrese una frase:");
        frase = entrada.next();
        frase = frase.toLowerCase();
        
        if(frase.equals("eureka".toLowerCase())){
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
    }
    
}
