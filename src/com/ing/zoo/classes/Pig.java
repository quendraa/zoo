package com.ing.zoo.classes;

import java.util.Random;

import com.ing.zoo.interfaces.Carnivore;
import com.ing.zoo.interfaces.Herbivore;
import com.ing.zoo.interfaces.Performer;

public class Pig extends Animal implements Carnivore, Herbivore, Performer {

    public Pig(String name) {
        this.name = name;
        this.helloText = "oink oink";
    }

    @Override
    public void sayHello() {
        super.sayHello();
    }

    @Override
    public void eatLeaves() {
        System.out.println("munch munch oink");
    }

    @Override
    public void eatMeat() {
        System.out.println("nomnomnom oink thx");
    }

    @Override
    public void performTrick() {
        Random random = new Random();
        int rnd = random.nextInt(2);
        String trick = rnd == 0 ? "rolls in the mud" : "runs in circles";

        System.out.println(trick);
    }
}
