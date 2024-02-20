package com.OJ;

public class Dog extends Animal{

    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        if (speed.equalsIgnoreCase("slow"))
            System.out.println(getExplicitType() + " is walking");
        else
            System.out.println(getExplicitType() + " is running!");
    }

    @Override
    public void makeNoise() {
        // if (type == "wolf") always prints 'Woofs!' from the main method even though the type I typed is 'Wolf'
        if (type.equalsIgnoreCase("wolf")) // instead of -> if (type.toLowerCase().equals("wolf"))
            System.out.println("Howling!");
        else
            System.out.println("Woofs!");
    }
}
