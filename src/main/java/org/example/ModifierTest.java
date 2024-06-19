package org.example;

import org.example.modifiers.Child;
// import org.example.modifiers.Introvert; -  don't have access, not public

public class ModifierTest {
    public static void main(String[] args) {
        Child child = new Child();

        // System.out.println(child.protectedLastName); - error
        System.out.println(child.publicName);
        // System.out.println(child.packagePrivateFatherName); - error
        // System.out.println(child.privateAge); - error

        System.out.println("->>> introvert");
         // Introvert introvert = new Introvert(); -  don't have access, not public
        // System.out.println(introvert.protectedLastName);
        // System.out.println(introvert.publicName);
        // System.out.println(introvert.packagePrivateName);
        //System.out.println(introvert.privateAge); -- error
    }
}
