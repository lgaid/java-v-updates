package com.cydeo;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class CarTest {


    public static void main(String[] args) {


        // Zero Argument Constructor
        Supplier<Car> c1 = () -> new Car();
        System.out.println(c1.get().getModel());

        Supplier<Car> c2 = Car :: new;

        //One argument constructor

        Function<Integer, Car> f1 = model -> new Car();

        // Two argument constructor

        BiFunction<String, Integer, Car> f3 = Car :: new;

        Car honda = f3.apply("Honda", 2015);

        System.out.println(honda.getMake() + " "+ honda.getModel());



    }



}
