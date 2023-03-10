package Clase2y3;

import java.util.*;

public class Ej1 {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        int n1, n2;

        System.out.print("Ingrese el primer numero:");
        n1 = entrada.nextInt();
        System.out.print("Ingrese el segundo numero:");
        n2 = entrada.nextInt();

        System.out.println("El resultado de la suma entre " + n1 + " y " + n2 + " es: " + (n1 + n2));

    }

}
