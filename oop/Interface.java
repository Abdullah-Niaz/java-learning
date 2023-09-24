package oop;

// interface
interface Animal {

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

    }
}
