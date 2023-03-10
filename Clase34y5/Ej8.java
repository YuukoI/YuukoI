package Clase34y5;

import java.util.*;

public class Ej8 {

    static Scanner entrada = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n;
        
        System.out.print("Ingrese la medida del cuadrado:");
        n = entrada.nextInt();
        
        for(int i = 0; i < n; i++){
            System.out.print("*");
        }
        System.out.println();
        
        for(int i = 0; i < n-2; i++){
            System.out.print("*");
            for(int j = 0; j < n-2; j++){
                System.out.print(" ");
            }
            System.out.println("*");
        }
        
        for(int i = 0; i < n; i++){
            System.out.print("*");
        }
        
    }
    
}
