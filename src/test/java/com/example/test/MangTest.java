package com.example.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MangTest {
    private final Mang mang = new Mang();
    private final int[] testArray = {10, 20, 30};
    @Test//index = -1 cận biên dưới - không hợp lệ
    public void Mang_01(){
       assertThrows(IndexOutOfBoundsException.class, () -> {mang.GetElementAtIndex(testArray,-1);});
    }
    @Test// index = 1 phân vùng hợp lệ
    public void Mang_02(){
        assertEquals(20, mang.GetElementAtIndex(testArray, 1));
    }
    @Test// index = 3 cận biên trên - không hợp lệ
    public void Mang_03(){
        assertThrows(IndexOutOfBoundsException.class, () -> {mang.GetElementAtIndex(testArray, 3);});
    }
}