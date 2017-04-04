package com.example.funcex2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    FrameLayout frame;
    EditText editText;
    int touchCount =0;
    Button btn01;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frame=(FrameLayout)findViewById(R.id.frame);
        editText=(EditText)findViewById(R.id.editText);
        btn01=(Button) findViewById(R.id.btn01);

        btn01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });



        frame.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
               if(event.getAction() == MotionEvent.ACTION_DOWN){
                   touchCount++;
                   editText.setText("클릭횟수 :" + touchCount);
               }

                return true;
            }
        });
    }

//    private void touchIncrease(){
//        touchCount = touchCount+1;
//    }
//    private void TouchShow(){editText.setText("Cllicked Number :" + touchCount);
//    }

   void touchIncrese(){
       touchCount = touchCount+1;
   }

   void touchShow(){

       editText.setText("터치한 횟수 "+ touchCount);
   }

}

