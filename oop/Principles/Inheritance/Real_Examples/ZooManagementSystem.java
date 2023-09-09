package oop.Principles.Inheritance.Real_Examples;

// Base class: Animal
class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

// Subclass: Lion
class Lion extends Animal {
    String maneColor;

    public Lion(String name, String maneColor) {
        super(name);
        this.maneColor = maneColor;
    }

    public void roar() {
        System.out.println(name + " roars loudly.");
    }
}

// Subclass: Elephant
class Elephant extends Animal {
    double trunkLength;

    public Elephant(String name, double trunkLength) {
        super(name);
        this.trunkLength = trunkLength;
    }

    public void trumpet() {
        System.out.println(name + " trumpets with its trunk.");
    }
}

// Subclass: Giraffe
class Giraffe extends Animal {
    double neckLength;

    public Giraffe(String name, double neckLength) {
        super(name);
        this.neckLength = neckLength;
    }

    public void stretchNeck() {
        System.out.println(name + " stretches its long neck.");
    }
}

public class ZooManagementSystem  {
    public static void main(String[] args) {
        // Create instances of animals
        Lion simba = new Lion("Simba", "Golden");
        Elephant dumbo = new Elephant("Dumbo", 2.5);
        Giraffe melman = new Giraffe("Melman", 4.0);

        // Demonstrate behaviors
        simba.eat();
        simba.sleep();
        simba.roar();

        dumbo.eat();
        dumbo.sleep();
        dumbo.trumpet();

        melman.eat();
        melman.sleep();
        melman.stretchNeck();
    }
}
