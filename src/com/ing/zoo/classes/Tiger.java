package com.ing.zoo.classes;

import java.util.Random;

import com.ing.zoo.interfaces.Carnivore;
import com.ing.zoo.interfaces.Performer;

public class Tiger extends Animal implements Carnivore, Performer {

    public Tiger(String name) {
        this.name = name;
        this.helloText = "rraaarww";
    }

    @Override
    public void sayHello() {
        super.sayHello();
    }

    @Override
    public void eatMeat() {
        System.out.println("nomnomnom oink wubalubadubdub");
    }

    @Override
    public void performTrick() {
        Random random = new Random();
        int rnd = random.nextInt(2);
        String trick = rnd == 0 ? "jumps in tree" : "scratches ears";

        System.out.println(trick);
    }
}
