package CWD;

import java.util.Scanner;

public class CWD_14_Array_input {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] n = new int[5];
        System.out.println("Enter the Array Elenments of Array : " + n.length + " : ");
        for(int i = 0 ; i < n.length ; i++){
            n[i] = sc.nextInt();
        }

        // Displaying

        for(int j=0; j < n.length ; j++){
            System.out.println(n[j]);
        }   

        String s = "Hello World";
        for(int i = 0 ; i < s.length(); i ++){
            char charcter = s.charAt(i);
            System.out.println(charcter);

        }


    }
    
}
