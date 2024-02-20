package com.OJ;

import org.w3c.dom.html.HTMLObjectElement;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {

//        Animal animal = new Animal("Wolf", "Big", 100); -> 'Animal' is abstract; cannot be instantiated

        Dog dog = new Dog("Wolf", "big", 100.00);
        dog.makeNoise();

        doAnimalStuff(dog); //It's an animal, so it can go in that Animal parameter

        System.out.println("-".repeat(20));
        ArrayList<Animal> animals = new ArrayList<>(); //benefit of inheritance - we don't need to create two arraylists to hold both our animals (Fish and Dog)

        animals.add(dog);
        animals.add( new Dog("BullDog", "big", 140));
        animals.add(new Fish("Tilapia", "small", 15));
        animals.add(new Dog("Golden Retriever", "medium", 120));
        animals.add(new Fish("Cat fish", "big", 75));
        animals.add(new Horse("Cadastyle", "large", 1000));

        for (Animal animal : animals){
            doAnimalStuff(animal);

            if (animal instanceof Mammal mammalAnimal){
                mammalAnimal.shedsHair();
            }
        }
    }

    private static void doAnimalStuff(Animal animal){
        animal.makeNoise();
        animal.move("fast");
    }

}

