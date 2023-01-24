package com.company.enums;

public class Main {

    public static void main(String[] args) {

        System.out.println("How to access a constant");

        Currency c = Currency.DIME;
        System.out.println(c);   //DIME , we didn't get any hashcode even tho we did not override toString method
        //that means toString is already overridden somewhere?

        System.out.println("--------------------------------------------------------------------------------");

        System.out.println("How to get constants all together");

        Currency[] currencies = Currency.values();   //we did not create a value() method in Currency, where it comes from?

        for (Currency currency : currencies) {
            System.out.println(currency);
        }

        //where these toString and value() methods came from?
        //Enum may implement many interfaces but can not extend any class because it internally extends Enum class(java.lang.Enum).

        System.out.println("-------------------------------------------------------------------------------------------");


        System.out.println("How to use switch-case with enums");

        Currency myCurrency = Currency.QUARTER;   //why we said quarter here?????????
        switch (myCurrency) {
            case PENNY:
                System.out.println("It is 1 cent");
                break;
            case NICKLE:
                System.out.println("It is 5 cent");
                break;
            case DIME:
                System.out.println("It is 10 cent");
                break;
            case QUARTER:
                System.out.println("It is 25 cent");
                break;
        }


        System.out.println("-------------------------------------------------------------------------------------------");

        System.out.println("Operation Task");

        calculate(3, 5, Operation.PLUS);

        System.out.println("-------------------------------------------------------------------------------------------");

        System.out.println("How to retrieve the constant value");
        System.out.println(Currency.PENNY.getValue());
        System.out.println(Currency.QUARTER.getValue());
        System.out.println(Currency.QUARTER.ordinal());  //3 index


        System.out.println("-------------------------------------------------------------------------------------------");

        Apple apple = new Apple(5); //as you see we can create a class object
        //BUT FOR ENUMS THAT'S different
        //look at the currency enum, if you create a parameterized cons, we need to assign a value to those constants  PENNY(1),



    }

    private static void calculate(double x, double y, Operation operation) {

        switch (operation) {
            case PLUS:
                System.out.println(x + y);
                break;
            case MINUS:
                System.out.println(x - y);
                break;
            case MULTIPLY:
                System.out.println(x * y);
                break;
            case DIVIDE:
                System.out.println(x / y);
                break;
            //now go up in to main again
        }
    }

}
