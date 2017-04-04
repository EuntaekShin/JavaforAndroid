package com.example.aclass;

import android.widget.Toast;

/**
 * Created by user on 2017-03-05.
 */

public class Baby extends Person1{

        public Baby(){

        }

    public Baby(String inName, MainActivity inactivity){
        name=inName;
        activity=inactivity;

        activity.imageview.setImageResource(R.drawable.baby);
        Toast.makeText(activity.getApplicationContext(), name + "가 등록되었습니다",
                Toast.LENGTH_LONG).show();
    }

    public void cry() {
        activity.imageview.setImageResource(R.drawable.baby_cry);
        Toast.makeText(activity.getApplication(),name +" 가 웁니다",Toast.LENGTH_LONG).show();
    }
}

