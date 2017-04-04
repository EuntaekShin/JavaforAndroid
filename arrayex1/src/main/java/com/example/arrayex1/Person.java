package com.example.arrayex1;

/**
 * Created by user on 2017-03-06.
 */

public class Person {

    String name;
    int age;



    public Person(){

    }
    public Person(String InName){
        name=InName;
    }

    public Person(String InName, int InAge){

        name=InName;
        age =InAge;
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
