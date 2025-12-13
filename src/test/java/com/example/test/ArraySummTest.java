package com.example.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraySummTest {
    private ArraySumm arr;
    @BeforeEach
    public void SetUp(){
        arr = new ArraySumm();
    }
    @Test
    public void testcongmanggiatritaibienduoi(){
        assertEquals(0,arr.sum(new int[]{0,0}));
    }
    @Test
    public void testcongmanggiatritaibientren(){
        assertEquals(4000,arr.sum(new int[]{2000,2000}));
    }

}