package com.company;

public class Eagle extends Bird {

    private Eagle(){

    }

    int lengthWings;

    public Eagle(int lengthWings) {
        this.lengthWings=lengthWings;
    }


    public String getEagle(){
        return "* Какая длина крыльев? *" +lengthWings+ ".м*";
    }
}
