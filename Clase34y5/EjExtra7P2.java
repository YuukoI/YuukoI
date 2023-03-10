package Clase34y5;

import java.util.*;

public class EjExtra7P2 {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        int n, min = 0, max = 0, cont = 0, nums, suma = 0;
        System.out.print("Ingrese la cantidad de numeros a ser evaluados:");
        n = entrada.nextInt();

        if (n > 0) {
            
            do{
                System.out.print("Ingrese un numero:");
                nums = entrada.nextInt();
                if (cont == 0) {
                    min = nums;
                    max = nums;
                }
                if (nums < min) {
                    min = nums;
                }
                if (nums > max) {
                    max = nums;
                }
                suma += nums;
                cont++;
            }while (cont < n);

            System.out.println("El menor es: " + min);
            System.out.println("El mayor es: " + max);
            System.out.println("El promedio de todos los numeroe es de: " + (suma / n));

        }
    }

}
