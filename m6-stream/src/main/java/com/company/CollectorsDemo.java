package com.company;

import com.company.tasks.dishTask.Dish;
import com.company.tasks.dishTask.DishData;
import com.company.tasks.dishTask.Type;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsDemo {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3, 4, 5, 6, 6, 7);

        //** toCollection(Supplier): is used to create a Collection using Collector
       List<Integer> numberList = numbers.stream()
                .filter(x-> x%2 == 0)
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(numberList);

        Set<Integer> numberSet = numbers.stream()   //Set= no duplication allowed
                .filter(x -> x%2==0)
                .collect(Collectors.toCollection(HashSet::new));
        System.out.println(numberSet);
        System.out.println("---------------------------------------------------------------");

        //** toList: to return a collector interface that gathers the input data into a new List
        List<Integer> numberList2 = numbers.stream()
                .filter(x-> x%2 == 0)
                .collect(Collectors.toList());
        System.out.println(numberList2);

        //** toSet: return into a set
        Set<Integer> numberSet2 = numbers.stream()
                .filter(x-> x%2 == 0)
                .collect(Collectors.toSet());
        System.out.println(numberSet2);

        System.out.println("----------------------------------------------------------");

        //toMap(Function, Function): returns a Collector interface that gathers the input data into a new map
        //        key      value

       Map <String, Integer> dishMap = DishData.getAll().stream()
                .collect(Collectors.toMap(Dish::getName, Dish::getCalories));
       //                                    my key            my value
        System.out.println(dishMap);

        System.out.println("----------------------------------------------------------");

        //summingInt(ToIntFunction) : returns a collector that produces the sum of an Integer-valued function
        int sum = DishData.getAll().stream()
                .collect(Collectors.summingInt(Dish::getCalories));
        System.out.println(sum);

        System.out.println("----------------------------------------------------------");

        //counting(): returns a Collector that counts the number of the elements
        Long evenCount = numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.counting());
        System.out.println(evenCount);

        System.out.println("----------------------------------------------------------");

        //averagingInt(ToIntFunction): returns the average of the integers passed values
        Double calorieAverage = DishData.getAll().stream()
                .collect(Collectors.averagingInt(Dish::getCalories));
        System.out.println(calorieAverage);


        System.out.println("----------------------------------------------------------");

        //joining(): is used to join various elements of a character or string array into a single object

        List<String> courses = Arrays.asList("Java", "JS", "TS");
        String str = courses.stream()
                .collect(Collectors.joining(","));
        System.out.println(str);

        System.out.println("----------------------------------------------------------");

        //partitioningBy(): is used to partition a stream of objects(or a set of elements) based on

        Map<Boolean, List<Dish>> veggieDish = DishData.getAll().stream()
                .collect(Collectors.partitioningBy(Dish::isVegetarian));
        System.out.println(veggieDish);

        System.out.println("----------------------------------------------------------");

        //groupingBy(): is used for grouping objects by some property and storing results in a Map instance

        Map<Type, List<Dish>> dishType = DishData.getAll().stream()
                .collect(Collectors.groupingBy(Dish::getType));
        System.out.println(dishType);
    }
}
