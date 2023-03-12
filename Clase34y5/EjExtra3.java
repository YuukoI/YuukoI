package Clase34y5;

import java.util.*;

public class EjExtra3 {
    
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        char x;
        
        System.out.print("Ingrese una letra (si se ingresa mas de una se toma solo la primera):");
        x = entrada.next().charAt(0);
        if((x == 'a' || x == 'A') || (x == 'e' || x == 'E') || (x == 'i' || x == 'I') || (x == 'o' || x == 'O') || (x == 'u' || x == 'U')){
            System.out.println("Es vocal.");
        } else {
            System.out.println("Es consonante.");
        }
    }
    
}
