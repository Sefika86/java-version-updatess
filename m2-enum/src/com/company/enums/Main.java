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




    }
}
