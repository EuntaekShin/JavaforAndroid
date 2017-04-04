package com.example.interfaceex;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    EditText edittext1;
    EditText edittext2;
    EditText edittext3;
    EditText edittext4;

    Calculator calculator = new MyCalculator(this);




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 =(Button)findViewById(R.id.btn01);
        button2 =(Button)findViewById(R.id.btn02);
        button3 =(Button)findViewById(R.id.btn03);
        button4 =(Button)findViewById(R.id.btn04);
        button5 =(Button)findViewById(R.id.btn05);
        edittext1 =(EditText) findViewById(R.id.edittext11);
        edittext2 =(EditText) findViewById(R.id.edittext21);
        edittext3 =(EditText) findViewById(R.id.edittext3);
        edittext4 =(EditText) findViewById(R.id.edittext4);


        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String input01 =  edittext1.getText().toString();
                String input02 =  edittext2.getText().toString();
                int value01 = Integer.parseInt(input01);
                int value02 = Integer.parseInt(input02);

                int result = calculator.add(value01,value02);
                edittext3.setText(String.valueOf(result));

                ArrayList<CalcData> history = calculator.getHistory();
                String outStr = "";
                for (int i = 0; i < history.size(); i++) {
                    CalcData curData = history.get(i);
                    outStr += "\n#" + i + " : " + curData.getA() + " , "
                            + curData.getB() + ","
                            + curData.getType() + ", "
                            + curData.getResult();
                }

                edittext4.setText(outStr);
            }

    });

        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String input01 = edittext1.getText().toString();
                String input02 = edittext2.getText().toString();
                int value01 = Integer.parseInt(input01);
                int value02 = Integer.parseInt(input02);
                try {
                    int result = calculator.minus(value01, value02);
                    edittext3.setText(String.valueOf(result));
                }catch (Exception e) {
                    e.printStackTrace();{
                        Toast.makeText(getApplicationContext(),"빰빠바",Toast.LENGTH_LONG).show();
                    }
                }
            }

        });

        button5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                    calculator.clearHistory();
                  reset();
                String input01 =  edittext1.getText().toString();
                String input02 =  edittext2.getText().toString();


            }

        });


    }

    public void reset(){
        edittext4.setText(" ");
        edittext1.setText("");
        edittext2.setText("");
        edittext3.setText("");


    }


}