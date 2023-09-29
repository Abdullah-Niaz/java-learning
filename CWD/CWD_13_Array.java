package CWD;

import loops.for_each;

public class CWD_13_Array {
    public static void main(String[]args){
        // Declaration & initilizatino
        int marks[] = new int[5];
        marks[0] = 100;
        marks[1] = 110;
        marks[2] = 120;
        marks[3] = 130;
        marks[4] = 140;
    for(int i = 0; i < marks.length;i++){
        System.out.println(marks[i]);
    }


    // Declaration
    int st[];
    // initilization
    st = new int[5];



    // At the same time
    int stu[] = {10,20,30,40,50};
    for(int i =0; i < st.length; i++){
        System.out.println(stu[i]);
    }


    // Printing array in Reverse Order
    int sta[] = {2,3,4,5,6,7,9};
    for(int i = sta.length -1 ; i > 0 ; --i){
        System.out.println("Value is  : " + sta[i]);
    }


    int stb[]  = {1,2,3,4,5,6};
    for(int ele : stb){
        System.out.println(ele);
    }
}   
}
