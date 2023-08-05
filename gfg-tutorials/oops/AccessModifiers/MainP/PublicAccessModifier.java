package oops.AccessModifiers.MainP;

import oops.AccessModifiers.p1.*;

/**
 * 
 * The public access modifier is specified using the keyword public.
 * The public access modifier has the widest scope among all other access
 * modifiers.
 * Class, methods or data members that are decleared as public are accessible
 * from everywhere in the program.
 * If class access modifier is publc then file must have same as class name.
 * 
 */

public class PublicAccessModifier {

    public static void main(String args[]) {
        PublicAccessModifier1 p = new PublicAccessModifier1();
        p.display();

    }

}
