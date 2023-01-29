package com.company.generics.genericsTasks.countValues;

public class OddPredicate implements UnaryPredicate<Integer> {

    @Override
    public boolean test(Integer obj) {
        return obj % 2 != 0;
    }
}
