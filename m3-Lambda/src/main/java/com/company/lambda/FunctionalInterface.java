package com.company.lambda;

import com.company.lambda.apple.Apple;
import com.company.lambda.apple.ApplePredicate;

import java.util.function.*;

public class FunctionalInterface {

    public static void main(String[] args) {


        ApplePredicate ap = new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getWeight() > 200;
            }
        };
//this is called Anonymous Class, but we are not using it anymore because we use LAMBDA.


//THERE ARE READY FUNCTIONAL INTERFACES IN JAVA:

        System.out.println("************PREDICATE***************");
        Predicate<Integer> lessThan = i -> i<18;
        System.out.println(lessThan.test(20));
//If you click on Ctrl and Predicate together you see the functional interface with its abstract boolean test()

        System.out.println("************CONSUMER***************");
        Consumer<Integer> display = i -> System.out.println(i);
        display.accept(10);
//Consumer does not return anything which is void

        System.out.println("************BI CONSUMER***************");
        BiConsumer<Integer,Integer> addTwo = (x, y) -> System.out.println(x+y);
        addTwo.accept(1,2);
//BiConsumer is void with 2 parameters

        System.out.println("************FUNCTION***************");
        Function<String,String> fun = s -> "Hello " + s;
        System.out.println(fun.apply("Cydeo"));

        System.out.println("************BI FUNCTION***************");
        BiFunction<Integer,Integer,Integer> func = (x1, x2) -> x1+x2;
        System.out.println(func.apply(2,3));
//accepting 2 any type objects(T, U) as parameters and return an object(R)

        System.out.println("************SUPPLIER***************");
        Supplier<Double> randomValue = () -> Math.random();
        System.out.println(randomValue.get());
//does not get any parameter and return something


    }
}
