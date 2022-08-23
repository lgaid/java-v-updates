package com.cydeo.task2;

import javax.crypto.spec.OAEPParameterSpec;
import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;

public class TraderTest {


    public static void main(String[] args) {



// Find all transactions in the year 2011 and sort them by value(small to high)
        TraderDataGenerator.getAll().stream()
                .filter(transaction -> transaction.getYear() == 2011)
                .sorted(comparing(Transaction::getValue))
                .forEach(System.out::println);


//  What are all the unique cities where the traders work?
        TraderDataGenerator.getAll().stream()
                .map(transaction -> transaction.getTrader().getCity())
                .distinct()
                .forEach(System.out::println);


//  Find all traders from Cambridge and sort them by name.
        TraderDataGenerator.getAll().stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equals("Cambridge"))
                .distinct()
                .sorted(comparing(Trader::getName))
                .forEach(System.out::println);

// Return a string of all traders’ names sorted alphabetically
        String sortedTraderNames = TraderDataGenerator.getAll().stream()
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .sorted()
                .reduce(" ",(a1,a2) -> a1 + a2 + " ");
        System.out.println(sortedTraderNames);



//  Are any traders based in Milan?
        boolean milan = TraderDataGenerator.getAll().stream()
                .anyMatch(transaction -> transaction.getTrader().getCity().equals("Milan"));

        System.out.println(milan);


//  Print the values of all transactions from the traders living in Cambridge.
        TraderDataGenerator.getAll().stream()
                .filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
                .map(Transaction::getValue)
                .forEach(System.out::println);


// What is the highest value of all the transactions?

        Optional<Integer> highest = TraderDataGenerator.getAll().stream()
              .map(Transaction::getValue)
              .reduce(Integer::max);
        System.out.println(highest);



// Find the transaction with the smallest value.

        Optional<Integer> smallest = TraderDataGenerator.getAll().stream()
                .map(Transaction::getValue)
                .reduce(Integer::min);
        System.out.println(smallest);







    }



}


