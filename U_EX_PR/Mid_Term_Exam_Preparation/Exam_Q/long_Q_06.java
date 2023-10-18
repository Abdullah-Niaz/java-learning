package U_EX_PR.Mid_Term_Exam_Preparation.Exam_Q;

class Shape{
    public void draw(){
        System.out.println("Drawing the Shape");
    }
    public double calculateArea(){
        return 0.0;
    }
}

class Circle extends Shape{
    protected double radius;

    public Circle(double radius){
        this.radius = radius;
    }
    public void draw(){
        System.out.println("Drawing the Circle Shape");
    }
    public double calculateArea(){
        return Math.PI * (radius * radius);
    }
}

class Cyclinder extends Circle{
    protected double heigth;


    public Cyclinder(double radius, double heigth){
        super(radius);
        this.heigth = heigth;
    }

    public void draw(){
        System.out.println("Drawing the Cyclinder Shape");
    }

    public double calculateArea(){
        double baseArea = super.calculateArea();
        double lateralSurfaceArea = 2 * Math.PI * radius * heigth;
        double totalSurfaceArea = 2 * baseArea * lateralSurfaceArea;
        return totalSurfaceArea;
    }
}



public class long_Q_06 {
    public static void main(String[] args){
        Circle ci = new Circle(5.0);
        Cyclinder cy = new Cyclinder(3.0, 5.0);
        
        System.out.println("\n");
        ci.draw();
        System.out.println("Circle Area: " + ci.calculateArea());

        System.out.println("\n");
        cy.draw();
        System.out.println("Cylinder Surface Area: " + cy.calculateArea());
        System.out.println("\n");
        
    }
    
}
