package patterns;
import java.util.Scanner;

public class rectangle {
    public static void main(String[] arr){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Rows & Colums: ");
        int a  = s.nextInt();
        int b = s.nextInt();
        for(int i = 1 ; i <= a ; i++){
            for(int j = 1 ;j <= b ; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
