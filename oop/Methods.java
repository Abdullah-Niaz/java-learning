package oop;
import Array.practiceArray;

class computer{
    private int price;
    public String name;

    // Default Constructor
    computer(){
        name =null;
        price = 0;
    }

    // parameterized constructor
    computer(String na , int p){
        name = na;
        price = p;
    }

    public int get_price(){
        return price;
    }

    public String get_name(){
        return name;
    }

}

public class Methods {
    public static void main(String[] args){

        computer com = new computer("Super",24000);

        String name = com.get_name();
        int price = com.get_price();

        System.out.println("Name of Computer is: "+ name);
        System.out.println("Price of Computer is: "+ price);
    }
}
