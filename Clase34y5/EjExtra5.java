package Clase34y5;

import java.util.*;

public class EjExtra5 {
    
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        char tipo;
        double precio;        
        
        System.out.print("Ingrese que tipo de socio es (A,B,C):");
        tipo = entrada.next().charAt(0);
        
        System.out.print("Ingrese el costo del tratamiento:");
        precio = entrada.nextInt();
        
        switch (tipo) {
            case 'a', 'A' -> {
                precio = precio - (precio* 0.5);
                System.out.println("El costo del tratamiento es de: $" + precio);
            }
            case 'b', 'B' -> {
                precio = precio - (precio* 0.35);
                System.out.println("El costo del tratamiento es de: $" + precio);
            }
            case 'c', 'C' -> System.out.println("El costo del tratamiento es de: $" + precio);
            default -> {
            }
        }
    }
    
}
