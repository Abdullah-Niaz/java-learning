package oop.Principles;

// Ecapsulation: 
    // - Class data and method are restricted inside the class
    // - Data can be used inside the class only.
    // - Ex: 
        // - In Bank, balance is private, so you have to give the credential to the manager so that he could give you the details of your bank account
        // - if someone ask your name, you will tell him your name, not before asking his.

class encap{
    // Data Members
    private int age = 11;
    private String name = "Ali";


    // Method 

    // Acsesors - Writing
    public void setAge(int n){
        age = n;
    }
    public void setName(String na){
        name = na;
    }


    // Getters - Getting
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }

}
public class Ecapsulation {
    public static void main(String[] args){

        encap en  = new encap();

        en.setAge(20);
        en.setName("Talha");

        int a = en.getAge();
        String na = en.getName();

        System.out.println("Name of Candidate is: "+ na);
        System.out.println("Age of Candidate is: "+ a);


        System.out.println("\n=========\n");

        encap en1  = new encap();

        en1.setAge(30);
        en1.setName("Reham");

        int a1 = en1.getAge();
        String na1 = en1.getName();

        System.out.println("Name of Candidate is: "+ na1);
        System.out.println("Age of Candidate is: "+ a1);
    }
    
}
