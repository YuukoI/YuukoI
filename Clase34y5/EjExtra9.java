package Clase34y5;

import java.util.*;

public class EjExtra9 {
    
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        int dividendo, cociente = 0, divisor;
        
        System.out.print("Ingrese el numero a ser dividido por resta sucesiva: ");
        dividendo = entrada.nextInt();
        
        System.out.print("Ingrese el divisor: ");
        divisor = entrada.nextInt();
        
        while(dividendo >= divisor){
            dividendo = dividendo - divisor;
            cociente++;
        }
        
        System.out.println("El residuo es:" + dividendo + " y el cociente es :" + cociente);
        
    }
    
}
