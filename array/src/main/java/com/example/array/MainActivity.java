package com.example.array;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MainActivity extends AppCompatActivity {
    //String [] names = new String[5];

    String [] names = {"영희","철수","도리","니모","아아"};

    //Person person;
    //Person[] persons = new Person[5]; Arry사용
    ArrayList<Person> perons = new ArrayList<Person> (); //크기를 늘릴수 있는 arrylist 사용 ,person 형식만 받겠다

    //String [][] phonbook = new Person[2][5]; 2차원 배열
     //ArrayList<ArrayList<String>>phonebook = new ArrayList<ArrayList<String>>();
    HashMap<String,ArrayList<String>> phonebook = new HashMap<String, ArrayList<String>>();//key와 value값을 이용
    int count =0;
    TextView textview;
    LinearLayout linearLayout;
    Spinner spinner;
    String[] groups = {"친구","가족"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        textview=(TextView)findViewById(R.id.text);
        linearLayout=(LinearLayout)findViewById(R.id.container);
        spinner=(Spinner)findViewById(R.id.spinner);

        //안드로이드에서 스피너를 사용할떄 쓰는방법
        ArrayAdapter<String> adpater = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,groups);
        adpater.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinner.setAdapter(adpater);

        //화면에 스피너 화면을 보여주는것
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
                    nameTextview.setTextSize(50.0f);
                    nameTextview.setTextColor(Color.BLUE);

                    linearLayout.addView(nameTextview);
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



//        String friends[] = {"철수","영희","수지","뿡치","꽁치"};
//        phonbook[0] = friends;


        ArrayList<String> friends = new ArrayList<String>();
        friends.add("철수");
        friends.add("영희");
        friends.add("수로");
        friends.add("수리");
        friends.add("수고");
        phonebook.put("친구", friends);


//
//        String familly[] = {"할아버지","할머니","아버지","어머니","꽁치"};
//        phonbook[1] = familly;


        ArrayList<String> familly = new ArrayList<String>();
        familly.add("할아버지");
        familly.add("할머니");
        familly.add("아버지");
        familly.add("어머니");
        familly.add("유리");
        phonebook.put("가족", familly);


       Set<String> keys = phonebook.keySet();
        Iterator<String> iter = keys.iterator();
        while(iter.hasNext()) {
            String key=iter.next();
            System.out.println(key);// 순서없이 가족과 친구가 순서대로 나온다

        }
//      for(int i =0; i <phonebook.size();i++){
//          ArrayList<String> group  = phonebook.get(i);
//
//            for(int j=0; j<group.size();j++){
//                System.out.println(group.get(j));
//            }
//
//          Iterator<Person> iter = perons.iterator();
//          int v = 0;
//          while(iter.hasNext()){ //다음것이 있느냐 없느냐 체크
//              Person curPerson  = iter.next();
//              System.out.println("이름" +v +" : "+curPerson.getName());
//              v++;
//          }
//        }

        Button button=(Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //String name= "";
//
//                //배열의 크기를 늘려주는것 (ArryList를 사용해서 이 코드가 필요가없음
//                if(count >=persons.length){
//                    Person[] tempPerson = new Person[persons.length+5];
//                    System.arraycopy(persons,0,tempPerson,0,persons.length);
//                    persons = tempPerson;
//                }
                int nameIndex = count % 5;
               Person aperson = new Person(names[nameIndex]);
                perons.add(aperson);
                Toast.makeText(getApplicationContext(), "사람" + names[nameIndex] + "가 만들어졌습니다", Toast.LENGTH_LONG).show();

                count++;

                textview.setText(count + "명");

//                if (count<names.length) {
//                    persons[count] = new Person(names[count]);
                  //  Toast.makeText(getApplicationContext(), "사람" + names[count] + "가 만들어졌습니다", Toast.LENGTH_LONG).show();
//                }else{
//                    Toast.makeText(getApplicationContext(), "사람 이름이 없습니다", Toast.LENGTH_LONG).show();
//
//                }



                //리니어 레이아웃 파트
                TextView nameTextview = new TextView(getApplicationContext());
                nameTextview.setText(names[nameIndex]);
                nameTextview.setTextSize(50.0f);
                nameTextview.setTextColor(Color.BLUE);

                linearLayout.addView(nameTextview);


                for(int i =0; i<names.length;i++){
                    System.out.println("이름 #"+i+" : "+names[i]);


                }

//                if(count==0){
//                    name = names[0];
//                    person = new Person(name);
//                }else if(count==1){
//                    name = names[1];
//                    person = new Person(name);
//                }else if(count==2){
//                    name = names[2];
//                    person = new Person(name);
//                }else if(count==3){
//                    name = names[3];
//                    person = new Person(name);
//                }else if(count==4){
//                    name = names[4];
//                    person = new Person(name);
//                }


            }
        });

    }
}
