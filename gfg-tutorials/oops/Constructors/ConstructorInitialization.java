package Oops.Constructors;

/**
 * 
 * we will not define constructor then defaul constructor will called.
 * constructor name will always same as class name
 * 
 */
class ConstructorInitialization {

    ConstructorInitialization() {
        System.out.println("constructor called");
    }

    public static void main(String args[]) {
        ConstructorInitialization con = new ConstructorInitialization();
    }
}
