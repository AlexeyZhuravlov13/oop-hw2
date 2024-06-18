package org.example.encapsulation;

public class Main{
    public static void main(String[] args) {
        Encapsulation encapsulation = new Encapsulation();
        //encapsulation.name = "a"; //error java: name has private access in org.example.encapsulation.Encapsulation
        encapsulation.setName("a"); // ok
    }
}
