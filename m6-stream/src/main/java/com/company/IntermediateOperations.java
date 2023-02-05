package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateOperations {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,2,3,4);
    //  list.forEach(System.out::println); //Lambda is replaced with method reference

//IntermediateOperations:
        System.out.println("Filter");
        list.stream()
            .filter(i->i%2==0)    //intermediate operation filter method accepts predicate which accepts boolean
            .forEach(System.out::println);  //2 2 4 //terminal operation


        System.out.println("Distinct");
        Stream<Integer> str = list.stream()  //added the list collections back into stream
                .filter(i -> i%2 ==0)
                . distinct();
        str.forEach(System.out::println);  //2 4


        System.out.println("Limit");
        list.stream()
                .filter(i-> i%2==0)
                .limit(1)
                .forEach(System.out::println); //2


        System.out.println("Skip");
        list.stream()
                .filter(i -> i%2==0)
                .skip(1)
                .forEach(System.out::println); //2 4


        System.out.println("Map");
        list.stream()  //1 2 2 3 4
                .map(i -> i * 2)  //2 4 4 6 8
                .filter(i-> i % 3 == 0) //6
                .forEach(System.out::println);  //type the result : 6







    }
}
