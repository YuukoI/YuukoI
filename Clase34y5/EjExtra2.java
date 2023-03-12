package Clase34y5;

public class EjExtra2 {

    public static void main(String[] args) {
        int n1,n2,n3,n4, aux;
        
        // B tome el valor de C, C tome el valor de A, A tome el valor de D y D tome el valor de B
        n1 = 1;
        n2 = 2;
        n3 = 3;
        n4 = 4;
        System.out.println("Valores iniciales");
        
        System.out.println("n1 =" + n1);
        System.out.println("n2 =" + n2);
        System.out.println("n3 =" + n3);
        System.out.println("n4 =" + n4);
        
        aux = n2;
        n2 = n3;
        n3 = n1;
        n1 = n4;
        n4 = n2;
        
        System.out.println("Valores finales");
        System.out.println("n1 =" + n1);
        System.out.println("n2 =" + n2);
        System.out.println("n3 =" + n3);
        System.out.println("n4 =" + n4);
        
    }
    
}
