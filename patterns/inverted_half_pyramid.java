package patterns;

import loops.forloop;

public class inverted_half_pyramid {
    public static void main(String[] arr){
        int n = 4 ;
        for(int i =1 ; i <= n; i++){
            for(int j = 1 ; j <= n - i ; j++){
                System.out.print("s");
            }    
            for(int j = 1 ; j <= i;j++){
                System.out.print("*");
            }
            System.out.println();
    }

    }
}
