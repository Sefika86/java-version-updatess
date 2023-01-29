package com.company.lambda.apple;

import java.util.ArrayList;
import java.util.List;

public class AppleTest {

    public static void main(String[] args) {


        List<Apple> inventory = new ArrayList<Apple>();
        inventory.add(new Apple(Color.GREEN, 300));
        inventory.add(new Apple(Color.RED, 100));
        inventory.add(new Apple(Color.GREEN, 200));
        inventory.add(new Apple(Color.RED, 50));



        AppleHeavyPredicate abc = new AppleHeavyPredicate();
        List<Apple> heavyApple = filterApples(inventory, abc); //can do this way
        System.out.println(heavyApple);

        //OR

                                                        //here we actually did polymorphism:
                                                        //ApplePredicate a = new AppleGreenPredicate();
        List<Apple> greenApple = filterApples(inventory, new AppleGreenColorPredicate()); //or this way to create an object

        System.out.println(greenApple);

        System.out.println("-------------------------------------------------------");

//After Java 8; Lambda Expression==> no need to create implementing classes
//directly come to main method and apply Lambda Expression

        ApplePredicate weightApple = (Apple apple) -> apple.getWeight() > 200;
        filterApples(inventory, weightApple);

        //or

        filterApples(inventory,(Apple apple) -> apple.getWeight() > 200);

        //even we do not need Data type: Apple and () if only one parameter passing:

        filterApples(inventory, apple -> apple.getWeight() > 200);

        System.out.println(filterApples(inventory, apple -> apple.getWeight() > 200));







    }
                                        //if I put here a parameter as AppleGreenColorPredicate
                                        //that means this method will function only for that behavior
                                        //,but I want this method to work for all classes that implement the main interface
                                        //which is ApplePredicate interface

    private static List<Apple> filterApples(List<Apple> inventory, ApplePredicate applePredicate ){
        List<Apple> result = new ArrayList<>();

        for(Apple apple : inventory){
            if(applePredicate.test(apple)){
                result.add(apple);
            }
        }
        return result;
    }
}
