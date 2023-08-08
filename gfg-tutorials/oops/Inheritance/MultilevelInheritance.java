package Oops.Inheritance;

// import java.io.*;
// import java.lang.*;
// import java.util.*;

class One {
    public void print_first_name(String firstName) {
        System.out.println(firstName);
    }
}

class Two extends One {
    public void print_medle_name(String medleName) {
        System.out.println(medleName);
    }
}

class Three extends Two {
    public void print_last_name(String lastName) {
        System.out.println(lastName);
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Three t = new Three();
        t.print_first_name("Gyanendra");
        t.print_medle_name("Mani");
        t.print_last_name("Mishra");
    }

}
