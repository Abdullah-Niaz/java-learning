package patterns;

import java.util.Scanner;

public class left_half_pyramid {
        public static void main(String[] arr){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Numbers: ");
        int n  = s.nextInt();
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ;j <= i ; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
