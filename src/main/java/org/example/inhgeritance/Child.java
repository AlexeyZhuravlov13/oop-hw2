package org.example.inhgeritance;

public class Child extends Parent {
    public void callParent(){
        System.out.println("I am just a kid");
        super.doSomething();
    }

    @Override
    public void doSomething(){
        System.out.println("I am just a kid");
        super.doSomething(); // or just doSomething() because different names
    }
}
