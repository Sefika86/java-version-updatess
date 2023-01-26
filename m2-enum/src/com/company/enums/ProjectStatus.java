package com.company.enums;

public enum ProjectStatus {
    OPEN, CLOSED, PROGRESS("IN PROGRESS");

    String status= "aaa";

    ProjectStatus(String status){   //here again you see we have a cons with one parameter ,so we need to assign the constants(objects) here right away
        this.status= status;
    }

    //if I don't want to assign value for some constants then we need to create another cons with no parameter

    ProjectStatus() {

    }

    public void method(){
        System.out.println(status);
    }
}
