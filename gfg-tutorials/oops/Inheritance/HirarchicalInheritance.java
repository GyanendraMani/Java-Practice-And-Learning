package Oops.Inheritance;

/**
 * 
 * One class serves as a superclass for more than one class.
 * 
 */

class A {
    public void print_A() {
        System.out.println("Class A");
    }
}

class B extends A {
    public void print_B() {
        System.out.println("Class B");
    }
}

class C extends A {
    public void print_C() {
        System.out.println("Class C");
    }
}

class D extends A {
    public void print_D() {
        System.out.println("Class D");
    }
}

public class HirarchicalInheritance {
    public static void main(String[] args) {

        B b = new B();
        b.print_A();
        b.print_B();

        C c = new C();
        c.print_A();
        c.print_C();

        D d = new D();
        d.print_A();
        d.print_D();
    }
}
