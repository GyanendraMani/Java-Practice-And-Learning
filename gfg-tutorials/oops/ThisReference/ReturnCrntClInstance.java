package Oops.ThisReference;

public class ReturnCrntClInstance {

    int a;
    int b;

    ReturnCrntClInstance() {
        a = 10;
        b = 20;
    }

    // This method will return current class instance
    ReturnCrntClInstance get() {
        return this;
    }

    void display() {
        System.out.println("a = " + a + "  b = " + b);
    }

    public static void main(String[] args) {

        ReturnCrntClInstance obj = new ReturnCrntClInstance();
        obj.get().display();

    }
}
