package com.company.tasks.stateTask;

public class StateTest {
    public static void main(String[] args) {
        StateData.getAllCities().stream()
                .flatMap(city-> city.getCities().stream())
                .forEach(System.out::println);
    }
}
//Suppose we have a State class that contains list of cities. Create a list
//of States and print all the cities.