package patterns;

import java.util.Scanner;

import javax.swing.text.StyledEditorKit;

import condition.calculator;

public class hollowRectangle {
    public static void main(String[] arr){
                Scanner s = new Scanner(System.in);
        System.out.print("Enter the Rows & Colums: ");
        int a  = s.nextInt();
        int b = s.nextInt();
        for(int i = 1 ; i <= a ; i++){
            for(int j = 1 ;j <= b ; j++){
                if(i == 1 || i == a || j == 1 || j == b){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
