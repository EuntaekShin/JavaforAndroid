package com.example.interfaceex;

import java.util.ArrayList;

/**
 * Created by user on 2017-03-16.
 */

public abstract class CalcAdaper implements Calculator {

    public ArrayList<CalcData> history = new ArrayList<CalcData>();

    public void addHistory(int a, int b , int type, int result){
       CalcData data = new CalcData(a,b,type,result);
        history.add(data);
    }

    public  void clearHistory(){
        history.clear();
    }
    public ArrayList<CalcData> getHistory(){
        return  history;
    }



    public abstract int add(int a, int b);

    @Override
    public int minus(int a, int b) throws UnimplementException {
        throw new UnimplementException("빼기 구현 안됨");
    }

    @Override
    public int multiply(int a, int b) throws UnimplementException {
        throw new UnimplementException("빼기 구현 안됨");
    }

    @Override
    public int divide(int a, int b) throws UnimplementException {
        throw new UnimplementException("빼기 구현 안됨");
    }
}
