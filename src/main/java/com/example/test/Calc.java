package com.example.test;

public class Calc {
    public int Sum(int a, int b){return a + b;}
    public int divide(int a, int b){
        if(b == 0){
            throw new ArithmeticException("So chia phai khac 0");
        }else {
            return a/b;
        }
    }
    public int minus(int a, int b){
        return  a - b;
    }
    public int multi(int a, int b){
        return a*b;
    }
}
