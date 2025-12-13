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
    public void testcongmangtaibienduoi(){
        assertEquals(10,arr.sum(new int[]{1,2,3,4,}));
    }

}