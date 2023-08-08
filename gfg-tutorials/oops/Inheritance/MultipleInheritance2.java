package Oops.Inheritance;

import java.io.*;
import java.lang.*;
import java.util.*;

interface One1 {
    public void print_One();
}

interface Two1 {
    public void print_Two();
}

interface Three1 extends One1, Two1 {
    public void print_Three();
}

class Child implements Three1 {
    @Override
    public void print_One() {
        System.out.println("Printing One ");
    }

    public void print_Two() {
        System.out.println("Printing Two");
    }

    public void print_Three() {
        System.out.println(" Printing three");
    }
}

public class MultipleInheritance2 {
    public static void main(String[] args) {
        Child c = new Child();
        c.print_One();
        c.print_Two();
        c.print_Three();

    }
}
