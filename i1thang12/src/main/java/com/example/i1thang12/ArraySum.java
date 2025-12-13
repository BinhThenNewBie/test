package com.example.i1thang12;

public class ArraySum {
    public int sumarr(int n){
        if(n < 1){
            throw new IllegalArgumentException("n phai nam trong khoang tu 1 - 10");
        }if(n > 10){
            throw new IllegalArgumentException("n phai nam trong khoang tu 1 - 10");
        }
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += i;
        }


        return sum;
    }
}
