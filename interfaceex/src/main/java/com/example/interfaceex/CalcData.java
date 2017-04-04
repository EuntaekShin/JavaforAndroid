package com.example.interfaceex;

/**
 * Created by user on 2017-03-16.
 */

public class CalcData {
    int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    int b;
    int type;
    int result;

    public static final int TYPE_ADD = 1;
    public static final int TYPE_SUBTRACT = 2;
    public static final int TYPE_MULTIPLY = 3;
    public static final int TYPE_DIVIDE = 4;

    public CalcData(int a, int b, int type, int result) {
        this.a = a;
        this.b = b;
        this.type = type;
        this.result = result;
    }
}
