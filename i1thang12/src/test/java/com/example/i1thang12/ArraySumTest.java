package com.example.i1thang12;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraySumTest {
    private ArraySum arr;
    @BeforeEach
    public void SetUp(){
        arr = new ArraySum();
    }
    @Test
    public void testsumarrhople(){
        assertEquals(15, arr.sumarr(5));
    }
    @Test
    public void testsumarrtaibienduoi(){
        assertEquals(1, arr.sumarr(1));
    }
    @Test
    public void testsumarrtaibientren(){
        assertEquals(55,arr.sumarr(10));
    }
    @Test
    public void testsumarrcanbienduoikhonghople(){
        assertThrows(IllegalArgumentException.class,() -> arr.sumarr(0));
    }
    @Test
    public void testsumarrcanbientrenkhonghople(){
        assertThrows(IllegalArgumentException.class,() -> arr.sumarr(11));
    }
}