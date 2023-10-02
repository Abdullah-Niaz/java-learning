package CWD;

import java.util.Scanner;

public class CWD_16_Accessing_Multi_Dimentional_Array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Rows and Cols: ");
        int row = sc.nextInt();
        int col= sc.nextInt();
        int [][] marks = new int[row][col];
        System.out.print("Enter the Array Elements:  ");
        for(int i = 0 ; i < marks.length ; i++){
            for(int j = 0 ; j < marks[i].length;j++){
                marks[i][j] = sc.nextInt();
            }
        }
    
        System.out.println("Your Elements are Displaying Here: ");
        for(int i = 0 ; i < marks.length ; i++){
            for(int j = 0 ; j < marks[i].length;j++){
                System.out.println(marks[i][j]);
            }
            System.out.println("One Dimention is Done: " + i);
        }
    
    }
}
