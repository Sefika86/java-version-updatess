package com.company.terminalOperations;

import com.company.tasks.dishTask.Dish;
import com.company.tasks.dishTask.DishData;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Reducing {

    public static void main(String[] args) {


        System.out.println("...............................................");
        //MIN
        Optional<Dish> dMin = DishData.getAll().stream().min(Comparator.comparing(Dish::getCalories));
        System.out.println(dMin.get());


        System.out.println("...............................................");
        //MAX
        Optional<Dish> dMax = DishData.getAll().stream().max(Comparator.comparing(Dish::getCalories));
        System.out.println(dMax.get());

        System.out.println("...............................................");
        //REDUCE

        List<Integer> numbers = Arrays.asList(3,4,5,9);

        int result = numbers.stream().reduce(0,(a,b)->a+b);
        System.out.println(result);
        //or without starting point
        Optional<Integer> result2 = numbers.stream().reduce((a,b)->a+b);
        System.out.println(result2.get()); //3+4+5+9=21

        //Find the total number of calories in Dish List

        int totalCalories = DishData.getAll().stream()
                .map(Dish::getCalories)
                .reduce(0,(a,b)->a+b); //see below ex for replaced with method reference

        System.out.println("totalCalories = " + totalCalories);

        System.out.println("--------------------------------------------------------");
        //with double colon operator
        Optional<Integer> min = numbers.stream().reduce(Integer::min);
        Optional<Integer> max = numbers.stream().reduce(Integer::max);
        Optional<Integer> sum = numbers.stream().reduce(Integer::sum);

        System.out.println("min = " + min.get());  //do not forget to use get() when you use Optional class
        System.out.println("max = " + max.get());
        System.out.println("sum = " + sum.get());


    }
}
