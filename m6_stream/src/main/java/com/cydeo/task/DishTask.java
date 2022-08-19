package com.cydeo.task;

import static java.util.Comparator.comparing;

public class DishTask {

    public static void main(String[] args) {


        //Print all dish's name that has less than 400 calories
        DishData.getAll().stream()
                .filter(dish -> dish.getCalories() <400 )
            //    .map(dish -> dish.getName())
                .map(Dish::getName)
                .forEach(System.out ::println);


        //Print the length of the name of each dish
        DishData.getAll().stream()
    //            .map(dish -> dish.getName())
                .map(Dish::getName)
    //            .map(dish -> dish.length())
                .map(String::length)
                .forEach(System.out ::println);


        //Print three high caloric dish name (>300)
        DishData.getAll().stream()
                .filter(dish -> dish.getCalories() > 300)
                .map(Dish::getName)
                .limit(3)
                .forEach(System.out::println);


        //Print all dish name that are below 400 calories in sorted

            // Stream<String> dishStream =  DishData.getAll().stream()
        DishData.getAll().stream()
                .filter(dish -> dish.getCalories() < 400)
                .sorted(comparing(Dish::getCalories))
                .map(Dish::getName)
                .forEach(System.out::println);




    }


}
/*


        //Print all dish's name that has less than 400 calories

        //Print the length of the name of each dish

        //Print three high caloric dish name (>300)

        //Print all dish name that are below 400 calories in sorted
 */
