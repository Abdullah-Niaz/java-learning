package U_EX_PR;
class Cat {
    public void speak(){
        System.out.println("Mea...........");
    }
}
class Dog {
    public void speak(){
        System.out.println("BOOH...........");
    }
    
}
class Frog {
    public void speak(){
        System.out.println("Tur Tur...........");
    }
    
}
class Flamingo {
    public void speak(){
        System.out.println("I don't Know or never heard...........");
    }

}
public class EX_2{
  public static void main( String args[] ) {
    Cat      theCat      = new Cat( );
    Dog      theDog      = new Dog( );
    Frog     theFrog     = new Frog( );
    Flamingo theFlamingo = new Flamingo( );

    System.out.println("The CAT says :");
    theCat.speak();
    System.out.println("The DOG says :");
    theDog.speak();
    System.out.println("The FROG says :");
    theFrog.speak();
    System.out.println("The FLAMINGO says :");
    theFlamingo.speak();
  }
}
