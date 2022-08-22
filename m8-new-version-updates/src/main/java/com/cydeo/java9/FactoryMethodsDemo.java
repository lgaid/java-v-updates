package com.cydeo.java9;

import java.util.*;

public class FactoryMethodsDemo {

    public static void main(String[] args) {

        // Creating unmodified  List before Java 9
        List<String> courses = Collections.unmodifiableList(Arrays.asList("Java", "Python", "Agile"));

        courses.add("TS");
        System.out.println(courses);


        // Creating unmodified  List AFTER Java 9
        List<String> myCourses = Collections.unmodifiableList(Arrays.asList("Java", "Python", "Agile"));


        // Creating unmodifiable Map List AFTER Java 9
        Map<String, Integer> myCart = Map.ofEntries(
        Map.entry("Samsung TV",1),
                Map.entry("PSP",1),
                Map.entry("Chair",5)
        );


















    }



}
