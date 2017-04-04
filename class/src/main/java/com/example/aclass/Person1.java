package com.example.aclass;

import android.widget.Toast;

/**
 * Created by user on 2017-03-05.
 */

public class Person1 {
    public static int total = 0;
    public String name;
    MainActivity activity;

    public Person1() {

    }

    public Person1(String name1, MainActivity Qactivity) {  //붕어빵에서 찍어낼떄 이미 정해져있는것
        this.name = name1;
        this.activity = Qactivity;
        activity.imageview.setImageResource(R.drawable.person);
        Toast.makeText(activity.getApplicationContext(), name1 + "가 등록되었습니다",
                Toast.LENGTH_LONG).show();
    }


        public void walk(int speed) {

            Toast.makeText(activity.getApplicationContext(),  name+ " 가 " + speed + " km 로 걷습니다 ", Toast.LENGTH_LONG).show();
            activity.imageview.setImageResource(R.drawable.person_walk);
        }

    public void run(int speed) {
        Toast.makeText(activity.getApplicationContext(),  name+ "가" + speed + " km 로 뜁니다 ", Toast.LENGTH_LONG).show();
        activity.imageview.setImageResource(R.drawable.person_run);

    }

    public void cry(){
        Toast.makeText(activity.getApplication(),"사람인" +name +"이(가) 웁니다.",Toast.LENGTH_LONG).show();
    }
}
