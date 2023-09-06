package Static;

class MyClass {
    public static int count; // Static variable
    public static String name;
    
    public MyClass() {
        count++; // Increment count whenever an instance is created
    }
}

public class Static_Variable {
    public static void  main(String [] args){
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass();
        MyClass.name="abdullah";
        System.out.println(MyClass.name);
        MyClass.name="Omer";
        System.out.println(MyClass.name);
        System.out.println("Number of instances created: " + MyClass.count); // Accessing the static variable

    }
    
}
