package com.example.classex2;

import android.widget.Toast;

/**
 * Created by user on 2017-03-06.
 */

public class Singer {

    public static int total =0;

    String name;
    int age;

    MainActivity activity;

    public Singer(){

    }

    public Singer(String inname, int inage,MainActivity inactivity){
        name = inname;
        activity = inactivity;
        age = inage;
        Toast.makeText(activity.getApplicationContext(), "추가된 가수 이름 : " + name + " 나이 " + age + " 입니다", Toast.LENGTH_LONG).show();

    }

}
