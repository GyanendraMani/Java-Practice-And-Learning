package Oops.ThisReference;

public class ThisAsMethodPara {

    int a;
    int b;

    ThisAsMethodPara() {
        a = 10;
        b = 20;

    }

    void display(ThisAsMethodPara obj) {
        System.out.println("a = " + obj.a + "  b = " + obj.b);
    }

    // Method that returns current class instance
    void get() {
        display(this);
    }

    public static void main(String[] args) {
        ThisAsMethodPara object = new ThisAsMethodPara();
        object.get();
    }

}
