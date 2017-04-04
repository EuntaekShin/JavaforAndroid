package com.example.arrayex1;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.TypedValue;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by user on 2017-03-06.
 */


public class MainActivity4 extends AppCompatActivity {

    // String[] names = {"철수","영희","라라","민","신"};

    String [] names = new String[5];
   // Person [] persons = new Person[5];
    ArrayList<Person> persons = new ArrayList<Person>();

    int count =0;

    TextView textview;
    LinearLayout linearLayout;
    ScrollView scrollView;
    Button button;
    Button button2;
    String[] groups = {"친구","가족"};
    Spinner spinner;

    HashMap<String,ArrayList<String>> phonebook = new HashMap<String, ArrayList<String>>();//key와 value값을 이용

    //ArrayList<ArrayList<String>> phonebook = new ArrayList<ArrayList<String>>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        names[0] ="김유리 힘내세요";
        names[1] ="기회는 찾아옵니다";
        names[2] ="휴식이라고 생각하세요";
        names[3] ="기도하시고";
        names[4] ="오늘도 화이팅!";



        ArrayList<String> friends = new ArrayList<String>();
        friends.add("철수");
        friends.add("영희");
        friends.add("민희");
        friends.add("수지");
        friends.add("지민");

        phonebook.put("친구",friends);

        ArrayList<String> family = new ArrayList<String>();
        family.add("할머니");
        family.add("할아버지");
        family.add("엄마");
        family.add("아빠");
        family.add("동생");

        phonebook.put("가족",family);

        linearLayout =(LinearLayout)findViewById(R.id.linear);
        spinner = (Spinner)findViewById(R.id.spinner);

        textview = (TextView)findViewById(R.id.txt1);
        button = (Button)findViewById(R.id.btn01);
        button2 = (Button)findViewById(R.id.btn02);
        scrollView =(ScrollView)findViewById(R.id.scrollview) ;

        //안드로이드에서 스피너를 사용할떄 쓰는방법
        ArrayAdapter<String> adpater = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,groups);
        adpater.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinner.setAdapter(adpater);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(getApplication(),"선택 " + position,Toast.LENGTH_LONG).show();

                // 누구를 선택했는지 가져오는과정
                String curGroup = groups[position];
                ArrayList<String> nameList = phonebook.get(curGroup);

                linearLayout.removeAllViews();
                for(int i =0; i < nameList.size(); i++) {
                    TextView nameTextview = new TextView(getApplicationContext());
                    nameTextview.setText(nameList.get(i));
                    nameTextview.setTextSize(20.0f);
                    nameTextview.setTextColor(Color.BLUE);

                    linearLayout.addView(nameTextview);
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                int nameIndex = count % 5;
                Person curPerson = new Person(names[nameIndex]);
                persons.add(curPerson);
                Toast.makeText(getApplicationContext(),names[nameIndex] ,Toast.LENGTH_LONG ).show();

                count++;
                textview.setText("Clicked" + count);



                //리니어 레이아웃 파트(textview 추가)

                TextView nameTextview = new TextView(getApplicationContext());
                nameTextview.setText(names[nameIndex]);
                nameTextview.setTextSize(20.0f);
                nameTextview.setTextColor(Color.BLUE);

                linearLayout.addView(nameTextview);


                for(int i =0; i<names.length;i++){
                    System.out.println("이름 #"+i+" : "+names[i]);


                }


            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                EditText editText1 = (EditText) findViewById(R.id.edittxt);
                String curName = editText1.getText().toString();

                Person curPerson = new Person(curName);
                persons.add(curPerson);
                Toast.makeText(getApplicationContext(), "사람 " + curName + "이 만들어졌습니다.", Toast.LENGTH_LONG).show();

                TextView nameTextView = new TextView(getApplicationContext());
                nameTextView.setText(curName);
                nameTextView.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 20);
                nameTextView.setTextColor(Color.BLUE);

                linearLayout.addView(nameTextView);
            }
        });





    }
}
