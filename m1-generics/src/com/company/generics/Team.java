package com.company.generics;

import java.util.ArrayList;
import java.util.List;

public class Team <T> {  //If we write <T> only that means any class(String, Integer...) is accepted
                         //,but <T extends Player> accepts

    private String name;
    private List<T> members = new ArrayList<T>();


    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public boolean addPlayer(T player){
        if(members.contains(player)){
            System.out.println( ((Player)player).getName() + " is already on the team");
            return false;
        }else{
            members.add(player);
            System.out.println( ( (Player) player).getName() + " is picked for the team " + this.name);
            return true;
        }
    }


}
