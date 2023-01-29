package com.company.lambda.apple;

public class AppleHeavyPredicate implements ApplePredicate {

    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() > 200;
    }

}
