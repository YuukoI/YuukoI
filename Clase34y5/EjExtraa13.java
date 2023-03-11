package Clase34y5;

import java.util.*;

public class EjExtraa13 {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        int num;

        System.out.print("Ingrese un numero:");
        num = entrada.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }

}
