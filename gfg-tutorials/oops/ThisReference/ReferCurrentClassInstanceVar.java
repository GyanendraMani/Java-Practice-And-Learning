package Oops.ThisReference;

public class ReferCurrentClassInstanceVar {

    int a;
    int b;

    ReferCurrentClassInstanceVar(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void display() {
        System.out.println("a = " + a + " b = " + b);
    }

    public static void main(String[] args) {
        ReferCurrentClassInstanceVar obj = new ReferCurrentClassInstanceVar(10, 20);
        obj.display();
    }
}
