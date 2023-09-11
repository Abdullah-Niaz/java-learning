package oop.Principles.Inheritance;

import java.util.Scanner;

class Address {
    String city;
    String state;
    String country;
    String zipcode;

    public Address(String city, String state, String country, String zipcode) {
        this.city = city;
        this.state = state;
        this.country = country;
        this.zipcode = zipcode;
    }
        // Add a method to display address details
    public void showAddressDetails() {
        System.out.println("Address: " + city + ", " + state + ", " + country + " - " + zipcode);
    }
}

class Employee {
    int id;
    String name;
    String email;
    Address address; // Employee HAS-A Address

    public Employee(int id, String name, String email, Address address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address; // Aggregation: Employee HAS-A Address
    }
    public void showEmployeDetails(){
    System.out.println("Name of Employee is: " + name + "\nId: " + id + "\nEmail: " + email + "\nAddress: " ); 
        address.showAddressDetails();
    }
}


public class aggregation {
    public static void main(String [] args){
        Address ad = new Address("Multan", "Punjab", "Pakistan", "39200");
        Employee em = new Employee(2400, "Ali", "ali@gmail.com", ad);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to see the Employe Details: ");
        int s = sc.nextInt();
        if(s == 1 ){
            em.showEmployeDetails();
        }
        else{
            System.out.println("Record not Found");
        }

    }
    
}
