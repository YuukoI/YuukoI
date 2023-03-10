package Clase34y5;

import java.util.*;

public class Ej1 {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        int n;

        System.out.print("Ingrese un numero:");
        n = entrada.nextInt();

        if (n % 2 == 0) {
            System.out.println("Es par.");
        } else {
            System.out.println("Es impar");
        }
    }

}
