package com.company.tasks.stateTask;

import com.company.tasks.dishTask.Dish;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StateData {
    public static List<State> getAllCities() {
        return Arrays.asList(
            new State(Arrays.asList("London", "Ilderton", "Kitchner")),
            new State(Arrays.asList("Nicosia", "Waterloo", "Strathroy")),
            new State(Arrays.asList("Brampton", "Statford", "Kingston"))
        );
    }
}