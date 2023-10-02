package CWD;

import java.util.Scanner;

public class CWD_15_Multi_Dimensional_Array {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int[][] ar = new int[2][4]; 
        System.out.println("Enter the Elements of Array: ");
        for(int i = 0; i < 2; i++){
            for(int j = 0 ; j <4 ; j++){
                ar[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < ar.length; i++){
            for(int j = 0 ; j < ar[i].length ; j++){
                System.out.println(ar[i][j]);
            }
        }
    }
}
