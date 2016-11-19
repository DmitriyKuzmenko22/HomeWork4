package com.company;

public class Eagle extends Bird {

    private Eagle(){

    }

    int lengthWings;
 boolean isBeatiful;

    public Eagle(boolean vegetarian, String eats, int noOfLegs, String type, int lengthWings, boolean isBeatiful) {
        super(vegetarian, eats, noOfLegs, type);
        this.lengthWings = lengthWings;
        this.isBeatiful = isBeatiful;
    }

    public Eagle(int lengthWings, boolean isBeatiful) {
        this.lengthWings = lengthWings;
        this.isBeatiful = isBeatiful;
    }

    protected Eagle(int lengthWings) {
        this.lengthWings=lengthWings;
    }


    public String getEagle() {
        return "* Какая длина крыльев? *" +lengthWings+ ".м*";
    }
}
