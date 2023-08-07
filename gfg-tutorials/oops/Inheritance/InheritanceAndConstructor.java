package Oops.Inheritance;

/**
 * 
 * Constructors in java are used to initialize the values of the attributes of
 * the object.
 * Constructor of the base class with no argument gets automatically called in
 * the derived class constructor.
 * if we want to call a parameterized constructor of the base class, then we can
 * call it using super().
 * The point to note is base class constructor call must be the first line in
 * the derived class constructor.
 * 
 */

class Base {

    int x;

    Base() {
        System.out.println("Base class Constructor called");
    }

    Base(int _x) {
        x = _x;
        System.out.println("base single parameter");
    }
}

class Derived extends Base {
    int y;

    Derived() {
        System.out.println("Derived class construction called");
    }

    Derived(int _x, int _y) {
        super(_x);
        y = _y;
    }

    void Display() {
        System.out.println("X = " + x + ", Y = " + y);
    }
}

public class InheritanceAndConstructor {

    public static void main(String[] args) {
        Derived d = new Derived();
        Derived d2 = new Derived(10, 20);
        d2.Display();

    }

}
