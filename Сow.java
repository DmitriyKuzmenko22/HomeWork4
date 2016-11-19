package com.company;

public class Сow extends Mammal{

    private Сow(){

    }

    boolean hoof;
boolean horns;

    protected Сow(boolean vegetarian, String eats, int noOfLegs,boolean hoof ) {
        super(vegetarian, eats, noOfLegs);
        this.hoof=hoof;
    }

    protected Сow(boolean vegetarian, String eats, int noOfLegs, boolean hoof, boolean horns) {
        super(vegetarian, "", noOfLegs);
        this.hoof = hoof;
        this.horns = horns;
    }

    public String getCow(){

        return "*. Есть копыта? -*"+hoof+"*";
    }

    public Сow(int noOfLegs,boolean hoof){
        this.hoof=hoof;
    }
}
