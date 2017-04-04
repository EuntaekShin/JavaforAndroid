package com.example.arrayex1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by user on 2017-03-06.
 */
public class MainActivity3 extends AppCompatActivity {

    String[][] phonebook = new String[2][5];
    Person person1;


    Button button;

    String name01 ="철수";
    String name02 ="영희";
    String name03 ="수지";
    String name04 ="민";
    String name05 ="철";

    int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] frindeds = {"철수","영희","유리","꾸리","뽀리"};
        String[] famailly = {"건우","누나","유리","엄마","아빠"};

        phonebook[0] =frindeds;
        phonebook[1] = famailly;



        //버튼 파트
        button = (Button)findViewById(R.id.btn01);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (count==0 ){
                    person1 = new Person(name01);
                    Toast.makeText(getApplicationContext(), name01 + "가(이) 만들어졌습니다",Toast.LENGTH_LONG).show();
                }
                else if(count ==1){
                    person1 = new Person(name02);
                    Toast.makeText(getApplicationContext(), name02 + "가(이) 만들어졌습니다",Toast.LENGTH_LONG).show();
                }
                else if(count ==2){
                    person1 = new Person(name03);
                    Toast.makeText(getApplicationContext(), name03 + "가(이) 만들어졌습니다",Toast.LENGTH_LONG).show();
                }
                else if(count ==3){
                    person1 = new Person(name04);
                    Toast.makeText(getApplicationContext(), name04 + "가(이) 만들어졌습니다",Toast.LENGTH_LONG).show();
                }
                else if(count ==4){
                    person1 = new Person(name05);
                    Toast.makeText(getApplicationContext(), name05 + "가(이) 만들어졌습니다",Toast.LENGTH_LONG).show();
                }
                count++;
            }
        });


    }
}
