package Clase34y5;

import java.util.*;

public class EjExtraa10 {
    
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        int n1, n2, n3, adiv, cont = 0;
        
        n1 = (int) (Math.random()*10+1);
        n2 = (int) (Math.random()*10+1);
        n3 = n1 * n2;
        
        do{
            System.out.print("Ingrese un numero:");
            adiv = entrada.nextInt();
            cont++;
            
            if(adiv > n3){
                System.out.println("El numero es menor.");
            } else if(adiv < n3){
                System.out.println("El numero es mayor.");
            } else {
                System.out.println("Felicidades, usted adivino el numero con " + cont + " intentos!");
            }
        }while(adiv != n3);
    }
    
}
