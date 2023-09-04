package loops;

import java.util.*;

public class for_each {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,3,4,5,6,7,8,9};

        int i  = 0;
        for(int x:arr){
            System.out.println("Value at index "+i + " is: " + x);
            i++;
        }
    }
}