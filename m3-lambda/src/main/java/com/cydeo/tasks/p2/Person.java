package com.cydeo.tasks.p2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString

public class Person {


  private String name;
  private int age;
  private Gender gender;


}
/*
Suppose that you are creating a social networking application. You want to
create a feature that enables an administrator to perform any kind of action,
such as sending a message, on members of the social networking application
that satisfy certain criteria.

Criteria : Send message to Male Members whose age is between 18 and 25
 */