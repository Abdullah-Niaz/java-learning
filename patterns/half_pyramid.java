package patterns;

import java.util.Scanner;

public class half_pyramid {
        public static void main(String[] arr){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Numbers: ");
        int a  = s.nextInt();
        for(int i = a ; i >= 1 ; i--){
            for(int j = 1 ;j <= i ; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
