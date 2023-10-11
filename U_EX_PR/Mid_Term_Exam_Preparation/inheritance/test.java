package U_EX_PR.Mid_Term_Exam_Preparation.inheritance;

class Animal {
    String name;
    public Animal (String name ){
        this.name = name;
    }
    public void makeSound(){
        System.out.println("Sound");
    }
}

class Dog extends Animal{
    public Dog(String name){
        super(name);
    }
    public void makeSound(){
        System.out.println("Bow Bow");
    }
}

class cat extends Animal{
    public cat(String name){
        super(name);
    }
    public void makeSound(){
        System.out.println("Meow Meow");
    }

}

public class test {
    public static void main(String [] args){
        Animal a = new Animal("");
        a.makeSound();



        Animal d = new Dog("German");
        d.makeSound();


        Animal c = new cat("Billy");
        c.makeSound();
    }
    
}
