package Oops.Inheritance;

import java.io.*;

/**
 * 
 * Java dosen't support Multiple Inheritance.
 * Multiple inheritance is a feature of an oops where a class can inharit
 * properties of more then one parent class.
 * Problem: when there exist methods with the same signature in both the
 * superclasses and subclass.
 * On calling method, the compilor cannot determine which class method to be
 * called and even on calling which class method gets the priority
 * In java multiple inheritance possible with interfaces
 */

interface PI1 {
    default void show() {
        System.out.println("Default PI1");
    }

}

interface PI2 {
    default void show() {
        System.out.println("Default PI2");
    }
}

class MultipleInheritance implements PI1, PI2 {
    public void show() {

        PI1.super.show();
        PI2.super.show();

    }

    public void showOfPI1() {
        PI1.super.show();// Should not be used directly in the main method;
    }

    public void showOfPI2() {
        PI2.super.show(); // Should not be used directly in the main method;
    }

    public static void main(String args[]) {

        MultipleInheritance mi = new MultipleInheritance();

        mi.show();

        System.out.println("Now Executing showOfPI1() showOfPI2()");
        mi.showOfPI1();
        mi.showOfPI2();

    }
}
