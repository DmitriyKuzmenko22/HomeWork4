package com.company;

public class Сow extends Mammal{

    private Сow(){

    }

    boolean hoof;


    public Сow(boolean vegetarian, String eats, int noOfLegs,boolean hoof ) {
        super(vegetarian, eats, noOfLegs);

        this.hoof=hoof;
    }


    public String getCow(){
        return "*. Есть копыта? -*"+hoof+"*";
    }

    public Сow(int noOfLegs,boolean hoof){

        this.hoof=hoof;
    }
}
