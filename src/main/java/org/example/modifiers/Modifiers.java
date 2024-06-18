package org.example.modifiers;

public class Modifiers {
    public static void main(String[] args) {
        Child child = new Child();

        System.out.println(child.protectedLastName);
        System.out.println(child.publicName);
        System.out.println(child.packagePrivateFatherName);
        System.out.println(child.privateAge);
    }
}
