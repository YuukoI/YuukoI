package Clase34y5;

import java.util.*;

public class Ej6 {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        int n1, n2, op;

        do {
            System.out.print("Ingrese el primer numero:");
            n1 = entrada.nextInt();

            System.out.print("Ingrese el segundo numero:");
            n2 = entrada.nextInt();

            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opcion:");
            op = entrada.nextInt();

            switch (op) {
                case 1 -> {
                    System.out.println("El resultado es: " + sumar(n1, n2));
                }
                case 2 -> {
                    System.out.println("El resultado es: " + restar(n1, n2));
                }
                case 3 -> {
                    System.out.println("El resultado es: " + multiplicar(n1, n2));
                }
                case 4 -> {
                    System.out.println("El resultado es: " + dividir(n1, n2));
                }
                case 5 -> {
                    System.out.println("See you later ;)");
                }
            }
        } while (op != 5);

    }

    private static double sumar(int n1, int n2) {
        return n1 + n2;
    }

    private static double restar(int n1, int n2) {
       return n1 - n2;
    }

    private static double multiplicar(int n1, int n2) {
        return n1 * n2;
    }

    private static double dividir(int n1, int n2) {
        return n1 / n2;
    }



}
