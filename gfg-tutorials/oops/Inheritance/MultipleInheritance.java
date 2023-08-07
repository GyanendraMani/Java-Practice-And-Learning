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

class Parent1 {
    void fun() {

        // Print statement if this method is called
        System.out.println("Parent1");
    }

}

class Parent2 {
    void fun() {

        // Print statement if this method is called
        System.out.println("Parent2");
    }
}

interface PT1{
    default void show(){
        System.out.println("Default PT1");
    }

}


public class MultipleInheritance {
    public static void main(String args[]) {

    }
}
