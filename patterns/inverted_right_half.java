package patterns;

import java.util.Scanner;

public class inverted_right_half {
        public static void main(String[] arr){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Numbers: ");
        int a  = s.nextInt();
        for(int i = 1 ; i<=a ; i++){
            for(int j = 1 ;j <= a - i +1 ; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
