package com.company;

@FunctionalInterface  //this is not mandatory but if no compile error that means its func. interface
public interface Calculate {
    void calculate(int x, int y);
}
