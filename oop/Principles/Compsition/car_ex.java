package oop.Principles.Compsition;


class Engine{
    public void Engine_Start(){
        System.out.println("Engine Started");
    }
}
class Wheels{
    public void Wheels_rotating(){
        System.out.println("Wheels are Rotating");
    }
}
class Seats{
    public void Seats_have(){
        System.out.println("We have Seated our Safty Belts & ready to Move");
    }
}


class Car{
    private Engine engine;
    private Wheels wheels;
    private Seats seats;

    public Car(){
        engine = new Engine();
        wheels = new Wheels();
        seats = new Seats();
   }

//    Now lets Test the Car:
    public void Drive(){
        engine.Engine_Start();
        seats.Seats_have();
        wheels.Wheels_rotating();

    }
}

public class car_ex {
    public static void main(String[]args){
        Car car =new  Car();
        car.Drive();
    }
}
