package com.example.intent;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Newactivity extends AppCompatActivity {

    Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newactivity);

        button3 = (Button)findViewById(R.id.btn03);

          Intent intent =  getIntent(); //화면을 받아오는것
            if(intent != null){
               String loginName =intent.getStringExtra("loginName"); //loginName을 받아오는것
                Toast.makeText(getApplicationContext(),"전달받은 데이터 : "+ loginName, Toast.LENGTH_LONG).show();
        }

        //class를 통해서 받아오는것
        Toast.makeText(getApplication(),"Class User안의 이름 : " + User.Name,Toast.LENGTH_LONG).show();

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Clicked Return Button",Toast.LENGTH_LONG).show();
                Intent intent = new Intent();
                intent.putExtra("name", "Ryan");
                setResult(1,intent);//리턴해주는것

                finish();
            }
        });

    }

}
