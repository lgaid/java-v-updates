package com.cydeo.Task;

import javax.sound.midi.Soundbank;
import java.util.List;

public class EmployeeTest {

    public static void main(String[] args) {



        // Print all emails
        System.out.println("Print All Emails: ");

        EmployeeData.readAll()
                .map(Employee::getEmpEmail)
                .forEach(System.out::println);

        // Print all phone number

        System.out.println("Print All Phone Numbers");
        EmployeeData.readAll()
                .map(Employee::getEmpPhoneNumbers)
                .flatMap(List::stream)
                .forEach(System.out::println);







    }


}
