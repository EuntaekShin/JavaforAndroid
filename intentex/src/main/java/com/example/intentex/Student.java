package com.example.intentex;

/**
 * Created by user on 2017-03-07.
 */

public class Student {
   public static String name;
   public static int age;

    Student(){

    }
    Student(String inName){
        name=inName;
    }
    Student(String inName, int inAge){
        name = inName;
        age = inAge;
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
