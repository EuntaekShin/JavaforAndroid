package com.example.intentex;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by user on 2017-03-08.
 */

public class Newactivity extends AppCompatActivity {

    Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newactivity_main);


        button3 = (Button)findViewById(R.id.btn03);
//
//        Intent intent =  getIntent();
//
//        if(intent != null){
//            String loginName =intent.getStringExtra("loginName");
//
//                Toast.makeText(getApplicationContext(), "전달받은 데이터 : " + loginName, Toast.LENGTH_LONG).show();
//            }
//            String name1 = Student.name;
//        int age = Student.age;
//        Toast.makeText(getApplicationContext(),name1+age,Toast.LENGTH_LONG).show();

        Intent intent = getIntent();
        if(intent != null){
          String loginName = intent.getStringExtra("loginName");
            Toast.makeText(getApplicationContext(),loginName,Toast.LENGTH_LONG).show();
        }
        String name =Student.name;
        int age = Student.age;

        Toast.makeText(getApplicationContext(),"이름은 " +name +"나이는 "+age,Toast.LENGTH_LONG).show();


        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent();
//                intent.putExtra("Return","Ryan");
//                setResult(1,intent);
//
//                finish();

                Intent intent = new Intent();
                intent.putExtra("Return","Ryan");
                setResult(1,intent);
                finish();

            }
        });

    }
}
