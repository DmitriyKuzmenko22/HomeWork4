package com.company;


public class Shark extends Fish {
    boolean smellOfBlood;

    private Shark(){

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
