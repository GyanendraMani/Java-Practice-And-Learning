package oops.Constructors;

/**
 * 
 * Constructor overloading also similar to method overloading .
 * Constructor name will always same but number of parameters or type of
 * parameter must not be same.
 * When we instatiat the class object and we will pass parameter according to
 * that contructor will excute.
 * 
 */

class CtrOverLoading {
    String name;
    int age;

    CtrOverLoading() {
        System.out.println("Default constructor called");
    }

    CtrOverLoading(String name) {
        this.name = name;
        System.out.println("Called contructoe with name ");
    }

    CtrOverLoading(int age) {
        this.age = age;
        System.out.println("Called contructoe with age " + age);
    }

    CtrOverLoading(String name, int age) {
        this.age = age;
        System.out.println("Called contructoe with age " + age);
    }

}

public class ConstructorOverloading {
    public static void main(String args[]) {

        CtrOverLoading ctr = new CtrOverLoading();
        CtrOverLoading ctr2 = new CtrOverLoading("ramesh");
        CtrOverLoading ctr3 = new CtrOverLoading(23);
        CtrOverLoading ctr4 = new CtrOverLoading("Rama", 23);
    }
}
