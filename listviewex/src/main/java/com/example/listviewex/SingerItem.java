package com.example.listviewex;

/**
 * Created by user on 2017-03-10.
 */

public class SingerItem {
    String name;
    String age;
    int resId;

    public SingerItem(String Inname, String Inage, int InresId) {
        this.name = Inname;
        this.age = Inage;
        this.resId = InresId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public int getResId() {
        return resId;
    }

    public void setResId(int resId) {
        this.resId = resId;
    }
}
