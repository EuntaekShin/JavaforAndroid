package com.example.arrayex1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;
    String name01 ="철수";
    String name02 ="영희";
    String name03 ="수지";
    String name04 ="민";
    String name05 ="철";

    int count =0;
    Person person1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
