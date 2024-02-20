package com.OJ;

abstract class Mammal extends Animal{

    public Mammal(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        var movement = speed.equalsIgnoreCase("fast")? "running" : "taking a stroll";

        System.out.println(getExplicitType() + " is " + movement);
    }

    public final String shedsHair(){
        return getExplicitType() + " sheds hair in spring";
    }
}

public abstract class Animal {
    protected String type;
    private String size;
    private double weight;

    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    public abstract void move(String speed);

    public abstract void makeNoise();

    public final String getExplicitType(){
        return getClass().getSimpleName() + " (" + type + ")" ;
    }
}
