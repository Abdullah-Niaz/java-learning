import java.util.*;

public class input {
    public static void main(String[] arr){
        // it is used to take input from the terminal/user
        Scanner Sc = new Scanner(System.in);
        // Next two variables take inputs from user using the inpurt scanner
        int a = Sc.nextInt();
        int b = Sc.nextInt();
        int sum = a + b;
        System.out.print("Sum of Two number is: ");
        System.out.print(sum);
    }
}
