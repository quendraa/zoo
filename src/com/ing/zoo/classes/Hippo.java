package com.ing.zoo.classes;

import com.ing.zoo.interfaces.Herbivore;

public class Hippo extends Animal implements Herbivore {

    public Hippo(String name) {
        this.name = name;
        this.helloText = "splash";
    }

    @Override
    public void sayHello() {
        super.sayHello();
    }

    public void eatLeaves() {
        System.out.println("munch munch lovely");
    }
}
