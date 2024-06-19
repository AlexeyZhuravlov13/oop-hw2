package org.example.modifiers;

public class Modifiers {
    public static void main(String[] args) {
        Child child = new Child();
        System.out.println("->>> child");
        System.out.println(child.protectedLastName);
        System.out.println(child.publicName);
        System.out.println(child.packagePrivateFatherName);
        //System.out.println(child.privateAge); -- error
        System.out.println("->>> introvert");
        Introvert introvert = new Introvert();
        System.out.println(introvert.protectedLastName);
        System.out.println(introvert.publicName);
        System.out.println(introvert.packagePrivateName);
        //System.out.println(introvert.privateAge); -- error
    }
}
