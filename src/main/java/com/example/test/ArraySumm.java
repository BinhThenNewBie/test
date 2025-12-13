package com.example.test;

public class ArraySumm {
    public int sum(int[] arr){
        for(int so : arr){
            if(so < 0 || so > 2000){
                throw new IllegalArgumentException("so phai nam trong khoang tu 0 - 2000");
            }
        }
        if(arr == null){
            throw new IllegalArgumentException("khong duoc de trong mang");
        }
        int sum = 0;
        for(int so : arr){
            sum += so;
        }
        return sum;
    }
}
