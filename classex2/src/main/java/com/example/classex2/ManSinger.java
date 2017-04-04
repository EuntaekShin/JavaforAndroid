package com.example.classex2;

import android.widget.Toast;

/**
 * Created by user on 2017-03-06.
 */

public class ManSinger extends Singer {


    ManSinger(){

    }

    public ManSinger(String lname,int lage, MainActivity lactivity){
        name = lname;
        activity = lactivity;
        age =lage;
        Toast.makeText(activity.getApplication(),"추가된 남자 가수 이름 : " + name + " 나이 " + age + " 입니다",Toast.LENGTH_LONG).show();
    }


}
