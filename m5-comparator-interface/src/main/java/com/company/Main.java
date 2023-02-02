package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10,0,15,5,20);
        Collections.sort(list);  // this is only giving us ascending option
        System.out.println(list);

        //Beh. Parameterization
        Collections.sort(list, new MyComparator());  //descending by overloading the sort method with different parameters
        System.out.println(list);

        //After Java8: LAMBDA:
        Collections.sort(list, ((o1,o2) -> (o1>o2) ? -1 : (o1<o2) ? 1 : 0));
        System.out.println(list);

        System.out.println("--------------------------------------------------");

        //Another Java 7 update: compareTo() method
        //Ascending Order
        list.sort((o1,o2) -> o1.compareTo(o2));
        System.out.println(list);


        //Descending order
        list.sort((o2, o1) -> o1.compareTo(o2));
        System.out.println(list);

    }
}
