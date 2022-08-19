package com.cydeo.task;


import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {


    // Predicate<Integer> pred = (p) -> p%2 == 0 ? true : false;
        // interview quest. how does lambda work?

        Calculate sum = (x,y) -> System.out.println( x + y);
                            //or
        Calculate s1 = (x,y) -> Calculator.findSum(x,y);

        // Reference to a Static method
       Calculate s2 = Calculator::findSum;
       s2.calculate(10,20);

       // Reference to a instance method

        Calculator obj = new Calculator();
        Calculate s3 = obj ::findMultiply;

        Calculate s4 = new Calculator() ::findMultiply;

        BiFunction<String, Integer, String> func = (str, i) -> str.substring(i); // we can use because?

        Function<Integer,Double> b = new MyClass() :: method;

        BiFunction<MyClass, Integer, Double> b1 = MyClass::method;

        Consumer<Integer> display = i -> System.out.println(i);
        Consumer<Integer> display2 = System.out::println;
















    }

}
