package com.ing.zoo.classes;

import com.ing.zoo.interfaces.Herbivore;

public class Zebra extends Animal implements Herbivore {

    public Zebra(String name) {
        this.name = name;
        this.helloText = "zebra zebra";
    }

    @Override
    public void sayHello() {
        super.sayHello();
    }

    @Override
    public void eatLeaves() {
        System.out.println("munch munch zank yee bra");
    }
}
