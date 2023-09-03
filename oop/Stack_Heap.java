package oop;

import java.util.*;

public class Stack_Heap {
    public void dis(){
        int a = 10;
        System.out.println(a);
        show();
    };
    public void show(){
        int a = 20;
        System.out.println(a);
        put();
    }
    public void put(){
        int a = 30;
        System.out.println(a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack_Heap st = new Stack_Heap();
        st.dis();
        st.show();
        st.put();



    }
}