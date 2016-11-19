package com.company;

public class Main {

    public static void main(String[] args) {
 Shark shark1=new Shark(true);
 Shark shark2=new Shark(false);
 Shark shark3=new Shark(false,"Водорослями",0,true);

Fish fish1=new Fish(true,"malkov",true);
        System.out.println(" Под водой дышат? *"+fish1.underwaterBreathing+"* ");

Eagle orel1=new Eagle(5);
Eagle orel2=new Eagle(10);
Eagle vorobey=new Eagle(true," ",2," ",2,true);

        System.out.println(vorobey.isBeatiful + " " + vorobey.type);

        Сow cow1=new Сow(false,"Тигр",4,false);
        Сow cow3=new Сow(true," vse est", 4,false,true);
        System.out.println("Test " +cow3.horns+ " " + cow3.hoof+" ");

        Сow ww2=new Сow(6,true);

        System.out.println(shark1.getSmellOfBlood());
        System.out.println("* Ну а кровь же она любит? *"+shark3.smellOfBlood+"* ");
        System.out.println("* Любит кровь?- " + shark2.smellOfBlood);

        System.out.println(orel1.getEagle());
       System.out.println(". Какая длина крыльев ?"+orel2.lengthWings+"м.");

        System.out.println(cow1.getCow());
        System.out.println(ww2.hoof);

//        Account c1=new Account();
//Account c2=new Account(3222);
//Account c3=new Account(0,2);
//
//
//System.out.println("c2.getId()= "+c2.getId());
//System.out.println("c2= "+c2);
//System.out.println("c3= "+c3);
//
//System.out.println("c3.getId()+c3.getAmount()=  "+c3.getId()+c3.getAmount());
    }
}
