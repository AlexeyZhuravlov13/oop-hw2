package org.example;

import org.example.modifiers.Child;

public class ModifierTest {
    public static void main(String[] args) {
        Child child = new Child();

        System.out.println(child.protectedLastName);
        System.out.println(child.publicName);
        System.out.println(child.packagePrivateFatherName);
        System.out.println(child.privateAge);
    }
}
