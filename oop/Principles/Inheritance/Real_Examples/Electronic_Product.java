package oop.Principles.Inheritance.Real_Examples;

import oop.super_Method;

// Base class Product
class Product {
    private String brand;
    private double price;

    public Product(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

// Subclass Laptop
class Laptop extends Product {
    private String processor;
    private int ramSize;

    public Laptop(String brand, double price, String processor, int ramSize) {
        super(brand, price);
        this.processor = processor;
        this.ramSize = ramSize;
    }

    public String getProcessor() {
        return processor;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }
}

// Subclass Smartphone
class Smartphone extends Product {
    private String operatingSystem;
    private int storageCapacity;

    public Smartphone(String brand, double price, String operatingSystem, int storageCapacity) {
        super(brand, price);
        this.operatingSystem = operatingSystem;
        this.storageCapacity = storageCapacity;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }
}

// Subclass Television
class Television extends Product {
    private int screenSize;
    private String resolution;

    public Television(String brand, double price, int screenSize, String resolution) {
        super(brand, price);
        this.screenSize = screenSize;
        this.resolution = resolution;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public String getResolution() {
        return resolution;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }
}


public class Electronic_Product{
    public static void main(String[] args) {
        // Create instances of electronic products
        Laptop laptop = new Laptop("Dell", 1200.0, "Intel Core i7", 16);
        Smartphone smartphone = new Smartphone("Apple", 999.99, "iOS", 128);
        Television television = new Television("Samsung", 799.0, 55, "4K Ultra HD");

        // Access and print information about the products
        System.out.println("Laptop:");
        System.out.println("Brand: " + laptop.getBrand());
        System.out.println("Price: $" + laptop.getPrice());
        System.out.println("Processor: " + laptop.getProcessor());
        System.out.println("RAM Size: " + laptop.getRamSize() + " GB");
        System.out.println();

        System.out.println("Smartphone:");
        System.out.println("Brand: " + smartphone.getBrand());
        System.out.println("Price: $" + smartphone.getPrice());
        System.out.println("Operating System: " + smartphone.getOperatingSystem());
        System.out.println("Storage Capacity: " + smartphone.getStorageCapacity() + " GB");
        System.out.println();

        System.out.println("Television:");
        System.out.println("Brand: " + television.getBrand());
        System.out.println("Price: $" + television.getPrice());
        System.out.println("Screen Size: " + television.getScreenSize() + " inches");
        System.out.println("Resolution: " + television.getResolution());
    }
}
