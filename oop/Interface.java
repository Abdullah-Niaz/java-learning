package oop;

// interface
interface Animal {

    // ! Varible are static and final in interface, we have to initilize at the time of declaration 
    // Final : It can't be changed once it is declared
    String name = "Ali";
    int age = 20;

    // Every method in interface is by default public and static
    void animalSound(); // interface method (does not have a body)

    void run(); // interface method (does not have a body)
}

class Dog implements Animal {
    @Override
    public void animalSound() {
        System.out.print("In Animal Sound");
    }

    @Override
    public void run() {
    System.out.print("Run ! ");
    }
}

public class Interface {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.animalSound();
        System.out.println();
        a.run();

        System.out.println();

        //! Variables can't be changed, it can only be accessed
        System.out.println(a.name);
        System.out.println(a.age);
    }
}
