package Clase34y5;

import java.util.*;

public class ExExtraa11 {
    
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        int num, cant = 0;
        
        System.out.print("Ingrese un numero:");
        num = entrada.nextInt();
        
        while(num != 0){
            num = num / 10;
            cant++;
        }
        
        System.out.println("La cantidad de digitos del numero ingresado es de: " + cant);
        
        //Otra forma...
        String numero;
        
        System.out.print("Ingrese un numero:");
        numero = entrada.next();
        System.out.println("La cantidad de digitos que tiene el numero ingresado son: " + numero.length());
    }
    
}
