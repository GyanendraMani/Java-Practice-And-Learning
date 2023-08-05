package Oops.ThisReference;

public class ImpementationOfThis {
    int num = 10;

    ImpementationOfThis() {
        System.out.println("inside the constructor");
    }

    ImpementationOfThis(int num) {

        // invoked default constructor
        this();
        this.num = num;
    }

    void display() {
        this.show();
        System.out.println("num: " + this.num);
    }

    void show() {
        System.out.println("Inside show method");
    }

    public static void main(String args[]) {
        ImpementationOfThis obj = new ImpementationOfThis(100);
        obj.display();
    }

}
