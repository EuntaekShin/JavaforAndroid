package com.example.aclass;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edittext;
    Button button;
    Button button2;
    Button button3;
    Button button4;
    public ImageView imageview;
    Person1 person1;
    Baby baby01;
    RadioButton radioButton;
    RadioButton radioButton2;
    TextView textview3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        edittext = (EditText) findViewById(R.id.edittext);
        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        imageview = (ImageView) findViewById(R.id.img);
        radioButton =(RadioButton)findViewById(R.id.radio1);
        radioButton2 =(RadioButton)findViewById(R.id.radio2);
        textview3 = (TextView)findViewById(R.id.text3);




        button.setOnClickListener(new View.OnClickListener() {


            @Override

            public void onClick(View v) {
                String name = edittext.getText().toString();
                boolean cheked=radioButton.isChecked();

                if(cheked){
                    createName(name);
                } else {
                    createBaby(name);
                }
               // imageview.setImageResource(R.drawable.person);
                Person1.total++;
                textview3.setText(Person1.total +" 명");
                imageview.setVisibility(View.VISIBLE);
                }

            });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                person1.walk(10);


            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                person1.run(10);

            }
        });



     button4.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (person1 != null) {
                if (person1 instanceof Baby) {
                    Baby baby1 = (Baby) person1;
                    baby1.cry();
                } else {
                    //Toast.makeText(getApplicationContext(), "베이비가 아닙니다.", Toast.LENGTH_LONG).show();
                    person1.cry();
                }
            }
        }
    });

}

  void createName(String name) {
       person1 = new Person1(name, this);
   }

   void createBaby(String name){
     person1 = new Baby(name, this);
//    }
}








}

