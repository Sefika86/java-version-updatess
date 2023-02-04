package com.company.task2_lessThan400Calories;

import lombok.AllArgsConstructor;
import lombok.Data;


@AllArgsConstructor
@Data
public class Dish {
    private String name;
    private boolean vegetarian;
    private int calories;
    private Type type;

}
