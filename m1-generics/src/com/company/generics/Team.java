package com.company.generics;

import java.util.ArrayList;
import java.util.List;

public class Team <T extends Player> {  //If we write <T> only that means any class(String, Integer...) is accepted
                                         //but <T extends Player> accepts only players, (basically looking for Player type)

    private String name;
    private List<T> members = new ArrayList<T>();
    //if there was here <Player> instead of T I was able to put all kind of players in the same team which is not normal
    //,but when I apply Generics(with T)--> Team<SoccerPlayer> liverpool = new Team("Liverpool");
    //I can create any team, not open to all kind of classes anymore because of <T extends Player>
    //and if I write <T> beside Class Team above, it accepts all classes --> Team< String>.......which we do not want
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
