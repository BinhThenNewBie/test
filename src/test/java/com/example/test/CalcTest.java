package com.example.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {
    private final Calc calc = new Calc();
    //happy case
    @Test // phan vung tuong duong - phan vung hop le
    void sum1(){
        assertEquals(15, calc.Sum(5,10));
    }
    @Test// phan vung tuong duong - hai so am
    void sum2(){
        assertEquals(-15, calc.Sum(-10,-5));
    }
    @Test// phan tich gia tri bien - Bien tren
    void sum3(){
        assertEquals(Integer.MIN_VALUE, calc.Sum(Integer.MAX_VALUE,1));
    }
    @Test// phan tich gia tri bien - Bien duoi
    void sum4(){
        assertEquals(Integer.MIN_VALUE, calc.Sum(Integer.MIN_VALUE,0));
    }
}