package com.OJ;

public class Fish extends Animal{

    public Fish(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        if (speed.equalsIgnoreCase("slow"))
            System.out.println(getExplicitType() + " is lazily swimming");
        else
            System.out.println(super.getExplicitType() + " is darting frantically!");
    }

    @Override
    public void makeNoise() {
        // if (type == "wolf") always prints 'Woofs!' from the main method even though the type I typed is 'Wolf'
        if (type.equalsIgnoreCase("Goldfish")) // instead of -> if (type.toLowerCase().equals("wolf"))
            System.out.println("Swish!");
        else
            System.out.println("Splash!");


    }
}
