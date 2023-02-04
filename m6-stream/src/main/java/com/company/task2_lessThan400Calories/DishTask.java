package com.company.task2_lessThan400Calories;

import java.util.Comparator;

import static java.util.Comparator.comparing;

public class DishTask {

    public static void main(String[] args) {

        //Print all dish's name that has less than 400 calories


        DishData.getAll().stream()
                .filter(dish-> dish.getCalories()<400)
              //  .map(dish -> dish.getName())
                .map(Dish::getName)
                .forEach(System.out::println);


        //Print the length of the name of each dish

        DishData.getAll().stream()
                .map(dish->dish.getName().length())
                .forEach(System.out::println);

        //Print any three high calorie dish names (>300)

        DishData.getAll().stream()
                .filter(dish -> dish.getCalories() > 300)
                .map(Dish::getName)
                .limit(3)
                .forEach(System.out::println);

        System.out.println("------------------------------------------------------");
        //Print all dish name that are below 400 calories in sorted

        DishData.getAll().stream()
                .filter(dish -> dish.getCalories() < 400)
             //   .sorted(Comparator.comparing(dish -> dish.getCalories()))
             //   .sorted(Comparator.comparing(Dish::getCalories))
                .sorted(comparing(Dish::getCalories))  //if we remove the Comparator, we need to import it
                .map(Dish::getName)
                .forEach(System.out::println);

//be careful! if we had put map() before sorted(), then we had the names only so we could not sort based on calories



    }
}
