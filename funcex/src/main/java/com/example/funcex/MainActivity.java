package com.example.funcex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    EditText editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         editText =(EditText)findViewById(R.id.editText);
         editText2 =(EditText)findViewById(R.id.editText2);

        FrameLayout frame= (FrameLayout) findViewById(R.id.frame);

        frame.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN) {

                    float x=event.getX();
                    float y=event.getY();
                    editText.setText(String.valueOf(x));
                    editText2.setText(String.valueOf(y));

                }
                return true;
            }
        });

    }
}
