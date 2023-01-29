package com.company.lambda.apple;

import com.company.lambda.apple.Apple;

@FunctionalInterface  //because only one (abstract) method created here
public interface ApplePredicate {

    public abstract boolean test(Apple apple);


}
