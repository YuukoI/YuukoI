package Clase2y3;

import java.util.*;

public class Ej5 {
    
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        double n;
        
        System.out.print("Ingrese un numero: ");
        n = entrada.nextDouble();
        
        System.out.println("El doble de " + n + " es: " + (n*2));
        System.out.println("El triple de " + n + " es:" + (n*3));
        System.out.println("La raiz de " + n + " es: " + (Math.sqrt(n)));
    }
    
}
