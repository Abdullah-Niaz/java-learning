package oop;
class Person {
    private String name;
    private int age;

    // Default constructor (automatically provided if none is defined)
    public Person() {
        // Default initialization
    }
    // Mutattors
    public String get_name(){
        return name;
    }
    public int get_age(){
        return age;
    }
};


public class defaultConstructorTypes {
    public static void main(String[] args){
        Person ps = new Person();
        System.out.println(ps.get_name());
        System.out.println(ps.get_age());
    }
}
