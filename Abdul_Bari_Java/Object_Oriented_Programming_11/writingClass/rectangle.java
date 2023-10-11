package Abdul_Bari_Java.Object_Oriented_Programming_11.writingClass;

class rectang{
    public int length;
    public int breadth;

    public int Area(){
        return length + breadth;
    }
    public int perimeter(){
        return 2 * (length  + breadth);
    }
}

public class rectangle {
    public static void main(String[] args){
        rectang r = new rectang();
        r.length = 20;
        r.breadth = 40;

        System.out.println("Area: " + r.Area());
        System.out.println("Perimeter: " + r.perimeter());
    }
    
}
