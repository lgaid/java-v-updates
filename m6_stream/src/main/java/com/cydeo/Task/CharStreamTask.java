package com.cydeo.Task;

import java.util.Arrays;
import java.util.List;

public class CharStreamTask {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("JAVA","APPLE","HONDA","DEVELOPER");

        // list.forEach(x-> System.out.println(x));
        // list.forEach(System.out::println);


        words.stream() //Stream <String>
                .map(str -> str.length())
                .forEach(System.out ::println);








    }



}
/*
Given a list of words, print the number of characters for each word.
  List<String> words = Arrays.asList("JAVA","APPLE","HONDA","DEVELOPER");
 */