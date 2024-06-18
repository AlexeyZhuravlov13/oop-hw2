package org.example.modifiers;

public class Child extends Parent {

    @Override
    public void doSomething(){
        System.out.println("I am just a kid");
        super.doSomething(); // or just doSomething() because different names
    }

    public void print(){
        System.out.println(super.protectedLastName);
        System.out.println(super.publicName);
        System.out.println(super.packagePrivateFatherName);
        System.out.println(super.privateAge);
    }
}
