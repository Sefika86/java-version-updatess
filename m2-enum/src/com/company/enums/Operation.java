package com.company.enums;

public enum Operation {

    PLUS, MINUS, MULTIPLY, DIVIDE;

    //each constant here are an object of Operation enum.

    private Operation(){
        System.out.println("constructor");   // we have 4 objects in this enum created (PLUS, MINUS, MULTIPLY, DIVIDE)
                                             // so we have 4 constructors executed in main class
    }

    //this constructor never can be public, because we can not call this cons anywhere ,so it should be default or private.


}
