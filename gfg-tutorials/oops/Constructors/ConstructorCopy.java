package Oops.Constructors;

/**
 * 
 * Unlike other constructors copy construtor is passed with another object which
 * copies the data available from the passed object to the newly created object.
 * 
 */

class CopyCTR {

    String name;
    int id;

    CopyCTR(String name, int id) {
        this.name = name;
        this.id = id;
        System.out.println("called first constructor");
    }

    CopyCTR(CopyCTR obj2) {
        this.name = obj2.name;
        this.id = obj2.id;
        System.out.println("called first constructor");
    }

}

public class ConstructorCopy {

    public static void main(String args[]) {
        CopyCTR ctr1 = new CopyCTR("First Name", 32);
        System.out.println("ctr1 name: " + ctr1.name + " ctr1 id: " + ctr1.id);

        CopyCTR ctr2 = new CopyCTR(ctr1);
        System.out.println("ctr2 name: " + ctr2.name + " ctr2 id: " + ctr2.id);

    }

}
