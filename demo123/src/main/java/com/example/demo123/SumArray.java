package com.example.demo123;

import java.util.ArrayList;

public class SumArray {
    public int sum(int [] arr){
            if(arr == null){
                throw new IllegalArgumentException("mang khong duoc de trong");
            }
            for(int num : arr){
                if(num < 0 || num > 1000){
                    throw new IllegalArgumentException("Phan tu phai trong khoang tu 0 - 1000");
                }
            }
            int sum = 0;
            for(int num : arr){
                sum += num;
            }
            return sum;
    }
}
