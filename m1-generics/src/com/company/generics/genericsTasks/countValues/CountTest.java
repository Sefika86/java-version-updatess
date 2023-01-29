package com.company.generics.genericsTasks.countValues;

import java.util.Arrays;
import java.util.List;

public class CountTest {
    public static void main(String[] args) {

        List<Integer> ci = Arrays.asList(1, 2, 3, 4);
        int count = countIf(ci, new OddPredicate());
        System.out.println("Number of odd integers = " + count);

    }

    //countIf method needs to be generic, because it should accept
    //any class we create like Odd Predicate or Even predicate or Prime Predicate etc.
    //our method's parameter must belong to UnaryPredicate to be able to accept
    //ant Type(T) to create any object here

    public static <T> int  countIf(List<T> c, UnaryPredicate<T> p){

        int count =0;
        for(T element : c){
            if(p.test(element)){
                ++count;
            }
        }
        return count;
    }

}

/**
 Write a generic method to count the number of elements in a collection that
 have a specific property (for example, odd integers, prime numbers).
 Use following interface in your solution as well:

 Sample output:
 public interface UnaryPredicate<T> {
 public boolean test(T obj);
 }

 List<Integer> ci = Arrays.asList(1, 2, 3, 4);
 int count = countIf(ci, new OddPredicate());
 System.out.println("Number of odd integers = " + count);
 */


