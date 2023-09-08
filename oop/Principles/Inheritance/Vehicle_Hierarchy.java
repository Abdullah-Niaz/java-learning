package oop.Principles.Inheritance;

// You can model a vehicle hierarchy with a base class Vehicle and subclasses like Car, Bicycle, and Motorcycle. Each subclass inherits common attributes like speed and fuelCapacity from the Vehicle class.



// Base class
class Vehicle {
    // Common attributes
    protected String brand;
    protected double speed;
    protected double fuelCapacity;
    
    public Vehicle(String brand, double speed, double fuelCapacity) {
        this.brand = brand;
        this.speed = speed;
        this.fuelCapacity = fuelCapacity;
    }
    
    // Common method to display vehicle information
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Fuel Capacity: " + fuelCapacity + " liters");
    }
}

// Subclass 1: Car
class Car extends Vehicle {
    private int numberOfDoors;
    
    public Car(String brand, double speed, double fuelCapacity, int numberOfDoors) {
        super(brand, speed, fuelCapacity);
        this.numberOfDoors = numberOfDoors;
    }
    
    // Car-specific method
    public void honk() {
        System.out.println(brand + " car honks!");
    }
}

// Subclass 2: Bicycle
class Bicycle extends Vehicle {
    private int numberOfGears;
    
    public Bicycle(String brand, double speed, int numberOfGears) {
        super(brand, speed, 0); // Bicycles don't have fuel capacity
        this.numberOfGears = numberOfGears;
    }
    
    // Bicycle-specific method
    public void ringBell() {
        System.out.println(brand + " bicycle rings its bell!");
    }
}

// Subclass 3: Motorcycle
class Motorcycle extends Vehicle {
    private boolean hasHelmetCompartment;
    
    public Motorcycle(String brand, double speed, double fuelCapacity, boolean hasHelmetCompartment) {
        super(brand, speed, fuelCapacity);
        this.hasHelmetCompartment = hasHelmetCompartment;
    }
    
    // Motorcycle-specific method
    public void startEngine() {
        System.out.println(brand + " motorcycle engine starts!");
    }
}

public class Vehicle_Hierarchy {
    public static void main(String[] args) {


        Car car = new Car("Toyota", 120.0, 45.0, 4);
        Bicycle bicycle = new Bicycle("Trek", 20.0, 21);
        Motorcycle motorcycle = new Motorcycle("Honda", 180.0, 15.0, true);
        
        System.out.println("Car Information:");
        car.displayInfo();
        car.honk();
        
        System.out.println("\nBicycle Information:");
        bicycle.displayInfo();
        bicycle.ringBell();
        
        System.out.println("\nMotorcycle Information:");
        motorcycle.displayInfo();
        motorcycle.startEngine();

    }
}
