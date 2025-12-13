package com.example.demo123;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumArrayTest {
    private SumArray service;
    @BeforeEach
        void SetUp(){
        service = new SumArray();
    }
    @Test
    public void TestMangHopLe(){
        int[] arr = {1,2,3,4,5,6};
        assertEquals(21,service.sum(arr));
    }
    @Test
    public void TestMangNull(){
        assertThrows(IllegalArgumentException.class,() ->service.sum(null));
    }
    @Test
    public void TestMangAm(){
        assertThrows(IllegalArgumentException.class,() ->service.sum(new int[]{-1,-2,-3,-4}));
    }@Test
    public void TestMangLonHon1000(){
        assertThrows(IllegalArgumentException.class,() ->service.sum(new int[]{1000,2000}));
    }
}