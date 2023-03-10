package Clase34y5;

import java.util.*;

public class EjExtra8 {
    
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        int n, cant = 0, pares = 0, impares = 0;
        
        do{
            System.out.print("Ingrese un numero:");
            n = entrada.nextInt();
            if(n > 0 && n % 5 != 0){
                if(n%2 == 0){
                    pares++;
                } else {
                    impares++;
                }
                cant++;
            }
            
        }while(n%5 != 0);
        
        System.out.println("La cantidad de pares es de: " + pares);
        System.out.println("La cantidad de impares es de: " + impares);
        System.out.println("La cantidad de numeros ingresados es de: " + cant);
    }
    
}
