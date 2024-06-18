package org.example.encapsulation;
/*
Практика:
1. Инкапсуляция:
 Задача: Создайте класс с приватным полем и публичным методом для доступа к этому полю. Попробуйте изменить поле напрямую и через метод.
 */

public class Encapsulation {
    private String name;

    public void setName(String name) {
        this.name = name;
    }
}