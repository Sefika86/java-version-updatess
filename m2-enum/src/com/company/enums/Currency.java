package com.company.enums;

public enum Currency {

    //public static final CurrencyDemo PENNY = new CurrencyDemo();  instead of writing this way we create an enum

    //everything we are putting in this special type of class(enum), are a constant object

    PENNY(1),  //how we read this: PENNY is a constant obj of Currency class
    NICKLE(5), //NICKLE is an object of Currency class
    DIME(10),
    QUARTER(25);   //; is not mandatory only if you won't type anything below

    private int value;

    Currency(int value){
        this.value=value;
    }

    public int getValue() {
        return value;
    }


}
