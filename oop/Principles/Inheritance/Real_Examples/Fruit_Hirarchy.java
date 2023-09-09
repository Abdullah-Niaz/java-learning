package oop.Principles.Inheritance.Real_Examples;

// Base class: Fruit
class Fruit {
    private String color;
    private String taste;

    // Constructor
    public Fruit(String color, String taste) {
        this.color = color;
        this.taste = taste;
    }

    // Getters and setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }
}

// Subclass: Apple
class Apple extends Fruit {
    // Additional attributes specific to Apple
    private String variety;

    // Constructor
    public Apple(String color, String taste, String variety) {
        super(color, taste); // Call the constructor of the base class
        this.variety = variety;
    }

    // Getter and setter for Apple-specific attribute
    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }
}

// Subclass: Banana
class Banana extends Fruit {
    // Additional attributes specific to Banana
    private boolean isRipe;

    // Constructor
    public Banana(String color, String taste, boolean isRipe) {
        super(color, taste); // Call the constructor of the base class
        this.isRipe = isRipe;
    }

    // Getter and setter for Banana-specific attribute
    public boolean isRipe() {
        return isRipe;
    }

    public void setRipe(boolean ripe) {
        isRipe = ripe;
    }
}

// Subclass: Orange
class Orange extends Fruit {
    // Additional attributes specific to Orange
    private String variety;

    // Constructor
    public Orange(String color, String taste, String variety) {
        super(color, taste); // Call the constructor of the base class
        this.variety = variety;
    }

    // Getter and setter for Orange-specific attribute
    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }
}


public class Fruit_Hirarchy {
    public static void main(String[] args) {
        // Create instances of fruits
        Apple apple = new Apple("Red", "Sweet", "Fuji");
        Banana banana = new Banana("Yellow", "Sweet", true);
        Orange orange = new Orange("Orange", "Citrusy", "Valencia");

        // Access and display attributes
        System.out.println("Apple:");
        System.out.println("Color: " + apple.getColor());
        System.out.println("Taste: " + apple.getTaste());
        System.out.println("Variety: " + apple.getVariety());

        System.out.println("\nBanana:");
        System.out.println("Color: " + banana.getColor());
        System.out.println("Taste: " + banana.getTaste());
        System.out.println("Is Ripe: " + banana.isRipe());

        System.out.println("\nOrange:");
        System.out.println("Color: " + orange.getColor());
        System.out.println("Taste: " + orange.getTaste());
        System.out.println("Variety: " + orange.getVariety());
    }
}
