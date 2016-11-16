package com.company;


public class Fish extends Animal {
    boolean underwaterBreathing;
    public Fish() {
    }

    public Fish(boolean vegetarian, String eats, boolean underwaterBreathing) {
        super(vegetarian, eats, 0);
                this.underwaterBreathing=underwaterBreathing;

    }
}


