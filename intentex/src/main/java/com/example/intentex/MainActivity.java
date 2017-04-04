package com.example.intentex;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button)findViewById(R.id.btn01);
        button2 = (Button)findViewById(R.id.btn02);
        button4 = (Button)findViewById(R.id.btn04);
        button5 = (Button)findViewById(R.id.btn05);
        button6 = (Button)findViewById(R.id.btn06);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent (Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
//                startActivity(intent);

                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent (Intent.ACTION_VIEW, Uri.parse("tel:6474583717"));
//                startActivity(intent);

                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:01068647370"));
                startActivity(intent);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent (getApplicationContext(),Newactivity.class);
//
//                intent.putExtra("loginName","dhormfjsid");
//
//                Student.name="Mike";
//                Student.age=10;
//
//                startActivityForResult(intent,1);

                Intent intent = new Intent(getApplicationContext(),Newactivity.class);

                intent.putExtra("loginName","Ryan");
                Student.name="Mike";
                Student.age=10;

                startActivityForResult(intent,1);

            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

//        String name= data.getStringExtra("Return");
//        Toast.makeText(getApplicationContext(),"다시 받은 값 :" + name ,Toast.LENGTH_LONG).show();
      String name = data.getStringExtra("Return");
        Toast.makeText(getApplicationContext(),"다시 받은 값: "+name,Toast.LENGTH_LONG).show();


    }
}
