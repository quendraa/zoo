package com.ing.zoo.classes;

import com.ing.zoo.interfaces.Carnivore;

public class Lion extends Animal implements Carnivore {

    public Lion(String name) {
        this.name = name;
        this.helloText = "roar";
    }

    @Override
    public void sayHello() {
        super.sayHello();
    }

    public void eatMeat() {
        System.out.println("nomnomnom thx mate");
    }
}
