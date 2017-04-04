package com.example.listviewex2;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ListView listview1;

    String [] names ={"신","은","택"};

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        listview1 = (ListView)findViewById(R.id.listview1);

        MyAdapter1 adapter12 = new MyAdapter1();
        listview1.setAdapter(adapter12);


    }


  class MyAdapter1 extends BaseAdapter {


        @Override
        public int getCount() {
            return names.length;
        }

        @Override
        public Object getItem(int position) {
            return names[position];
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            TextView view = new TextView(getApplicationContext());
            view.setText(names[position]);
            view.setTextSize(40.0f);
            view.setTextColor(Color.BLUE);


            return view;
        }
    }

}
