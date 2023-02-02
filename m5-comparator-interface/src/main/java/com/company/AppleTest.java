package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;

public class AppleTest {
    public static void main(String[] args) {


        List<Apple> inventory = new ArrayList<>();
       
        inventory.add(new Apple(Color.GREEN, 300));
        inventory.add(new Apple(Color.RED, 100));
        inventory.add(new Apple(Color.GREEN, 200));
        inventory.add(new Apple(Color.RED, 50));

        Comparator<Apple> sortApple = Comparator.comparing((Apple apple) -> apple.getWeight());
        inventory.sort(sortApple);
        System.out.println(inventory);

        //now shorter codes in java

                       //we imported static java.util.Comparator.comparing, instead of calling the method through the interface name
        inventory.sort(comparing(Apple::getWeight));    //we did in ascending order here
        System.out.println(inventory);

        //there are to many ready functions in this
        //reversed()
        inventory.sort(comparing(Apple::getWeight).reversed());   // in ascending order by using reverse()
        System.out.println(inventory);

        //Chaining
        inventory
                .sort(comparing(Apple::getWeight)
                .reversed().thenComparing(Apple::getColor));


    }
}