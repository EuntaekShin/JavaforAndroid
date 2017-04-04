package com.example.array;

/**
 * Created by user on 2017-03-06.
 */

public class Person {
    String name;
    int age;

   public Person(){

    }
    public Person(String inname){
        name=inname;

    }


    public Person(String inname , int inage){
        name=inname;
        age = inage;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
