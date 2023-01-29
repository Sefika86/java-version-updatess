package com.company.enums.review;

public enum Unit {

    PCS("pieces"), POUNDS("pounds"), INCHES("inches"), MILES("miles");

    public String value;

    Unit(String value){  //we need this constructor for being able to assign values on constructors
        this.value = value;
    }
}
