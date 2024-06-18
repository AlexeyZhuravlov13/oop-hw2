package org.example;


import org.example.modifiers.Parent;

public class ProtectedModifierTest extends Parent {
    public static void main(String[] args) {
        ProtectedModifierTest protectedModifierTest = new ProtectedModifierTest();

        System.out.println(protectedModifierTest.protectedLastName);
        System.out.println(protectedModifierTest.publicName);
        System.out.println(protectedModifierTest.packagePrivateFatherName);
        System.out.println(protectedModifierTest.privateAge);
    }
}
