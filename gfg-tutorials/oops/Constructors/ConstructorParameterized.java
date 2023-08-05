package Oops.Constructors;

/**
 * 
 * In parameterized constructor we can pass parameter like methods.
 * We are using this keyword to instantiat the object in the memory
 * When we create object of the class firs constructor will excute once
 * 
 */

class Parameterized {
    String name;
    int Id;

    Parameterized(String name, int Id) {
        this.name = name;
        this.Id = Id;
    }

    void Para() {
        System.out.println("Name = " + name + ", Id = " + Id);
    }
}

public class ConstructorParameterized {
    public static void main(String args[]) {
        Parameterized para = new Parameterized("Gyan", 1);
        para.Para();
    }

}
