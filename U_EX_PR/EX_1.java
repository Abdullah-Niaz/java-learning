package U_EX_PR;

class A {
    int x;

    public A() {
        this(100);
    }

    public A(int x) {
        this.x = x;
    }

    public String toString() {
        return "A:" + x;
    }
}

class B extends A {
    int x = 10;
    int y = 1;

    public B() {
    }

    public B(int y) {
        this.y = this.y + y;
    }

    public B(int x, int y) {
        super(x);
        this.y = this.y + y;
    }

    public String toString() {
        return "A:" + super.x + ", B:(" + x + "," + y + ")";
    }
}

public class EX_1 {
    public static void main(String[] args) {
        A a1 = new A(); // 100
        System.out.println(a1);
        A a2 = new A(10); // 10 
        System.out.println(a2);
        B b1 = new B();     
        System.out.println(b1);

    }
}
