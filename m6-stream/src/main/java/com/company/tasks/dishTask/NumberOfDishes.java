package com.company.tasks.dishTask;

import java.util.stream.Collectors;

public class NumberOfDishes {

    public static void main(String[] args) {


        //How would you count the number of dishes in a stream using the map and reduce methods

        int result = (int) DishData.getAll().stream()
                .map(Dish::getName)
                .count();
        System.out.println(result);

    }
}
