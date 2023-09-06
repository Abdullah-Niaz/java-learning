package Static;

class main {
    int roll;
    static String name = "Ali";


    public main(){
        name = "Abdullah";
        roll = 20;
    }
    
    static {
        System.out.print("Inside the Static");
        name = "Abdullah";
    }

    public static void show() {
        System.out.println("Your Stored Name is: " + name);
    }

}

public class static_block {
    public static void main(String[] args) {
        main n = new main();
        main.show();
    }
}
