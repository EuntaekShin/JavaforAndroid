package com.example.arrayex1;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

/**
 * Created by user on 2017-03-06.
 */


public class MainActivity2 extends AppCompatActivity {

     String[] names = {"철수","영희","라라","민","신"};

   // String [] names = new String[5];
//    Person [] persons = new Person[5];

    Person[] persons = new Person[5];

    int count =0;

    TextView textview;
    LinearLayout linearLayout;
    ScrollView scrollView;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



//        names[0] ="김유리 힘내세요";
//        names[1] ="기회는 찾아옵니다";
//        names[2] ="휴식이라고 생각하세요";
//        names[3] ="기도하시고";
//        names[4] ="오늘도 화이팅!";

        linearLayout =(LinearLayout)findViewById(R.id.linear);

        textview = (TextView)findViewById(R.id.txt1);
        button = (Button)findViewById(R.id.btn01);
        scrollView =(ScrollView)findViewById(R.id.scrollview) ;

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


//                if(count >= persons.length) {
//                    Person[] tempPerson = new Person[persons.length+5];
//                    System.arraycopy(persons, 0, tempPerson, 0, persons.length);
//                   // persons[count] = new Person(names[count]);
//                    persons = tempPerson;
//                 }

                if(count>=persons.length){
                    Person[] tempPerson = new Person[persons.length+5];
                    System.arraycopy(persons,0,tempPerson,0,persons.length);
                    persons = tempPerson;
                }

                 int nameIndex = count % 5;
                 persons[count] = new Person(names[nameIndex]);
                Toast.makeText(getApplicationContext(),names[nameIndex] ,Toast.LENGTH_LONG ).show();

                count++;
                textview.setText("Clicked" + count);



                //리니어 레이아웃 파트(textview 추가)
                TextView nameTextview = new TextView(getApplicationContext());
                nameTextview.setText(names[nameIndex]);
                nameTextview.setTextSize(50.0f);
                nameTextview.setTextColor(Color.BLUE);

                linearLayout.addView(nameTextview);


                for(int i =0; i<names.length;i++){
                    System.out.println("이름 #"+i+" : "+names[i]);


                }


//                for(int i=0; i<count; i++){
//                    System.out.println(i+" : "+persons[i].getName());
//                }

            }
        });





    }
}
