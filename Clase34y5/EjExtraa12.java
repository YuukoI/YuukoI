package Clase34y5;

public class EjExtraa12 {

    public static void main(String[] args) {
        
        for(int i = 0; i <= 9; i++){
            for(int j = 0; j <= 9; j++){
                for(int k = 0; k <= 9; k++){
                    if(i != 3 && j != 3 && k != 3){
                    System.out.print(i + "-" + j + "-" + k);
                        System.out.println("");
                    } else if(i == 3){
                        System.out.println("E-" + j + "-" + k);
                    } else if(j == 3){
                        System.out.println(i + "-" + "E-" + k);
                    } else if(k == 3){
                        System.out.println(i + "-" + j + "-E");
                    }
                }
            }
        }
    }
    
}
