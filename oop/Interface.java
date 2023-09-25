package oop;

// interface
interface Animal {

    // ! Varible are static and final in interface, we have to initilize at the time
    // of declaration
    // Final : It can't be changed once it is declared
    String name = "Ali";
    int age = 20;

    // Every method in interface is by default public and static
    void animalSound(); // interface method (does not have a body)

    void run(); // interface method (does not have a body)

    void sleep();
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
    @Override
    public void sleep(){
        System.out.println("Sleep!")
    }
}

class Pig implements Animal {
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The pig says: wee wee");
    }

    public void sleep() {
        // The body of sleep() is provided here
        System.out.println("Zzz");
    }

    @Override
    public void run() {
        System.out.println("Run!");
    }
}

public class Interface {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.animalSound();
        System.out.println();
        a.run();

        System.out.println();

        // ! Variables can't be changed, it can only be accessed
        System.out.println(a.name);
        System.out.println(a.age);



        Animal a1 = new Pig();
        a1.animalSound();
        a1.run();
        a1.sleep();
    }
}
