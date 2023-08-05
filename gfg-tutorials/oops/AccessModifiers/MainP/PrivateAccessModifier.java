package oops.AccessModifiers.MainP;

/**
 * 
 * The private access modifiers is specified using private.
 * Method and data members accessible only within the class in whitch they are
 * decleard.
 * private means "only visible within the enclosing class".
 * protecte means "only visible within the enclosing class and any subclasses"
 * Hence these modifiers in terms of application to classes, apply only to
 * nested classes and not on top-level classes.
 * 
 */

class A {
    private void display() {
        System.out.println("called display method inside a class");
    }

    public void toCallDisplay() {
        display();
    }
}

class PrivateAccessModifier {

    public static void main(String args[]) {
        A a = new A();
        a.toCallDisplay();
    }

}
