package com.example.intent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Stack;
import java.util.concurrent.ConcurrentLinkedQueue;
/*

intent를 통해 전달하고
화면을 보여줄때 startActivity를 사용

intent란 무엇인가?
화면을 띄우는건 우리가 관리하는것이아니라 안드로이드 os가 관리하는것.

intet라는 변수상자를 보내면 안드로이드 시스템이 이해하는것.




 */

public class MainActivity extends AppCompatActivity {

    Button button;
    Button button2;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    EditText edittext;
    Stack<Integer> stack = new Stack<Integer>();
    ConcurrentLinkedQueue<Integer> queue = new ConcurrentLinkedQueue<Integer>();
    int count =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(),"On create 작동함",Toast.LENGTH_LONG).show();

        button = (Button)findViewById(R.id.btn01);
        button2 = (Button)findViewById(R.id.btn02);
        button4 = (Button)findViewById(R.id.btn04);
        button5 = (Button)findViewById(R.id.btn05);
        button6 = (Button)findViewById(R.id.btn06);
        button7 = (Button)findViewById(R.id.btn07);
        button8 = (Button)findViewById(R.id.btn08);
        edittext=(EditText)findViewById(R.id.edittext);



        //setting first button
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"));
                startActivity(intent);

            }
        });//end of button

        //setting second (통화 앱)
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:6474583717"));
                startActivity(intent);


            }
        });//end of button




        //우리가 만든 화면을 띄울때
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               Intent intent = new Intent(getApplicationContext(), Newactivity.class);
                intent.putExtra("loginName", "Crystal");

                User.Name ="My Mike";

                startActivityForResult(intent, 1);//새로운 화면에서 다시 전달을 받


            }
        });//end of button



        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stack.push(count);
                edittext.setText("\n 스택에 추가함 :"+ count);
                count++;

                edittext.append("\n 스택 :" + stack);


            }
        });//end of button

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int outValue = stack.pop();
                edittext.setText("\n 스택에서 가져옴: "+outValue);
                edittext.append("\n 스택:" + stack);

            }
        });//end of button


        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                queue.offer(count);
                edittext.setText("\n 큐에 추가함 :"+ count);
                count++;

                edittext.append("\n 큐 :" + queue);


            }
        });//end of button

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int outValue = queue.poll();
                edittext.setText("\n 큐에서 가져옴: "+outValue);
                edittext.append("\n 큐:" + queue);

            }
        });//end of button


    }//of oncreate

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(getApplicationContext(),"onStop 작동함",Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(),"onDestroy 작동함",Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(getApplicationContext(),"onPause 작동함",Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getApplicationContext(),"onResume 작동함",Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(getApplicationContext(),"onStart 작동함",Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        String name=data.getStringExtra("name");
        Toast.makeText(getApplication(),"새화면에서 받은 데이터" +name,Toast.LENGTH_LONG).show();

    }
}//of class
