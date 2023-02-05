package com.company.tasks;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareOfNumbers {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> result = numbers.stream()
        .map(i -> i * i)
        .collect(Collectors.toList());
        System.out.println(result);

    }
}

/*
Given a list of numbers how would you return a list of the square of each
number? For example, given [1,2,3,4,5] you should return [1,4,9,16,25]
 */