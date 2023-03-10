package Clase34y5;

import java.util.*;

public class Ej5 {
    
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        int tope, suma = 0;
        
        System.out.print("Ingrese el tope:");
        tope = entrada.nextInt();
        
        while(suma < tope){
            System.out.print("Ingrese un numero:");
            suma  = suma + entrada.nextInt();
            System.out.println("La suma es: " + suma);
        }
    }
    
}
