package com.cydeo.task.p2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MemberTest {

    public static void main(String[] args) {



        Person p1 = new Person("Al",25,Gender.MALE);
        Person p2 = new Person("Lucy",42,Gender.FEMALE);
        Person p3 = new Person("Kat",13,Gender.FEMALE);
        Person p4 = new Person("Philip",19,Gender.MALE);


        List<Person> personList = Arrays.asList(p1, p2, p3, p4);


        CheckMember checkMember = p -> p.getGender() == Gender.MALE && p.getAge() >= 18 && p.getAge() <= 25;

        print(personList,checkMember);

        print(personList,p -> p.getGender() == Gender.MALE && p.getAge() >=18 && p.getAge() <= 25);




    }
    private static void print(List<Person> personList, CheckMember checkMember){
        List<Person> result = new ArrayList<>();

        for (Person person : personList) {
            if (checkMember.test(person)) {
                result.add(person);
            }
        }
        System.out.println(result);
    }

}
