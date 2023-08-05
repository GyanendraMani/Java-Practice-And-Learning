package Oops.AccessModifiers.MainP;

import Oops.AccessModifiers.p1.*;

/**
 * 
 * The protected access modifier is specified using the kyword 'protected'.
 * The methods or data members are accessible within the same package or
 * subcleasses in defferent packages.
 * 
 */

 class ProtectedModifier extends ProtectedModifier1 {
 public static void main(String args[]){
    ProtectedModifier p = new ProtectedModifier();
    p.display();
 }
}
