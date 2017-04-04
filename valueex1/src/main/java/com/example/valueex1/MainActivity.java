package com.example.valueex1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.R.id.edit;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    EditText editText2;
    EditText editText3;
    EditText editText4;
    EditText editText5;
    EditText editText6;

    Button btn01;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText =(EditText)findViewById(R.id.editText);
        editText2 =(EditText)findViewById(R.id.editText2);
        editText3 =(EditText)findViewById(R.id.editText3);
        editText4=(EditText)findViewById(R.id.editText4);
        editText5=(EditText)findViewById(R.id.editText5);
        editText6=(EditText)findViewById(R.id.editText6);

        btn01=(Button)findViewById(R.id.btn01);



        btn01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String edit1 = editText.getText().toString();
                String edit2 = editText2.getText().toString();
                String edit3 = editText3.getText().toString();

                int editint = Integer.parseInt(edit2);

                editText4.setText("입력된 이름 : " +edit1);
                editText5.setText("입력된 나이 : " +String.valueOf(editint));
                editText6.setText("입력된 주소 : " +edit3);

                Toast.makeText(getApplicationContext(), ("입력된 값 : " + edit1 + " , " + editint + " , " + edit3), Toast.LENGTH_LONG).show();

                if (editint>30){
                    Toast.makeText(getApplicationContext(),"나이가 30살 보다 많습니다",Toast.LENGTH_LONG).show();

                }else {
                    Toast.makeText(getApplicationContext(),"나이가 30살 보다 적습니다",Toast.LENGTH_LONG).show();

                }
         }
       });



    }
}
