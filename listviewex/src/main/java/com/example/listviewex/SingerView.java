package com.example.listviewex;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by user on 2017-03-10.
 */
//infaltion 과정(큰뷰는 activity 에서 자동관리하지만 안의 뷰들은 inflater과정을 거쳐야한다
public class SingerView extends LinearLayout {
    TextView textview;
    TextView textview2;
    ImageView imageview;

    public SingerView(Context context) {
        super(context);
        init(context);

    }

    public SingerView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public void init(Context context){
        //인플레이터 만드는과정
        LayoutInflater inflater =(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.singer_item,this,true); //아이템을 붙이는 과정
        //인플레이터 과정을 통해 아이템을 붙인 후에는 일반 뷰처럼 쓸수 있다.
         textview = (TextView) findViewById(R.id.txt01);
        textview2 = (TextView) findViewById(R.id.txt02);
        imageview =(ImageView)findViewById(R.id.image);

    }
    public void setName(String name){
        textview.setText(name);
    }

    public void setAge(String age){
        textview2.setText(age);
    }
    public void setImage(int resId){
        imageview.setImageResource(resId);
    }
}
