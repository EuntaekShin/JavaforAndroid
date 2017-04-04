package com.example.classex;

import android.support.annotation.DrawableRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Baby baby;
    Baby baby1;
    Button btn1;
    Button btn2;
    EditText editText;
    EditText editText2;
    RadioButton radio;
    RadioButton radio2;
    ImageView img;
    ImageView img2;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         baby = new Baby();
        baby1 = new Baby();
        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
         img =(ImageView)findViewById(R.id.img1);
         img2 =(ImageView)findViewById(R.id.img2);
        editText = (EditText)findViewById(R.id.edtxt1);
        editText2 = (EditText)findViewById(R.id.edtxt2);
        radio=(RadioButton)findViewById(R.id.radioButton);
        radio2=(RadioButton)findViewById(R.id.radioButton1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = editText.getText().toString();
                String age= editText2.getText().toString();
                baby1 = new Baby(name, age);
                baby = new Baby(name, age);


                if(radio.isChecked()) {
                    img.setImageResource(R.drawable.baby);
                    Toast.makeText(getApplicationContext(), "첫번째아이의 이름 : " + baby.name + "  아이의 나이 : " + baby.age + "살", Toast.LENGTH_LONG).show();
                } else if(radio2.isChecked()) {
                    Toast.makeText(getApplicationContext(), "두번째아이의 이름 : " + baby1.name + "  아이의 나이 : " + baby1.age + "살", Toast.LENGTH_LONG).show();
                }


            }});


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }});




    }
}

class Baby {
    String name;
    String age;

    public Baby(){

    }

    public Baby(String name, String age){
        this.name = name;
        this.age = age;
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
}

