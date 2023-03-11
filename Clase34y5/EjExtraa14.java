package Clase34y5;

import java.util.*;

public class EjExtraa14 {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        int N, M, edad, cant = 0;
        double promTotal = 0, promFam;

        System.out.print("Ingrese la cantidad de familias:");
        N = entrada.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.print("Ingrese la cantidad de hijos de la familia " + (i+1) + ":");
            M = entrada.nextInt();
            promFam = 0;
            for (int j = 0; j < M; j++) {
                System.out.print("Ingrese la edad del hijo " + (i + 1) + ":");
                edad = entrada.nextInt();
                promFam += edad;
                promTotal += edad;
                cant++;
            }
            System.out.println("El promedio de edad de los hijos de la familia numero " + (i + 1) + " es de: " + (promFam / M));
            System.out.println("----------------------------------------------------------------------------");
        }

        System.out.println("El promedio de la edad de los hijos de todas las familias es de: " + promTotal / cant);
    }

}
