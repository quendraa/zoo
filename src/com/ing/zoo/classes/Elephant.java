package com.ing.zoo.classes;

import com.ing.zoo.interfaces.Herbivore;
import com.ing.zoo.interfaces.Performer;

public class Elephant extends Animal implements Herbivore, Performer {

    public Elephant(String name) {
        this.name = name;
        this.helloText = "Trumpet tutu";
    }

    @Override
    public void sayHello() {
        super.sayHello();
    }

    @Override
    public void performTrick() {
        System.out.println("Elephant is spraying water with its trunk");
    }

    @Override
    public void eatLeaves() {
        System.out.println("Elephant is eating leaves");
    }
}
