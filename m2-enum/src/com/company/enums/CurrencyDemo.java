package com.company.enums;



public class CurrencyDemo {

    public static final CurrencyDemo PENNY = new CurrencyDemo();
    public static final CurrencyDemo NICKLE = new CurrencyDemo();
    public static final CurrencyDemo DIME = new CurrencyDemo();
    public static final CurrencyDemo QUARTER = new CurrencyDemo();

    //these are constant objects, how I know== they are final
    // for example here I am able to create CurrencyDemo() objects by default cons
    //but in an enum; we do not need to creat an object, those NICKEL, PENNY, MULTIPLY etc. are already objects

}
