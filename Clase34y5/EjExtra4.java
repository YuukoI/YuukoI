package Clase34y5;

import java.util.*;

public class EjExtra4 {
    
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        int num;
        
        System.out.print("Ingrese un numero:");
        num = entrada.nextInt();
        
        if(num >= 1 && num <= 10){
            switch(num){
                case 1 -> { System.out.println("El numero romano de " + num + " es I");
                }
                case 2 -> { System.out.println("El numero romano de " + num + " es II");
                }
                case 3 -> { System.out.println("El numero romano de " + num + " es III"); 
                }
                case 4 -> { System.out.println("El numero romano de " + num + " es IV");
                }
                case 5 -> { System.out.println("El numero romano de " + num + " es V");
                }
                case 6 -> { System.out.println("El numero romano de " + num + " es VI");
                }
                case 7 -> { System.out.println("El numero romano de " + num + " es VII");
                }
                case 8 -> { System.out.println("El numero romano de " + num + " es VIII");
                }
                case 9 -> { System.out.println("El numero romano de " + num + " es IX");
                }
                case 10 -> { System.out.println("El numero romano de " + num + " es X");
                }
            }     
            }
    }
    
}
