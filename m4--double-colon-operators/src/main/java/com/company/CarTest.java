package com.company;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class CarTest {
    public static void main(String[] args) {


        //Zero Argument Constructor(in application we do not meet with this usually, but good to know)

        Supplier<Car> c1 = () -> new Car();  //Lambda can be replaced with method reference(Double Colon)
        System.out.println(c1.get().getModel());

        Supplier<Car> c2 = Car :: new;      //because which keyword representing the constructor: new keyword
        System.out.println(c2.get().getModel());

        //One Argument Constructor

        Function<Integer, Car> f1 = model -> new Car(model);  //Lambda can be replaced with method reference
        Function<Integer, Car> f2 = Car :: new;

        //Two Argument Constructor
        //          make    model   return
        BiFunction<String, Integer, Car> b =( make,model) -> new Car(make, model); //Lambda can be replaced with method reference
        BiFunction<String, Integer, Car> b1 = Car :: new;
        b1.apply("Honda", 2015);


    }
}
