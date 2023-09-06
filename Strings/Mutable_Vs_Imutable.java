package Strings;

public class Mutable_Vs_Imutable {

    public static void main(String [] args){
        // String is imutable data type, once string is declared you can change the string but you can perfrom certain methods which are of that class
        // Strings are constant 


        String n = "Ab";
        System.out.println(n.hashCode());
        System.out.println(n);


        n = "Abdullah";
        System.out.println(n.hashCode());
        System.out.println(n);
    }
    
}
