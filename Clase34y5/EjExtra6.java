package Clase34y5;

import java.util.*;

public class EjExtra6 {

    static Scanner entrada = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n, cont = 0;
        double altura, suma = 0, promedio = 0;
        
        System.out.print("Ingrese la cantidad de personas a ser evaluadas:");
        n = entrada.nextInt();
        
        for(int i = 0; i < n; i++){
            System.out.print("Ingrese la altura del evaluado numero " + (i+1) + ":");
            altura = entrada.nextDouble();
            if(altura < 1.60){
                promedio = promedio + altura;
                cont++;
            }
            suma = suma + altura;
        }
        
        System.out.println("El promedio de las alturas menores a 1,60 es de: " + (promedio / cont));
        System.out.println("El promedio de las alturas en general es de: " + (suma / n));
    }
    
}
