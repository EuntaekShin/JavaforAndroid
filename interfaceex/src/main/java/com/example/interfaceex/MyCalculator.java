package com.example.interfaceex;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by user on 2017-03-15.
 */

public class MyCalculator extends CalcAdaper {
    Context Mcontext;

    public MyCalculator(Context mcontext){
        Mcontext = mcontext;
    }


    public int add(int a, int b) {

        Toast.makeText(Mcontext.getApplicationContext(),"김유리 취업축하",Toast.LENGTH_LONG).show();
        int result = a + b;
        addHistory(a,b,CalcData.TYPE_ADD,result);
        return  result;
    }

}
