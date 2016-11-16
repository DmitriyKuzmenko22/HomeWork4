package com.company;


public class Animal {

    private boolean vegetarian;
    private String eats;
    private int noOfLegs;

    public Animal(){

    }


    public Animal(boolean vegetarian, String eats, int noOfLegs) {
        this.vegetarian = vegetarian;
        this.eats = eats;
        this.noOfLegs = noOfLegs;
    }

    protected boolean isVegetarian(){
        return vegetarian;
    }

    protected String getEats(){
        return eats;
    }

    protected int getNoOfLegs(){
        return noOfLegs;
    }
}
