package com.example.arrayex1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by user on 2017-03-06.
 */


public class MainActivity1 extends AppCompatActivity {

    Button button;
//
    //String [] names = new String[5];

    String[] names = {"als","dkaf","adf","asdf","adf"};
    int count =0;
    Person person1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//
//        names[0] ="신";
//        names[1] ="김";
//        names[2] ="박";
//        names[3] ="민";
//        names[4] ="송";

        button = (Button)findViewById(R.id.btn01);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                if(count < names.length) {
//                    person1 = new Person(names[count]);
//                    Toast.makeText(getApplication(), names[count] + "이 만들어졌습니다!", Toast.LENGTH_LONG).show();
//                    count++;
//                } else{
//                    Toast.makeText(getApplication(),"만들수 없습니다",Toast.LENGTH_LONG).show();
//                }

                if (count < names.length){
                    person1 = new Person(names[count]);
                    Toast.makeText(getApplicationContext(),names[count],Toast.LENGTH_LONG).show();
                }
            }
        });


    }
}