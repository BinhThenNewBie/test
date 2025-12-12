package com.example.test;

public class Trungbinhcong {
    public float trungbinh(float toan, float hoa, float ly){
        if(toan < 0 || toan > 10){
            throw new IllegalArgumentException("DIem phai nam trong khoang tu 0 - 10");
        }else if(hoa < 0 || hoa > 10){
            throw new IllegalArgumentException("DIem phai nam trong khoang tu 0 - 10");
        }else if(ly < 0 || ly > 10){
            throw new IllegalArgumentException("DIem phai nam trong khoang tu 0 - 10");
        }
        float avg = 0;
        avg = (toan + hoa + ly) / 3;
        return avg;
    }
}
