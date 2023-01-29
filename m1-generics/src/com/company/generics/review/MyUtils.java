package com.company.generics.review;

import java.util.List;

public class MyUtils <T> {  // I can also limit my generics by doing;
                            // <T extends AParentClassWhichExtendedByChildClasses>

    //if you want to use the same data type for all methods then we don't need to apply
    //generics in each method, just add generics <T> one time only in the class signature

    public static <T> void printInfo2(List<T> list) {
        for (T item : list) {
            System.out.println(item);
        }
        System.out.println(list.size());
    }




    //write a method that takes a list and returns the last item of the list
    public T getLastItem(List<T> list){   //return type is E as well
        return list.get(list.size()-1);
    }

}

/**
 *As u see we do not need to add generics in our methods now because we already add in our clASS LEVEL
 * AND METHODS SHOULDN'T BE STATIC
 * BECAUSE WE WILL CREATE OBJ AND CALL THESE METHODS THROUGH THEIR NAMES IN OUR MAIN METHOD
 */