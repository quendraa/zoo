package com.ing.zoo.classes;

public abstract class Animal {
    public String name;
    public String helloText;

    public void sayHello() {
        System.out.println(helloText);
    }

    public String getName() {
        return name;
    }
}