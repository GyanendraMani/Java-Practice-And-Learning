package Oops.ThisReference;

public class InvokeCurrentClassCstr {

    int a;
    int b;

    InvokeCurrentClassCstr() {
        this(20, 48);
        System.out.println("inside default constructor");
    }

    InvokeCurrentClassCstr(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("Inside parameterized constructor");
    }

    public static void main(String args[]) {
        InvokeCurrentClassCstr cstr = new InvokeCurrentClassCstr();
    }
}
