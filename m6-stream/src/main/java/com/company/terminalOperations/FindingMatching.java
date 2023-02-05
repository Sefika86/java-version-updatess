package com.company.terminalOperations;

import com.company.tasks.dishTask.Dish;
import com.company.tasks.dishTask.DishData;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class FindingMatching {

    public static void main(String[] args) {

        System.out.println("....................allMatch()...................");
        //returns boolean, true,  if all elements in the stream matching the given predicate)
        boolean isHealthy = DishData.getAll().stream().allMatch(dish -> dish.getCalories() < 1000);
        System.out.println(isHealthy);


        System.out.println("....................anyMatch()....................");
        if (DishData.getAll().stream().anyMatch(Dish::isVegetarian)) {
            System.out.println("The menu is vegetarian friendly");
        }

        System.out.println("....................noneMatch()....................");
        boolean isHealthy2 = DishData.getAll().stream().noneMatch(dish -> dish.getCalories() >= 1000);
        System.out.println(isHealthy2);


        System.out.println("....................findAny()....................");
        Optional<Dish> dish =  DishData.getAll().stream().filter(Dish::isVegetarian).findAny();
        System.out.println(dish.get());


        System.out.println("....................findFirst()....................");
        Optional<Dish> dish2 =  DishData.getAll().stream().findFirst();
        System.out.println(dish2.get());



        //PARALLEL STREAM(ASynchronized)

        System.out.println(IntStream.range(0,100).parallel().findAny());
        System.out.println(IntStream.range(0,100).parallel().findFirst());

        System.out.println("----------------------------------------------------------");

        List<String > list1 = Arrays.asList("Johnny", "David", "Jack", "Duke", "Jill", "Dany", "Julia", "Jenish", "Divya");
        List<String > list2 = Arrays.asList("Johnny", "David", "Jack", "Duke", "Jill", "Dany", "Julia", "Jenish", "Divya");

        Optional<String> findFirst = list1.parallelStream().filter(s->s.startsWith("D")).findFirst();
        Optional<String> findAny = list2.parallelStream().filter(s->s.startsWith("J")).findAny();


        System.out.println(findFirst.get());  //David
        System.out.println(findAny.get());  //Jill


    }
}
