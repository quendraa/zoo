package com.ing.zoo.classes;

import com.ing.zoo.interfaces.Carnivore;
import com.ing.zoo.interfaces.Performer;

public class Eagle extends Animal implements Carnivore, Performer {

    public Eagle(String name) {
        this.name = name;
        this.helloText = "HEEEEEEAAAAA";
    }

    @Override
    public void sayHello() {
        super.sayHello();
    }

    @Override
    public void eatMeat() {
        System.out.println("Eagle is eating meat");
    }

    @Override
    public void performTrick() {
        System.out.println("Eagle is flying a loop");
    }

}
