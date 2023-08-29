package Array;
import java.util.*;
public class takinguserinput {
    public static void main(String [] arr){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array: ");
        int size = sc.nextInt();
        int ar[] = new int[size];


        System.out.print("Enter Array Elements of size "+size+" : ");
        for(int i = 0; i < size ; i++){
            ar[i] = sc.nextInt();
        }
        System.out.print("Here is your Array Elements: ");

        for(int i = 0 ; i < size; i++){
            System.out.println(ar[i]);
        }


    }
}
