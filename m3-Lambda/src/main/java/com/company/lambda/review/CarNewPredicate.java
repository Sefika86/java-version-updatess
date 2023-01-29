package com.company.lambda.review;

public class CarNewPredicate implements CarPredicate{

    @Override
    public boolean test(Car car) {
        return car.getYear() > 2015;
    }
}
