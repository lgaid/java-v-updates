package com.cydeo.tasks.p1;

import com.cydeo.Apples;
import com.cydeo.Color;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        List<Apples> inventory = new ArrayList<>();

        inventory.add(new Apples(300, Color.GREEN));
        inventory.add(new Apples(80, Color.RED));

        ApplePredicate2 applePredicate2 = (Apples apples) -> {
            String s;
            if (apples.getWeight() > 200) {
                s = " A Heavy " + apples.getColor() + " apple";
            }else {
                s = " A Light " + apples.getColor() + " apple";
            }
            return s;
        };

        prettyPrintApple(inventory, applePredicate2);

        prettyPrintApple(inventory,(Apples apples) -> "An apple of "+ apples.getWeight() + "g" );


    }

    public static void prettyPrintApple(List<Apples> inventory, ApplePredicate2 applePredicate2 ) {
        for (Apples apple : inventory) {
            String output = applePredicate2.test(apple);
            System.out.println(output);

        }
    }
}
/*
Write a prettyPrintApple method that takes aList of Apples and that can be
parameterized with multiple ways to generate a String output from an apple
public static void prettyPrintApple(List<Apple> inventory, ???){
for(Apple apple : inventory){
String output = ???.???(apple);
System.out.println(output);
}
}

Sample Output :
A Light GREEN apple
A Heavy RED apple
A Light GREEN apple

Sample Output :
An apple of 80g
An apple of 155g
An apple of 120g
 */