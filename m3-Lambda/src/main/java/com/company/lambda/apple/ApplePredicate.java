package com.company.lambda.apple;

@FunctionalInterface  //because only one (abstract) method created here
public interface ApplePredicate {

    public abstract boolean test(Apple apple);


}
