package com.cydeo;

import com.cydeo.task.Dish;
import com.cydeo.task.DishData;

import java.util.*;
import java.util.stream.IntStream;

public class FindingMatching {

    public static void main(String[] args) {


        System.out.println("All Match");
        boolean isHealthy = DishData.getAll().stream().allMatch(dish -> dish.getCalories() <1000);
        System.out.println(isHealthy);

        System.out.println("Any Match");
        if (DishData.getAll().stream().anyMatch(Dish::isVegetarian)){
            System.out.println("The menu is vegetarian friendly");
        }

        System.out.println("NONE MATCH");
        boolean isHealthy2 = DishData.getAll().stream().noneMatch(dish -> dish.getCalories() >= 1000);
        System.out.println(isHealthy2);

        System.out.println("FIND ANY");
        Optional<Dish> dish = DishData.getAll().stream().filter(Dish::isVegetarian).findAny();
        System.out.println(dish.get());

        System.out.println("First Find");
        Optional<Dish> dish2 = DishData.getAll().stream().filter(Dish::isVegetarian).findFirst();
        System.out.println(dish2.get());

        //Parallel Streams(Async)
        System.out.println(IntStream.range(0,100).parallel().findAny());
        System.out.println(IntStream.range(0,100).parallel().findFirst());


        List<String> list1 = Arrays.asList("Jil", "Ali", "Carol", "Kat", "Daniel", "Lucy", "Anna", "Philip", "Fawzy");
        List<String> list2 = Arrays.asList("Jil", "Ali", "Carol", "Kat", "Daniel", "Lucy", "Anna", "Philip", "Fawzy");
//        Optional<String> findFirst = list1.parallelStream().filter(s -> s.startsWith("D")).findFirst();
//        Optional<String> findAny = list2.parallelStream().filter(s -> s.startsWith("J")).findAny();

        Optional<String> findFirst = list1.stream().filter(s -> s.startsWith("D")).findFirst();
        Optional<String> findAny = list2.stream().filter(s -> s.startsWith("J")).findAny();

        System.out.println(findFirst.get());
        System.out.println(findAny.get());


        System.out.println("Min");
        Optional<Dish> dMin = DishData.getAll().stream().min(Comparator.comparing(Dish::getCalories));
        System.out.println(dMin.get());

        System.out.println("Max");
        Optional<Dish> dMax = DishData.getAll().stream().max(Comparator.comparing(Dish::getCalories));
        System.out.println(dMax);












    }



}
