package com.company.lambda.review;

public class CarFastPredicate implements CarPredicate{

    @Override
    public boolean test(Car car) {
        return car.getTooSpeed() > 160;
    }
}
