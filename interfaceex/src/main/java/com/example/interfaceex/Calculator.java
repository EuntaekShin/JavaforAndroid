package com.example.interfaceex;

import java.util.ArrayList;

/**
 * Created by user on 2017-03-15.
 */

public interface Calculator {
    public  void clearHistory();
    public ArrayList<CalcData> getHistory();



    public int add(int a, int b) ; //인터페이스에선 선언부만존재{}불필요
    public int minus(int a, int b) throws UnimplementException ;
    public int multiply(int a, int b) throws UnimplementException ;
    public int divide(int a, int b) throws UnimplementException ;

}
