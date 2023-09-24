package U_EX_PR;

import Strings.intro;

class Pet {
    public String speak()  { 
    return "Hi, I'm a happy and contented pet"; 
  }
}

class Dog extends Pet {
  public String speak()  { 
    return super.speak() + ". Arf, Arf"; 
  }
}
class Cat extends Pet {
  public String speak()  { 
    return super.speak() + ". Meow, meow"; 
  }
}
class Flamingo extends Pet {
  public String speak() { 
    return "They're holding me captive. You must help!"; 
  }
}

public class EX_3 {
    public static void main(String [] args){
        Pet p = new Pet();
        System.out.println(p instanceof Pet);
        System.out.println(p.speak());
        
        Pet p1 = new Cat();
        System.out.println(p1 instanceof Cat);
        System.out.println(p1.speak());

        Pet p2 = new Dog();
        System.out.println(p2 instanceof Dog);
        System.out.println(p2.speak());

        Pet p3 = new Flamingo();
        System.out.println(p3 instanceof Flamingo);
        System.out.println(p3.speak());
    }
}
