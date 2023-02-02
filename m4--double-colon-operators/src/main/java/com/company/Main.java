package com.company;


import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
    //**how to write a regular Lambda exp:
        Calculate sum = (x, y) -> System.out.println(x + y);


    //**OR you can use the method that already created in calculator class, in your lambda expression
        Calculate s1 = (x, y) -> Calculator.findSum(4, 5);


    //**Or a fancier way; you do not even need write the parameters and fat arrow, Just Use Double Colon::
        Calculate s2 = Calculator::findSum;  //static, so call the method with class name
        s2.calculate(10, 20);


    //** Reference to an instance method:
        Calculator obj = new Calculator();  //we need to create an object first
        Calculate s3 = obj :: findMultiply;  //call the method with object name

        //or

        Calculate s4 = new Calculator() :: findMultiply; //or directly write it here

    //Double Colon with ready interface:
        BiFunction<String, Integer, String> func = (str, i) -> str.substring(i);
        BiFunction<String, Integer, String> func2 = String::substring;
    //substring is an instance method in String class, how we called it with class name???


        //examples with method preferences:
        Function<Integer, Double> b = new MyClass() :: method; //you can either write object(new MyClass()) and use :: and call the method

        BiFunction<MyClass,Integer,Double> b1 = MyClass :: method; //or, you can write the class name in the <> and write directly class name (MyClass) and put :: and call the method

        Consumer<Integer> display = i -> System.out.println(i);  //compile says lambda can be replaced with method reference

        Consumer<Integer> display2 = System.out::println;

    }
}
