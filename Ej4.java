package Clase2y3;

import java.util.*;

public class Ej4 {

    static Scanner entrada = new Scanner(System.in);
    
    public static void main(String[] args) {
        double gradosC, gradosF;
        
        System.out.print("Ingrese los grados centigrados: ");
        gradosC = entrada.nextDouble();
        gradosF = 32 + (9 * gradosC / 5);
        System.out.println(gradosC + "C son " + gradosF +"F");
    }
    
}
