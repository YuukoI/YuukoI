package Clase34y5;

import java.util.*;

public class EjExtra1 {
    
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        int minutos, horas, dias;
        
        System.out.print("Ingrese los minutos:");
        minutos = entrada.nextInt();
        horas = minutos / 60;
        dias = horas / 24;
        horas = horas - (dias * 24);
        
        System.out.println("El equivalente de " + minutos + " minutos, es de: " + dias + " dias y " + horas + " horas.");
        
    }
    
}
