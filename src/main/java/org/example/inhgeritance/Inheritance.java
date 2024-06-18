package org.example.inhgeritance;

/*
2. Наследование:
 Задача: Создайте родительский класс с методом и класс-наследник, который наследует этот метод. Попробуйте вызвать метод из класса-наследника.
 */
public class Inheritance {

    public static void main(String[] args) {
        Child child = new Child();
        child.callParent();
        child.doSomething();
    }
}

