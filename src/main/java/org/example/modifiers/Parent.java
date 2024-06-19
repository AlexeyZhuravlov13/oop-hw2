package org.example.modifiers;

public class Parent {

    public Parent() {
        this.publicName = "publicName";
        this.protectedLastName = "protectedLastName";
        this.packagePrivateFatherName = "packagePrivateFatherName";
        this.privateAge = 99;
    }

    public String publicName;
    protected String protectedLastName;
    String packagePrivateFatherName;
    private int privateAge;
    public void doSomething() {
        System.out.println("Parent doing");
    }
}
