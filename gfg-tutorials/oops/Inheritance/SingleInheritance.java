package Oops.Inheritance;

import java.io.*;
import java.lang.*;
import java.util.*;

class One {
    public void print_first_name(String firstName) {
        System.out.println(firstName + "");
    }
}

class Two extends One {
    public void print_last_name(String lastName) {
        System.out.println(lastName);
    }
}

public class SingleInheritance {
    public static void main(String[] args) {

        Two t = new Two();
        t.print_first_name("Gyanendra Mani");
        t.print_last_name("Mishra");

    }
}
