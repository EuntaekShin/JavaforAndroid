package com.example.listviewex;

/*
리스트뷰를 만드는 이유?
리니어 레이아웃을 스크롤 뷰로 감쌀때에도 똑같은 효과를 볼 수 있지만,
리스트뷰를 이용하면 하나의 뷰로 리스트를 관리 할수 있다.

선택위젯이란?
리스트뷰의 내의 여러개의 아이템을 하나 고를 수 있는 선택위젯

이러한 선택위젯들은 아답터(interface, abstract)를 써야한다.

어뎁터란?
데이터를 관리하고 아이템의 뷰도 만들어준다.

 */

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listview;

    //2-1 이름이외의 데이터 설정
    String[] ages ={"22","23","24","25","26"};
    //4.어뎁터라는것은 여러 데이터를 관리한다
    String[] names = {"아이유","소녀시대","원더걸스","엑시드","티아라"};

    int[] resId ={R.drawable.face01,R.drawable.face02,R.drawable.face03,R.drawable.face04,R.drawable.face05};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //1
        listview =(ListView)findViewById(R.id.listview);
        //8 MY어뎁터 뷰를 리스트뷰에 설정
        MyAdapter adapter = new MyAdapter();

        for(int i=0; i<names.length; i++ ){
            adapter.addItem(new SingerItem(names[i],ages[i],resId[i]));
        }


        listview.setAdapter(adapter);
        //9. adpatter클래스를 만들지않고 만드는방법(단점은 글자의 속성이나 기본 리스트뷰만 볼수 있다)
//        String[] names = {"아이유","소녀시대","원더걸스","EXID","티아라"};
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,names);
//        listview.setAdapter(adapter);

    }

    //2 클래스안에 내부아뎁터 만들기(미리 만들어져 있는 baseAdapter상속)
    class MyAdapter extends BaseAdapter{



        //아이템을 담을수 있는 틀을 apdater안에 설정
        ArrayList<SingerItem> items =  new ArrayList<SingerItem>();

        //item에 추가
        public void addItem(SingerItem item){
            items.add(item);
        }




        @Override
        public int getCount() {//5.첫번째론 어뎁터가 어뎁터에 아이템에 몇개 들어있지는 물어본다
            return items.size();
        }

        @Override
        public Object getItem(int position) { //6.갯수가 확인되면 각 아이템에 인덱스를 부여한다
            return items.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        //어뎁터가 아이템 뿐아니라 뷰도 관리 해주었으면 좋겠다
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            SingerView view = new SingerView(getApplicationContext());
            SingerItem item = items.get(position);
//
//          )

            view.setName(item.getName());
            view.setAge(item.getAge());
            view.setImage(item.getResId());



            return view;

           /*
            //2-2 리니어 레이아웃을 만들어준다.
            LinearLayout layout = new LinearLayout(getApplicationContext());
            layout.setOrientation(LinearLayout.VERTICAL);


            //7.뷰객체를 만들어서 리턴
            TextView view = new TextView(getApplicationContext());
            view.setText(names[position]);
            view.setTextSize(40.0f);
            view.setTextColor(Color.BLUE);
            layout.addView(view);


            //2-4복사 복붙

            TextView view2 = new TextView(getApplicationContext());
            view.setText(ages[position]);
            view.setTextSize(20.0f);
            view.setTextColor(Color.RED);
            //2-3 레이아웃에 텍스트뷰를 넣는 과정
            layout.addView(view2);
            */

        }
    }
}
