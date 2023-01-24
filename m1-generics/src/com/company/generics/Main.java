package com.company.generics;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        /*

        ArrayList items1=new ArrayList();  //raw type(without generics)
        for (Object each : items1) {
           // System.out.println(each*2);  //why compile error because each is object it cannot multiply by 2 we need to cast.
            System.out.println((Integer) each*2);
        }

         */
    //Before java 5 updates , people had to cast manually


        ArrayList<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        // items.add("apple");


        printDoubled(items);

        System.out.println("---------------------------------------------------------------------");


        FootballPlayer joe = new FootballPlayer("Joe");  //Joe applied for joining into football team


        BaseballPlayer pat = new BaseballPlayer("Pat");  //Pat applied for joining into baseball team


        SoccerPlayer beckham = new SoccerPlayer("Beckham");  //Beckham applied for joining into soccer team

        Team<SoccerPlayer> liverpool = new Team("Liverpool");
        //liverpool.addPlayer(joe);  compile error because
        //liverpool.addPlayer(pat);
        liverpool.addPlayer(beckham);









    }


    private static void printDoubled(ArrayList<Integer> items) {
        for (Integer i : items) {
            System.out.println( i * 2);
        }
    }
}
