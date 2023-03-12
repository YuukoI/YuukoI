package Clase34y5;

import java.util.*;

public class Ej7 {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        String frase;
        int  correctas = 0, inc = -1;

        //CASERO
        /*
        do {
            System.out.print("Ingrese una frase de 5 hasta digitos:");
            frase = entrada.nextLine();
            frase = frase.toUpperCase();
            if (frase.length() <= 5) {
                if (frase.charAt(0) == 'X' && frase.charAt(tam - 1) == 'O') {
                    correctas++;
                } else {
                    System.out.println("La frase no empieza con X o no termina con O");
                    inc++;
                }
            } else {
                System.out.println("La frase es mayor a 5 digitos.");
                inc++;
            }
        } while (!"&&&&&".equals(frase));
        System.out.println("La cantidad de frases correctas es de: " + correctas);
        System.out.println("La cantidad de frases incorrectas es de: " + inc);
         */
        //MEJORADO
        
        do{
        System.out.print("Ingrese una frase de 5 hasta digitos:");
        frase = entrada.nextLine();
        frase = frase.toUpperCase();
        if(frase.length() <= 5){
            if((frase.startsWith("x") || frase.startsWith("X")) && (frase.endsWith("o") || frase.endsWith("O"))){
                correctas++;
            } else {
                System.out.println("La frase no empieza con X o no termina con O");
                inc++;
            }
        } else {
            System.out.println("La frase es mayor a 5 digitos.");
            inc++;
        }
        }while(!"&&&&&".equals(frase));
        System.out.println("La cantidad de frases correctas es de: " + correctas);
        System.out.println("La cantidad de frases incorrectas es de: " + inc);
         
    }

}
