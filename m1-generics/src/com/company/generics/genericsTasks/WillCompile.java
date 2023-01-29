package com.company.generics.genericsTasks;

import java.util.List;

public class WillCompile {

   /*
    Will the following method compile? If not, why?

    yes, it will compile because all Integer, Double ets. classes extend Number Class (java. lang package)
    ,so <? extends Number> support any of those classes, so no compile error
 */

    public static void print(List<? extends Number> list) {
        for (Number n : list) {
            System.out.println(n + " ");
            System.out.println();
        }
    }
}