package com.ing.zoo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.ing.zoo.classes.Animal;
import com.ing.zoo.classes.Eagle;
import com.ing.zoo.classes.Elephant;
import com.ing.zoo.classes.Hippo;
import com.ing.zoo.classes.Lion;
import com.ing.zoo.classes.Pig;
import com.ing.zoo.classes.Tiger;
import com.ing.zoo.classes.Zebra;
import com.ing.zoo.interfaces.Carnivore;
import com.ing.zoo.interfaces.Herbivore;
import com.ing.zoo.interfaces.Performer;

public class Zoo {
    public static void main(String[] args) {
        // animals
        List<Animal> animals = new ArrayList<>();
        animals.add(new Lion("Henk"));
        animals.add(new Hippo("Elsa"));
        animals.add(new Pig("Dora"));
        animals.add(new Tiger("Wally"));
        animals.add(new Zebra("Marty"));
        animals.add(new Eagle("Eddie"));
        animals.add(new Elephant("Dumbo"));

        // commands
        String[] commands = new String[4];
        commands[0] = "hello";
        commands[1] = "give leaves";
        commands[2] = "give meat";
        commands[3] = "perform trick";

        // try-with-resources in order to close the scanner once we're done with it
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter your command (hello, give leaves, give meat, perform trick):");
            String input = scanner.nextLine();

            if (!Arrays.asList(commands).contains(input)) {
                System.out.println("Command not found");
                return;
            }

            System.out.print("Enter the animal's name (leave blank for all animals): ");
            String name = scanner.nextLine();

            executeCommand(input, animals, name);
        }
    }

    private static void executeCommand(String command, List<Animal> animals, String name) {
        switch (command) {
            case "hello":
                handleHelloCommand(animals, name);
                break;
            case "give leaves":
                handleGiveLeavesCommand(animals, name);
                break;
            case "give meat":
                handleGiveMeatCommand(animals, name);
                break;
            case "perform trick":
                handlePerformTrickCommand(animals, name);
                break;
        }
    }

    private static void handleHelloCommand(List<Animal> animals, String name) {
        for (Animal animal : animals) {
            if (name.isEmpty() || animal.getName().equals(name)) {
                animal.sayHello();
            }
        }
    }

    private static void handleGiveLeavesCommand(List<Animal> animals, String name) {
        for (Animal animal : animals) {
            if ((name.isEmpty() || animal.getName().equals(name)) && animal instanceof Herbivore) {
                ((Herbivore) animal).eatLeaves();
            } else if (!name.isEmpty() && animal.getName().equals(name)) {
                System.out.println("I don't eat leaves. Give me some meat!");
            }
        }
    }

    private static void handleGiveMeatCommand(List<Animal> animals, String name) {
        for (Animal animal : animals) {
            if ((name.isEmpty() || animal.getName().equals(name)) && animal instanceof Carnivore) {
                ((Carnivore) animal).eatMeat();
            } else if (!name.isEmpty() && animal.getName().equals(name)) {
                System.out.println("I don't eat meat. Give me some leaves!");
            }
        }
    }

    private static void handlePerformTrickCommand(List<Animal> animals, String name) {
        for (Animal animal : animals) {
            if ((name.isEmpty() || animal.getName().equals(name)) && animal instanceof Performer) {
                ((Performer) animal).performTrick();
            } else if (!name.isEmpty() && animal.getName().equals(name)) {
                System.out.println("I don't perform tricks. Just give me some food instead!");
            }
        }
    }
}