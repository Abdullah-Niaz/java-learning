package Functions;

import java.util.Scanner;

public class fabinoci {

    public static int fabinociSeries(int n){
        if(n < 2 ){
            return 1;
        }
        else{
            return (fabinociSeries(n - 1) + fabinociSeries(n - 2));
        }
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0 ; i <= n ; i++){
            int fab = fabinociSeries(i);
            System.out.println("Fabinoci Series of n: " + fab);
        }
    }
}
