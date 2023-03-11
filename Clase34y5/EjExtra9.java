package Clase34y5;

import java.util.*;

public class EjExtra9 {
    
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        int residuo, cociente = 0, divisor;
        
        System.out.print("Ingrese el numero a ser dividido por resta sucesiva: ");
        residuo = entrada.nextInt();
        
        System.out.print("Ingrese el divisor: ");
        divisor = entrada.nextInt();
        
        while(residuo >= divisor){
            residuo = residuo - divisor;
            cociente++;
        }
        
        System.out.println("El residuo es: " + residuo + " y el cociente es : " + cociente);
        
    }
    
}
