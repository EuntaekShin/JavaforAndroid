package com.example.classex2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;
    Button button1;
    EditText editText;
    EditText editText2;
    Singer singer1;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=(Button)findViewById(R.id.button);
        button1=(Button)findViewById(R.id.button1);
        editText=(EditText)findViewById(R.id.edittext);
        editText2=(EditText)findViewById(R.id.edittext2);
        text=(TextView)findViewById(R.id.text);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                String name = editText.getText().toString();
                String age1 = editText2.getText().toString();
                int age = Integer.parseInt(age1);


                boolean button3 = button.isClickable();
                boolean button4 = button1.isClickable();

                if (button3) {
                    CreateSinger(name,age);

                }

                Singer.total++;
                text.setText(Singer.total+"명");

            }
        });


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = editText.getText().toString();
                String age1 = editText2.getText().toString();
                int age = Integer.parseInt(age1);


                boolean button3 = button.isClickable();
                boolean button4 = button1.isClickable();

                if(button4){
                    CreateManSinger(name,age);
                }

                Singer.total++;
                text.setText(Singer.total+"명");

            }
        });

    }// of OnCreate



    void CreateSinger(String name, int age ){
        singer1 = new Singer(name,age,this);
    }

    void CreateManSinger(String name, int age ){
        singer1 = new ManSinger(name,age,this);
    }





}//of class
