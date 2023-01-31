package com.company.lambda;

import com.company.lambda.apple.Apple;
import com.company.lambda.apple.ApplePredicate;

public class FunctionalInterface {

    public static void main(String[] args) {


        ApplePredicate ap = new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getWeight() > 200;
            }
        };
//this is called Anonymous Class, but we are not using it anymore because we use LAMBDA.






    }
}
