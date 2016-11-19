package com.company;


public class Shark extends Fish {
    boolean smellOfBlood;
boolean isBeautiful;
    
    private Shark(){

    }

    public Shark(boolean vegetarian, String eats, boolean underwaterBreathing, boolean smellOfBlood, boolean isBeautiful) {
        super(vegetarian, eats, underwaterBreathing);
        this.smellOfBlood = smellOfBlood;
        this.isBeautiful = isBeautiful;
    }

    public Shark(boolean smellOfBlood) {
   this.smellOfBlood=smellOfBlood;

    }



    public String getSmellOfBlood() {
        return  "* " + "Любит кровь ? - *" + smellOfBlood+ "* " + "Сколько конечностей ? - *" ;
    }



       public Shark(boolean vegetarian, String eats, int noOfLegs, boolean smellOfBlood) {
//        this.vegetarian=vegetarian;
//        this.eats=eats;
//        this.noOfLegs = noOfLegs;
        this.smellOfBlood = smellOfBlood;
        this.smellOfBlood = smellOfBlood;
    }
}
