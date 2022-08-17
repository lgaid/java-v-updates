package com.cydeo;

import java.util.function.*;

public class FunctionalInterface {

    public static void main(String[] args) {


        ApplePredicate ap = new ApplePredicate() {
            @Override
            public boolean test(Apples apples) {
                return apples.getWeight() > 200;
            }
        };

        //***************************PREDICATE************************************

        Predicate<Integer> lesserThan = i -> i < 18;
        System.out.println(lesserThan.test(20));

        //***************************CONSUMER************************************

        Consumer<Integer> display = i -> System.out.println(i);
        display.accept(10);

        //***************************BiCONSUMER************************************

        BiConsumer<Integer,Integer> addTwo =(x,y) -> System.out.println(x+y);
        addTwo.accept(1,2);

        //***************************FUNCTION************************************

        Function<String, String> fun = s -> "Hello "+ s;
        System.out.println(fun.apply("Hello Cydeo"));

        //***************************BiFUNCTION************************************

        BiFunction<Integer, Integer, Integer> func = (x1,x2) -> x1 +x2;
        System.out.println(func.apply(2,3));

        //***************************SUPPLIER************************************
        Supplier<Double> randomValue = () -> Math.random();
        System.out.println(randomValue.get());

















    }




}
